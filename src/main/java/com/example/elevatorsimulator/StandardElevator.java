package com.example.elevatorsimulator;

import java.util.Random;
public class StandardElevator extends Elevator{
    private final int maxFloor;

    // Constructor
    public StandardElevator(int maxFloor) {
        super(10);
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
        System.out.println("Standard Elevator in Motion");
    }

    //Method to implement Standard Elevator Movement
    @Override
    public int move() {
        // Implement movement logic for standard elevator (random movement)
        Random rand = new Random();
        currentFloor = 1;
        if (rand.nextBoolean()) {
            currentFloor = Math.min(currentFloor + 1, maxFloor);
            return currentFloor;
            // Assuming 10 floors
        } else {
            currentFloor = Math.max(currentFloor - 1, 1);
            return currentFloor;
        }

    }


}
