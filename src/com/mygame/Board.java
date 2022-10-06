package com.mygame;

import java.util.ArrayList;

public class Board {
    int size=0;
    int snakeCount=0;
    int ladderCount=0;
    //Cell[] cells;
    /*Snake[] snakes;
    Ladder[] ladders;*/
    ArrayList<Commute> snakesOrLadders;
    public Board(int size, int numSnakes, int numLadders, int config){
        this.size=size;
        snakesOrLadders = new ArrayList();
        //ladders = new Ladder[numLadders];
        addSnakesAndLadders(config);
    }


    private void addSnakesAndLadders(int config) {
        if(config==1){
            addLadder(1,5);
            addLadder(4,9);
            addSnake(8,3);
            addSnake(6,2);
        }
    }

    private void addSnakesAndLaddersDefault() {
            addLadder(1,5);
            addLadder(4,9);
            addSnake(8,3);
            addSnake(6,2);
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



   /* int isSnakeStart(int position){
        for(Commute s: snakes){
            if(s.start == position){
                return s.end;
            }
        }
        return -1;
    }

    int isLadderStart(int position){
        for(Commute s: ladders){
            if(s.start == position){
                return s.end;
            }
        }
        return -1;
    }*/
}
