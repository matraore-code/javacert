package com.matraore;

public class Bicycle {
    private int currentSpeed;

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Bicycle() {
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
