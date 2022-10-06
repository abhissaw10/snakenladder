package com.mygame;

public class Player {
    int position;
    String name;

    public Player(String name) {
        this.name=name;
    }

    int rollDice(Dice d){
        return d.roll();
    }

    void move(int end){
        position=end;
    }
}
