package Model;

import java.util.ArrayList;
import java.util.*;

public class Board {
    private int size;
    private PlayingPiece[][] board;
    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public boolean addPiece(PlayingPiece p, int i, int j) {
                if(board[i][j] == null) {
                    board[i][j] = p;
                    return true;
                }

        return false;
    }

    public List<Pair<Integer,Integer>> getFreecells() {
        List<Pair<Integer,Integer>> freecells = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board[i][j] == null) {
                    Pair<Integer, Integer> freecell = new Pair<Integer, Integer>(i, j);
                    freecells.add(freecell);
                }
            }
        }
        return freecells;

    }

    public void displayBoard() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board[i][j] != null) {
                    System.out.print(board[i][j]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
    }


}
