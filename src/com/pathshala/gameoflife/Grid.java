package com.pathshala.gameoflife;


import java.util.ArrayList;
import java.util.HashMap;

public class Grid {
    private HashMap<ArrayList<Integer>, Boolean> gridOfLife = new HashMap<ArrayList<Integer>, Boolean>();


    public void addLivingCell(int xCoordinate, int yCoordinate) {
        ArrayList<Integer> coordinates = new ArrayList<Integer>();
        coordinates.add(0, xCoordinate);
        coordinates.add(1, yCoordinate);
          gridOfLife.put(coordinates, true);
    }

    public void killCell(int xCoordinate, int yCoordinate) {
        ArrayList<Integer> coordinates = new ArrayList<Integer>();
        coordinates.add(0, xCoordinate);
        coordinates.add(1, yCoordinate);
        gridOfLife.put(coordinates, true);

    }

    public boolean isAlive(int xCoordinate, int yCoordinate) {
        ArrayList<Integer> coordinates = new ArrayList<Integer>();
        coordinates.add(0, xCoordinate);
        coordinates.add(1, yCoordinate);
        return gridOfLife.get(coordinates);
    }
}
