package com.mygame;

public class GameFactory {
    public static Game createGame(int size, int snakes,int ladders, int players){
        return new Game(size,snakes,ladders,players);
    }
}
