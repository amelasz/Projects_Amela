package Cars;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.sql.SQLOutput;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

 /*
    Car c1 = new Car();
    c1.brand = "Benz";
    c1.fuelConsumption = 7;
    c1.serialNumber = "B0001";
    c1.fuelAmount = 70;
    c1.maxFuelAmount = 100;

    Car c2 = new Car();
    c2.brand = "Audi";
    c2.fuelConsumption = 5;
    c2.serialNumber = "A0001";
    c2.fuelAmount = 10;
    c2.maxFuelAmount = 100;

    c2.turboBoost();
    c2.honk(5);
    c2.getRemainingRange();
*/

    Car c3 = new Car( 15, "BMW", "BMW123", "black");

        System.out.println(c3.brand);

    /* System.out.println(c2.fuelAmount);
    c2.drive();
    System.out.println(c2.fuelAmount);
    c2.bremsen();

    System.out.println(c2.serialNumber);
    System.out.println(c1.brand);
    */


/*
        // DONT DONT DONT

        int car1FuelConsumption = 7;
        String car1Brand = "Benz";
        String car1SerialNumber = "B0001";

        int car2FuelConsumption = 5;
        String car2Brand = "Audi";
        String car2SerialNumber = "A0001";



        String[] cars = {"7;Benz;B0001", "5;Audi;A0001"};

        String[] car1 = cars[0].split(regex: ";");

        // DONT DONT DONT

 */
    }
}
