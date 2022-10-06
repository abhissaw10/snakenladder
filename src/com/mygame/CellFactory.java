package com.mygame;

public class CellFactory {
    public static Cell createCell(int x, CellColor color){
        return new Cell(x,color);
    }
}
