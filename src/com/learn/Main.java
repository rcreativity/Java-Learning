package com.learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.printf("Learn it again");
        System.out.println("Prints next line");

        // with no Arg constructor
        Car nanoCar = new Car();
        nanoCar.setName("Nano Car");
        nanoCar.setBrand("TATA");

        System.out.println("Result "+  nanoCar.toString());
        System.out.println("Result "+  nanoCar.getName());
        System.out.println("Result "+  nanoCar.getBrand());
        System.out.println("Result "+  nanoCar.getYear());

        // with All Arg constructor
        Car suzukiCar = new Car("Suzuki", "Maruthi");
        System.out.println("Result "+  suzukiCar.toString());
        System.out.println("Result "+  suzukiCar.getName());
        System.out.println("Result "+  suzukiCar.getBrand());
        System.out.println("Result "+  suzukiCar.getYear());


    }
}
