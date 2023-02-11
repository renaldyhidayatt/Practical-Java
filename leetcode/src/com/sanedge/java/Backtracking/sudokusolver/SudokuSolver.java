package com.sanedge.java.Backtracking.sudokusolver;

import java.util.ArrayList;
import java.util.List;

class Position{
    int x;
    int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class SudokuSolver {
    public void solveSudoku(char[][] board){
        List<Position> pos = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if (board[i][j] == '.') {
                    pos.add(new Position(i, j));
                }
            }
        }
        boolean[] find = new boolean[1];

        putSudoku(board, pos, 0, find);
    }

    public void putSudoku(char[][] board, List<Position> pos, int index, boolean[]succ ){
        if(succ[0] == true){
            return;
        }

        if(index == pos.size()){
            succ[0] = true;
            return;
        }

        for(int i = 1; i <= 9; i++){
            if(checkSudoku(board, pos.get(index), i) && !succ[0]){
                board[pos.get(index).x][pos.get(index).y] = (char)(i + '0');
                putSudoku(board, pos, index + 1, succ);
                if (succ[0] == true) {
                    return;
                }
                board[pos.get(index).x][pos.get(index).y] = '.';
            }
        }
    }

    public boolean checkSudoku(char[][] board, Position position, int val){
        for(int i = 0; i <board[0].length; i ++){
            if (board[position.x][i] != '.' && board[position.x][i] - '0' == val) {
                return false;
            }
        }

        for(int i = 0; i < board.length; i++){
            if (board[i][position.y] != '.' && board[i][position.y] - '0' == val) {
                return false;
            }
        }

        int x = position.x - position.x % 3;
        int y = position.y - position.y % 3;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (board[i][j] != '.' && board[i][j] - '0' == val) {
                    return false;
                }
            }
        }
        return true;
    }
}
