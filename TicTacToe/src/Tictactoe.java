import Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tictactoe {

    Deque<Player> players;
    Board board;
    public void initialize() {
        players = new LinkedList<>();
        PlayerX playerX = new PlayerX();
        Player player1=new Player("chabeer", playerX);
        PlayerO playerO=new PlayerO();
        Player player2=new Player("Absal", playerO);
        players.add(player1);
        players.add(player2);
        board=new Board(3);
    }
    public String startGame() {
        boolean noWinner=true;
        while (noWinner) {
            Player playerturn=players.removeFirst();
            List<Pair<Integer, Integer>> freeSpaces = board.getFreecells();
            if(freeSpaces.isEmpty()) { noWinner = false; continue; }
            System.out.println("Player "+playerturn.getPlayername()+"Enter row and column");
            Scanner input = new Scanner(System.in);
            String choice=input.nextLine();
            String[] value=choice.split(",");
            int inputRow = Integer.valueOf(value[0]);
            int inputColumn = Integer.valueOf(value[1]);
            boolean validmove=board.addPiece(playerturn.getPlayingPiece(),inputRow,inputColumn);
            if(!validmove) {
                System.out.println("Invalid input");
                players.addFirst(playerturn);
                continue;
            }
            players.addLast(playerturn);
            if(isThereWinner(inputRow,inputColumn,playerturn.getPlayingPiece()))
            {
                return playerturn.getPlayername();
            }


        }
        return "Tie";

    }

    public boolean isThereWinner(int inputRow, int inputColumn, PlayingPiece playingPiece) {

        boolean rowMatch = true; boolean columnMatch = true; boolean diagonalMatch = true; boolean antiDiagonalMatch = true;
        //need to check in row
//        for(int i=0;i<board.getSize();i++) {
//            if(board.board[row][i] == null || gameBoard.board[row][i].pieceT?ype != pieceType) { rowMatch = false; } } //need to check in column for(int i=0;i<gameBoard.size;i++) { if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) { columnMatch = false; } } //need to check diagonals for(int i=0, j=0; i<gameBoard.size;i++,j++) { if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) { diagonalMatch = false; } } //need to check anti-diagonals for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) { if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) { antiDiagonalMatch = false; } } return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
        return false;
    }
}
