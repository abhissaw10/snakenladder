package com.mygame;

public class Ladder implements Commute{
    int start;
    int end;

    public Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int getEnd(int start) {
        return 0;
    }
}
