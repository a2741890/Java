package com.company;

import javax.sound.midi.Soundbank;

public class Vehicle {
    private String whereToUse;
    private int theHighestSpeed;
    private int theUsualCapacity;
    private String theConsumptionOfFuel;

    //要先建立能將參數initialization初始化的Constructors
    public Vehicle(String whereToUse, int theHighestSpeed, int theUsualCapacity, String theConsumptionOfFuel) {
        this.whereToUse = whereToUse;
        this.theHighestSpeed = theHighestSpeed;
        this.theUsualCapacity = theUsualCapacity;
        this.theConsumptionOfFuel = theConsumptionOfFuel;
    }

    public void wheretouse(String whereToUse){
        System.out.println("This vehicle is used in " + whereToUse);
    }
    public void thehighestspeed(int theHighestSpeed){
        System.out.println("The highest speed of this vehicle is up to " + theHighestSpeed);
    }
    public void theusualcapacity(int theUsualCapacity){
        System.out.println("This vehicle is able to afford " + theUsualCapacity + " people.");
    }
    public void TheConsumptionOfFuel(String theConsumptionOfFuel){
        System.out.println("This vehicle is suggested to consume " + theConsumptionOfFuel);
    }
}
