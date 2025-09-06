import Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tictactoe {

    Deque<Player> players;
    int a;
    Board board;
    public void initialize() {
        players = new LinkedList<>();
        PlayerX playerX = new PlayerX();
        Player player1=new Player("chabeer", playerX);
        PlayerO playerO=new PlayerO();
        Player player2=new Player("Absal", playerO);
        players.add(player1);
        players.add(player2);
        a=5;
        board=new Board(3);
    }
    public String startGame() {
        boolean noWinner=true;
        System.out.println("Welcome to Tic-Tac-Toe"+a);
        while (noWinner) {
            Player playerturn=players.removeFirst();
            List<Pair<Integer, Integer>> freeSpaces = board.getFreecells();
            if(freeSpaces.isEmpty()) { noWinner = false; continue; }

            board.displayBoard();
            System.out.println("Player "+playerturn.getPlayername()+"Enter row and column");

            Scanner input = new Scanner(System.in);
            String choice=input.nextLine();
            String[] value=choice.split(",");
            try {
                int inputRow = Integer.valueOf(value[0]);
                int inputColumn = Integer.valueOf(value[1]);

                boolean validmove = board.addPiece(playerturn.getPlayingPiece(), inputRow, inputColumn);
                if (!validmove) {
                    System.out.println("Invalid input");
                    players.addFirst(playerturn);
                    continue;
                }
                players.addLast(playerturn);
                if (isThereWinner(inputRow, inputColumn, playerturn.getPlayingPiece())) {
                    return playerturn.getPlayername();
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input");
                players.addFirst(playerturn);
                continue;
            }


        }
        return "Tie";

    }

    public boolean isThereWinner(int inputRow, int inputColumn, PlayingPiece playingPiece) {

        boolean rowMatch = true; boolean columnMatch = true; boolean diagonalMatch = true; boolean antiDiagonalMatch = true;
        //need to check in row
        for(int col=0;col<3;col++) {
            if(board.getBoard()[inputRow][col]==null||board.getBoard()[inputRow][col]!=playingPiece) {
                rowMatch = false;
            }
        }
        for(int row=0;row<3;row++) {
            if (board.getBoard()[row][inputColumn] == null || board.getBoard()[row][inputColumn] != playingPiece) {
                columnMatch = false;
            }
        }
            //need to check diagonals
            for(int i=0, j=0; i<board.getSize();i++,j++) {
                if (board.getBoard()[i][j] == null || board.getBoard()[i][j]!= playingPiece) { diagonalMatch = false; } }
            //need to check anti-diagonals
            for(int i=0, j=board.getSize()-1; i<board.getSize();i++,j--) {
                if (board.getBoard()[i][j] == null || board.getBoard()[i][j] != playingPiece) { antiDiagonalMatch = false; } }
            return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}
