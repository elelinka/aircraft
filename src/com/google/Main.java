package com.google;

public class Main {

    public static void main(String[] args) {


        AirBusA319 airBusA319 = new AirBusA319();
        Flight<AirBusA319> f1 = new Flight<>(airBusA319);

        System.out.println("AirBus:");
//        System.out.println(f1.getAirline());
//        System.out.println(f1.getFlightNumber());
        System.out.println(f1.getAirCraftModel());

//        Boeing77 boeing77 = new Boeing77();
//        Flight <Boeing77> f2 = new Flight<Boeing77>("LO12345", boeing77);
//
//        System.out.println("Boeing:");
//        System.out.println(f2.getAirline());
//        System.out.println(f2.getFlightNumber());
//        System.out.println(f2.getAirCraftModel());
    }
}
