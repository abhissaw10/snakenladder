package com.mygame;

import java.util.ArrayList;

public class Board {

    Cell[][] cells;

    ArrayList<Commute> snakesOrLadders;

    BoardConfig boardConfig;

    public void createBoard(BoardConfig config){
        boardConfig=config;
        if(config.boardType == 1){
            this.cells=createCells();

        }
        snakesOrLadders = new ArrayList();
        addSnakesAndLadders();
    }

    private Cell[][] createCells() {

        cells = new Cell[10][10];
        int i=0;
        boolean colorBlack=false;
        boolean odd = false;
        for(int j=9;i>=0;i--){
            if(odd) {
                for (int k = 0; k < 9; k++) {
                    cells[j][k] = CellFactory.createCell(++i, colorBlack ? CellColor.BLACK : CellColor.WHITE);
                    colorBlack = !colorBlack;
                }

            }else{
                for(int k=9;k>=0;k--){
                    cells[j][k] = CellFactory.createCell(++i, colorBlack ? CellColor.BLACK : CellColor.WHITE);
                    colorBlack = !colorBlack;
                }
            }
            odd=!odd;

        }
        return cells;
    }

    private void addSnakesAndLadders() {
        if(boardConfig.config==1){
            addLadder(1,5);
            addLadder(4,9);
            addSnake(8,3);
            addSnake(6,2);
        }
    }


    void addSnake(int start, int end){
        Snake s = SnakeFactory.createSnake(start,end);
        snakesOrLadders.add(s);

    }

    void addLadder(int start,int end){
        Ladder l = LadderFactory.createLadder(start,end);
       snakesOrLadders.add(l);
    }
    int isStart(int position){
        for(Commute s: snakesOrLadders){
            int end = s.getEnd(position);
            if( end != -1){
                return end;
            }
        }
        return -1;
    }
}
