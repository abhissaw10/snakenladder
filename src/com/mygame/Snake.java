package com.mygame;

public class Snake implements Commute{
    int start;
    int end;

    public Snake(int start, int end) {
        if(start>=end){
            this.start=start;
            this.end=end;
        }else{
            System.out.println("Error");
        }
    }

    @Override
    public int getEnd(int s) {
        return 0;
    }
}
