package com.google;

import java.util.List;
import java.util.Map;

public class Flight {

    private String flightNumber;
    private AirCraft airCraft;


    public Flight(String flightNumber, AirCraft airCraft) {
        this.flightNumber = flightNumber;
        this.airCraft = airCraft;
    }


    public String getAirLine() {
        return flightNumber.substring(0, 2);
    }

    public int getFlightNumber() {
        return Integer.parseInt(flightNumber.substring(2));
    }

    public String getAirCraftModel() {
        return airCraft.getModel();
    }

    public int getNumberOfSeats() {
        return airCraft.getNumSeats();
    }

    public Map<String, List> getPlanOfSeats() {
        return airCraft.seatingPlan();
    }


}

//BA456, LO1592
