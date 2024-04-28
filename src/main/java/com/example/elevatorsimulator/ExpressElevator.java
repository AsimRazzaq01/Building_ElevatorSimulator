package com.example.elevatorsimulator;
import java.util.Random;

public class ExpressElevator extends Elevator {

    private final int maxFloor;
    // Constructor
    public ExpressElevator(int maxFloor) {
        super(8);
        this.maxFloor = maxFloor;
    }

    // Implementation of abstract method getMaxFloor()
    @Override
    protected int getMaxFloor() {
        return maxFloor;
    }

    //Polymorphism
    @Override
    public void canMove() {
        System.out.println("Express Elevator in Motion");
    }

    //Method to implement Express Elevator Movement
    @Override
    public int moveEXP() {
        // Implement movement logic for express elevator (random movement)
        currentFloor=1;
        Random rand = new Random();
        if (rand.nextBoolean()) {
            currentFloor = Math.min(currentFloor + 3, maxFloor); // Assuming 10 floors and express elevator moves 3 floors at a time
            return currentFloor ;
        } else {
            currentFloor = Math.max(currentFloor - 3, 1);
            return currentFloor ;
        }
    }



}
