package it.seventhExercise;

public class Car extends Vehicle {


    public int numberOfDoors;
    public double carPrice;


    @Override
    void doVehicleSound() {
        System.out.println("brrruuuuuuuuum");

    }

    @Override
    public void showVehicleDetails() {
        System.out.println("this is a " + type + "and has " + numberOfWheels + "wheels");
        System.out.println("this car has " + numberOfDoors);

    }

     public Car(int wheels,int doors,int price) {
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
        this.type = "Ferrari";


    }


}
