package com.mygame;

public class PlayerFactory {
    public static Player createPlayer(String name){
        return new Player(name);
    }
}
