package com.mygame;

import java.util.Random;

public class Dice {
    public int roll() {
        Random r = new Random();
        return r.ints(1,6)
                .findFirst()
                .getAsInt();
    }
}
