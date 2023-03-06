package com.matraore.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private String manufacturer;
    private BigDecimal price;
    private EngineType engineType;


    public Car() {
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Car(String manufacturer, BigDecimal price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(manufacturer, car.manufacturer) && Objects.equals(price, car.price) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, engineType);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public EngineType getEngineType() {
        return engineType;
    }


}
