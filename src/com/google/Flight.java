package com.google;

public class Flight<T> {

        private String flightNumber;
    private T airCraft;


//    public Flight(String flightNumber, T airCraft) {
//        this.flightNumber = flightNumber;
//        this.airCraft = airCraft;
//    }


//    public String getAirline() {
//        return flightNumber.substring(0, 2);
//    }
//
//    public int getFlightNumber() {
//        return Integer.parseInt(flightNumber.substring(2));
//    }

    public String getAirCraftModel() {
        return airCraft.getModel();
    }


}

//BA456, LO1592
