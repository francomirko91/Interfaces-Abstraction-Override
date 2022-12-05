package it.seventhExercise;

public class Boat extends Vehicle {

    public double maxKnotsSpeed;
    public int boatKilosWeight;


    public Boat(double maxSpeed, int weight) {
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
        this.type = "Siren";

    }


    @Override
    void doVehicleSound() {
        System.out.println("Fiuuuuuuuum");

    }

    void getBoatWeightAndSpeed() {
        System.out.println("The total weight of the boat is " + boatKilosWeight +" kg " +  "and the maximum speed is " + maxKnotsSpeed);

    }
}
