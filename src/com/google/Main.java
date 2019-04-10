package com.google;

public class Main {

    public static void main(String[] args) {

        AirBusA319 airBusA319 = new AirBusA319();
        Flight f1 = new Flight("LO12345", airBusA319);

        System.out.println("AirBus:");
        System.out.println("Nazwa linii: " + f1.getAirLine());
        System.out.println("Numer lotu: " + f1.getFlightNumber());
        System.out.println("Model samolotu: " + f1.getAirCraftModel());
        System.out.println("Liczba siedzeń: " + f1.getNumberOfSeats());
        System.out.println("Plan samolotu: " + "\n" +f1.getPlanOfSeats());

        System.out.println();

        Boeing777 boeing777 = new Boeing777();
        Flight f2 = new Flight("LO2568", boeing777);

        System.out.println("Boeing:");
        System.out.println("Nazwa linii: " + f2.getAirLine());
        System.out.println("Numer lotu: " + f2.getFlightNumber());
        System.out.println("Model samolotu: " + f2.getAirCraftModel());
        System.out.println("Liczba siedzeń: " + f2.getNumberOfSeats());
        System.out.println("Plan samolotu: " + "\n" + f2.getPlanOfSeats());
    }
}
