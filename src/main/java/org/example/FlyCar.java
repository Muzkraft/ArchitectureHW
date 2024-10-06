package org.example;

public class FlyCar extends Car{
    public FlyCar(int wheelsCount, FuelType fuelType, GearboxType gearboxType, double engineCapacity) {
        super(wheelsCount, fuelType, gearboxType, engineCapacity);
        setWheelsCount(4);
    }

    public void fly(){
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement(int km) {
        fly();
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
}
