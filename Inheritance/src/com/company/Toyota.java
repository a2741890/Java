package com.company;

public class Toyota extends Car {
   private String theColor;
   private int theNumberOfDoor;
   private String theExportCountry;
//下面這是Constructor
    public Toyota( String theColor, int theNumberOfDoor, String theExportCountry) {
        super("round", "It needs to change", 150);
        this.theColor = theColor;
        this.theNumberOfDoor = theNumberOfDoor;
        this.theExportCountry = theExportCountry;
    }

    @Override
    public void movingspeed(int speed) {
        System.out.println("The moving speed of Toyota is on the following");
        super.movingspeed(speed);
    }
}
