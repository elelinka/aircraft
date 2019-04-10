package com.google;

import java.util.*;

public class Boeing777 implements AirCraft{

//    56, A-I

    @Override
    public String getModel() {
        return "Boeing777";
    }

    @Override
    public int getNumSeats() {
        return 56 * 10;
    }

    @Override
    public Map<String, List> seatingPlan() {
        ArrayList<Integer> rows = new ArrayList<Integer>(56);
        ArrayList<String> seats = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "J", "K"));

        Map<String, List> mapOfList = new HashMap<String, List>();

        mapOfList.put("rows", rows);
        mapOfList.put("sets", seats);

        return mapOfList;
    }
}
