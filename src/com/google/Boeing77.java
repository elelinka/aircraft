package com.google;

import java.util.*;

public class Boeing77 extends AirCraft{

//    56, A-I

    public String getModel() {
        return "Boeing77";
    }

    public Map<String, List> seatingPlan() {
        ArrayList<Integer> rows = new ArrayList<Integer>(56);
        ArrayList<String> seats = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "K"));

        Map<String, List> mapOfList = new HashMap<String, List>();

        mapOfList.put("rows", rows);
        mapOfList.put("sets", seats);

        return mapOfList;
    }
}
