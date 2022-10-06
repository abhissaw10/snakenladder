package com.mygame;

import java.util.List;

public class GameFactory {
    public static Game createGame(List<String> players){
        List<Player> playersList = players.stream().map(s -> PlayerFactory.createPlayer(s)).toList();
        return new GameBuilder()
                .setPlayers(playersList)
                .build();
    }
}
