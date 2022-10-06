package com.mygame;

import java.util.List;

public class Game {


    Board board;
    List<Player> players;
    Status status;

    Dice dice;


    public Game(GameBuilder builder){
        this.board=builder.board;
        this.players=builder.players;
        this.dice=builder.dice;
        this.status=Status.NOT_STARTED;
    }

    void start(){
        boolean winnerFound = false;
        status=Status.STARTED;
        while(true){

            for(Player p : players){
                int val = dice.roll();
                int position = p.position+val;
                int end = board.isStart(position);
                if(end!=-1){
                    position=end;
                }
                if(end == board.size){
                    end();
                    System.out.println(" Winner is "+p.name);
                    winnerFound=true;
                    break;
                }

                /*end = board.isStart(position);
                if(end!=-1){
                    position=end;
                }*/
                p.move(position);

            }
            if(winnerFound){
                break;
            }
        }
    }

    void end(){
        status=Status.ENDED;
    }

}
