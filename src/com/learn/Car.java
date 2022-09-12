package com.learn;

public class Car {
    private String name;
    private String brand;
    final private int year = 2022; // can't set year and only get

    //All Argument constructor
    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    // no Argument constructor
    public Car() {
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
