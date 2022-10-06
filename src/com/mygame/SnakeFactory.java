package com.mygame;

public class SnakeFactory {
    public static Snake createSnake(int start,int end){
        return new Snake(start,end);
    }
}
