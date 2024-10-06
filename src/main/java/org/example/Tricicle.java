package org.example;

public class Tricicle extends Car {

    private Refueling refueling;

    public Tricicle(int wheelsCount, FuelType fuelType, GearboxType gearboxType, double engineCapacity) {
        super(wheelsCount, fuelType, gearboxType, engineCapacity);
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

    public void setRefuelingStation(Refueling refueling) {
        this.refueling = refueling;
    }

    public void fuel(double litres) {
        if (fuelType.equals(FuelType.Gasoline)) {
            fuelLevel += litres;
            System.out.println("Машина заправлена, в баке: " + fuelLevel + " литров");
        }
        else {
            System.out.println("На этой заправке нет подходящего топлива, езжайте на другую АЗС");
        }

    }

}
