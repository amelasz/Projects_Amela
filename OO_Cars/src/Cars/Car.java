package Cars;

import jdk.jshell.spi.ExecutionControl; --

import java.sql.SQLOutput;

public class Car {
    // Instanz / Gedächtnisvariablen

    // DONT DO THAT LATER
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;
    public int maxFuelAmount;

    public Car(int fuelConsumption, String brand, String serialNumber, String color){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
    }


    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Driving car");
    }

    public void bremsen() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (fuelAmount >= 0.1 * maxFuelAmount)
            System.out.println("SuperBoostMode aktiviert.");
        else
            System.out.println("SuperBoostMode kann nicht aktiviert werden.");

    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; amountOfRepetitions > i; i++) {
            System.out.println("Tuuuut");
        }
    }

    public void getRemainingRange() {
        System.out.println(fuelAmount/fuelConsumption + " Fahrten können gemacht werden.");
        }
    }


