package org.example;


public class Harvester extends Car implements Wiping{

    public Harvester(String mark, String model, Color color, CarType carType, int wheelsCount, FuelType fuelType, GearboxType gearboxType, double engineCapacity) {
        super(mark, model, color, carType, wheelsCount, fuelType, gearboxType, engineCapacity);
    }

    public void setRefuelingStation(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void fuel(double litres) {
        if (fuelType.equals(FuelType.Diesel)) {
            fuelLevel += litres;
            System.out.println("Машина заправлена, в баке: " + fuelLevel + " литров");
        }
        else {
            System.out.println("На этой заправке нет подходящего топлива, езжайте на другую АЗС");
        }

    }

    @Override
    public void maintenance() {

    }

    @Override
    public int gearShifting(int gear) {
        return 0;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу");
    }

    @Override
    public void wipeMirrors() {

    }

    @Override
    public void wipeWindshield() {

    }

    @Override
    public void wipeHeadlights() {

    }

}
