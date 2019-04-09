package com.google;

public class GenericType<AirBusA319, Boeing77> {

    private AirBusA319 airCraft;
    private Boeing77 airCraftBoeing;

    public GenericType(AirBusA319 airCraft, Boeing77 airCraftBoeing) {
        this.airCraft = airCraft;
        this.airCraftBoeing = airCraftBoeing;
    }
}
