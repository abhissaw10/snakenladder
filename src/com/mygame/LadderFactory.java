package com.mygame;

public class LadderFactory {
    public static Ladder createLadder(int start,int end){
        return new Ladder(start,end);
    }
}
