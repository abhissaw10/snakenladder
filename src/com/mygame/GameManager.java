package com.mygame;

import java.util.List;

public class GameManager {
    public static void main(String[] args) {
        Game game = GameFactory.createGame(List.of("Abhishek","Shami"));
        game.start();
    }
}
