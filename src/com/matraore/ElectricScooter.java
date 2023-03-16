package com.matraore;

public class ElectricScooter {
    private int currentSpeed;

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public ElectricScooter() {
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
