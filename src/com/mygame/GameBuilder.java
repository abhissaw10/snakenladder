package com.mygame;

import java.util.List;

public class GameBuilder {

        Board board;
        List<Player> players;
        Dice dice;
        BoardConfig config;

        GameBuilder setBoard(BoardConfig boardConfig){
            Board board1 = new Board();
            board1.createBoard(boardConfig);
            this.board=board1;
            return this;
        }

        GameBuilder setPlayers(List<Player> players){
            this.players = players;
            return this;
        }

        GameBuilder setDice(Dice dice){
            this.dice=dice;
            return this;
        }
        GameBuilder setConfig(BoardConfig config){
            this.config=config;
            return this;
        }
        Game build(){
            return new Game(this);
        }
}
