package Cars;

import jdk.jshell.spi.ExecutionControl;

public class Car {
    // Instanz / Gedächtnisvariablen

    // DONT DO THAT LATER
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Driving car");
    }
}
