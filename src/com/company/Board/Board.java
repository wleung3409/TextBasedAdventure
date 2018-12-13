package com.company;

public class Map {
    private String[][] board;
    public Map(String[][][]board) {
        this.board = board;
    }

    public void edit(String str,int row,int col) {
        this.board[row][col] = str;
    }
    public void fill (String str){
        for(int i=0;i<this.board.length;i++){
            for(int n=0;n<this.board[i].length;n++){
                this.board[i][n] = str;
            }
        }

    }
}