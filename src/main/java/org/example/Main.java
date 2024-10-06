package org.example;

public class Main {
    public static void main(String[] args) {
        Harvester harvester = new Harvester("Газ", "57", Color.Blue, CarType.Pickup, 6, FuelType.Diesel, GearboxType.MT, 150);

        harvester.displayInfo();
        harvester.engineStart();
        harvester.movement(10);
        harvester.setRefuelingStation(FuelType.Gasoline);
        harvester.fuel(60);
        harvester.setRefuelingStation(FuelType.Diesel);
        harvester.fuel(60);
        harvester.engineStart();
        harvester.movement(10);
        harvester.engineStop();
        harvester.engineStop();
        System.out.println();
        Tricicle tricicle = new Tricicle(3, FuelType.Gasoline, GearboxType.AT, 300);
        tricicle.engineStart();
        tricicle.fuel(60);
        tricicle.engineStart();
        tricicle.movement(10);
        System.out.println();
        FlyCar flyCar = new FlyCar(4, FuelType.Gasoline, GearboxType.AT, 200);
        flyCar.engineStart();
        flyCar.movement(100);

    }

    public static double calculateMaintenance(Car car) {
        if (car.getWheelsCount() == 6) {
            return 1500* 6;
        }
        else {
            return 1000*4;
        }
    }
}