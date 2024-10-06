package org.example;

public abstract class Car {

    //region Constructors

    public Car(String make, String model, Color color, CarType carType, int wheelsCount, FuelType fuelType, GearboxType gearboxType, double engineCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.carType = carType;
        this.wheelsCount = wheelsCount;
        this.fuelType = fuelType;
        this.fuelLevel = 0.0;
        this.gearboxType = gearboxType;
        this.engineCapacity = engineCapacity;
        this.engineStatus = false;


    }

    public Car(int wheelsCount, FuelType fuelType, GearboxType gearboxType, double engineCapacity) {
        this.wheelsCount = wheelsCount;
        this.fuelType = fuelType;
        this.fuelLevel = 0.0; // Car starts with an empty tank
        this.gearboxType = gearboxType;
        this.engineCapacity = engineCapacity;
        this.engineStatus = false;
    }


    //endregion

    //region Public Methods

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Car type" + carType);
        System.out.println("Color: " + color);
        System.out.println("Engine capacity" + engineCapacity);
        System.out.println("Fuel Level: " + fuelLevel + " litres");
    }

    public boolean engineStart(){
        if (fuelLevel > 0 & !engineStatus) {
            engineStatus = !engineStatus;
            System.out.println("Двигатель запущен!");
            return engineStatus;
        }
        else {
            System.out.println("Сначала заправьтесь");
        }
        return !engineStatus;
    }

    public boolean engineStop(){
        if (engineStatus){
            engineStatus = !engineStatus;
            System.out.println("Двигатель заглушен");
            return engineStatus;
        }
        else {
            System.out.println("Двигатель уже заглушен");
        }
        return engineStatus;

    }

    public double getFuelConsumption(double engineCapacity) {
        double consumption = engineCapacity/10 * 0.02;
        System.out.println(consumption);
        return consumption;
    }

    // Движение
    public void movement(int km) {

        if (engineStatus){
            if (fuelLevel == 0) {
                System.out.println("Нет топлива, заправьтесь!");

            } else {
                System.out.println("Едем " + km + " километров.");
                fuelLevel -= km * getFuelConsumption((int) this.engineCapacity);
                System.out.println("Осталось: " + fuelLevel + " литров топлива");
            }
        }
        else {
            System.out.println("Сначала запустите двигатель");
        }

    }
    // Обслуживание
    public abstract void maintenance();
    // Переключение передач
    public abstract int gearShifting(int gear);
    // Включение фар
    public abstract boolean switchHeadlights();
    // Включение дворников
    public abstract boolean switchWipers();
    // Подметать улицу
//    public abstract void sweeping();

    // Включение противотуманных фар
    public boolean switchFogLights()  {
        fogLights = !fogLights;
        return fogLights;
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private String make;
    // Модель
    public String model;
    private Color color;
    private CarType carType;
    private int wheelsCount;
    protected FuelType fuelType;
    protected double fuelLevel;
    private GearboxType gearboxType;
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights;
    private double consumption;
    private boolean engineStatus;
    //endregion

    //region Getters and Setters

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isFogLights() {
        return fogLights;
    }

    public void setFogLights(boolean fogLights) {
        this.fogLights = fogLights;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


//endregion
}
