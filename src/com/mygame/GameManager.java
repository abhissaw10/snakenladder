package com.mygame;

public class GameManager {
    public static void main(String[] args) {
        Game game = GameFactory.createGame(10,2,2,2);

        game.addPlayer(PlayerFactory.createPlayer("Abhishek"));
        game.addPlayer(PlayerFactory.createPlayer("Shami"));

        game.start();
    }
}
