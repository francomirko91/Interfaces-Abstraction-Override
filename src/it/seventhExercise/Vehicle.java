package it.seventhExercise;

public abstract class Vehicle {

    public String type;
    public int numberOfWheels;

    public void showVehicleDetails() {
        System.out.println("this is a " + type + "and has " + numberOfWheels + "wheels");

    }


    abstract void doVehicleSound();


}
