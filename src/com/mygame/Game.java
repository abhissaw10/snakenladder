package com.mygame;

public class Game {
    Board board;
    Player[] players;
    Status status;

    Dice dice;

    int actualPlayerCount;


    public Game(int boardSize, int snakeCount, int ladderCount, int playerCount, int config) {
        board = new Board(boardSize,snakeCount,ladderCount,config);
        players = new Player[playerCount];
        status = Status.NOT_STARTED;
        dice = new Dice();
    }

    void addPlayer(Player player){
        players[++actualPlayerCount]=player;
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
