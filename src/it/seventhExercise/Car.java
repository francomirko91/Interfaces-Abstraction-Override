package it.seventhExercise;

public class Car extends Vehicle {


    public int numberOfDoors;
    public double carPrice;


    @Override
    void doVehicleSound() {
        System.out.println("Brrruuuuuuuuum");

    }

    @Override
    public void showVehicleDetails() {
        System.out.println("This is a " + type + " and has " + numberOfWheels + " wheels");
        System.out.println("This car has " + numberOfDoors + " doors");

    }

     public Car(int wheels,int doors,int price) {
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
        this.type = "Ferrari";


    }


}
