package com.matraore;

public class Car {
    private int currentSpeed;

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Car() {
    }

    public void applyBreaks(int amount) {
        this.currentSpeed -= amount;
    }

    public void move(int amount) {
        this.currentSpeed += amount;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
