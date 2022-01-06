package com.company;

public class Mercedes extends Car{
    private String carClass;

    public String getCarClass() {
        return carClass;
    }

    public Mercedes(String name, int year, int speed, Color color, CarShowroom carShowroom, String model, String carBody, String carClass) {
        super(name, year, speed, color, carShowroom, model, carBody);
        this.carClass = carClass;
    }

    @Override
    public void makeVoice(String name) {
        super.makeVoice(name);
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\nClass: " + carClass;
    }
}
