package com.google;

import java.util.*;

public class AirBusA319 implements AirCraft {

    @Override
    public String getModel() {
        return "AirBusA319";
    }

    @Override
    public int getNumSeats() {
        return 24 * 6;
    }

    @Override
    public Map<String, List> seatingPlan() {

        ArrayList<Integer> rows = new ArrayList<Integer>(24);
        ArrayList<String> seats = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));

        for (int i = 1; i <= 24; i++) {
            rows.add(i);
        }

        Map<String, List> mapOfList = new LinkedHashMap<String, List>();

        mapOfList.put("rows", rows);
        mapOfList.put("seats", seats);

        return mapOfList;
    }
}


//1 ABCDEF
//2 ABCDEF
//3 ABCDEF
//4 ABCDEF
//.
//.
//.
//24 ABCDEF