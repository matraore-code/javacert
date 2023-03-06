package com.matraore;

import com.matraore.car.Car;
import com.matraore.car.EngineType;

import java.math.BigDecimal;

public class Main {



    public static void main(String[] args) {
        Car mercedesC50 = new Car();

        mercedesC50.setEngineType(EngineType.ELECTRIC);
        mercedesC50.setPrice(BigDecimal.valueOf(150000));
        mercedesC50.setManufacturer("Mercedes");

        System.out.println(mercedesC50.getManufacturer());
        System.out.println(mercedesC50.getPrice());
        System.out.println(mercedesC50.getEngineType());
    }
}