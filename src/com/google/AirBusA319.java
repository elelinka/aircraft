package com.google;

import java.util.*;

public class AirBusA319 extends AirCraft{

    public String getModel() {
      return "AirBusA319";
    }

    public Map<String, List> seatingPlan() {
        ArrayList<Integer> rows = new ArrayList<Integer>(24);
        ArrayList<String> seats = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));

        Map<String, List> mapOfList = new HashMap<String, List>();

        mapOfList.put("rows", rows);
        mapOfList.put("sets", seats);

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