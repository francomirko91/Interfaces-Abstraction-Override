package it.seventhExercise;

public class Start {
    public static void main(String[] args) {

        Car car = new Car(4,5,300000);
        car.doVehicleSound();
        car.showVehicleDetails();

        System.out.println("----------------------------------------");


        Boat boat = new Boat(130.5,5000);
        boat.doVehicleSound();
        boat.getBoatWeightAndSpeed();


    }
}
