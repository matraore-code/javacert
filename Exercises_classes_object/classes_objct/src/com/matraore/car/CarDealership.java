package com.matraore.car;

import java.util.Arrays;
import java.util.Objects;

public class CarDealership {
    private String name;
    private int numberMaxCar;
    private int[] numberCarInStock = new int[numberMaxCar];

    public CarDealership(String name, int numberMaxCar, int[] numberCarInStock) {
        this.name = name;
        this.numberMaxCar = numberMaxCar;
        this.numberCarInStock = numberCarInStock;
    }

    public CarDealership() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberMaxCar() {
        return numberMaxCar;
    }

    public void setNumberMaxCar(int numberMaxCar) {
        this.numberMaxCar = numberMaxCar;
    }

    public int[] getNumberCarInStock() {
        return numberCarInStock;
    }

    public void setNumberCarInStock(int[] numberCarInStock) {
        this.numberCarInStock = numberCarInStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return numberMaxCar == that.numberMaxCar && Objects.equals(name, that.name) && Arrays.equals(numberCarInStock, that.numberCarInStock);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, numberMaxCar);
        result = 31 * result + Arrays.hashCode(numberCarInStock);
        return result;
    }



}
