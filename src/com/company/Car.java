package com.company;

public class Car extends Transport {
    private String model;
    private String carBody;

    public String getModel() {
        return model;
    }

    public String getCarBody() {
        return carBody;
    }

    public Car(String name, int year, int speed, Color color, CarShowroom carShowroom, String model, String carBody) {
        super(name, year, speed, color, carShowroom);
        this.model = model;
        this.carBody = carBody;
    }
    public void makeVoice(String name) {
        System.out.println(name + "Биииииииииииииииииииииииииииип");
    }

     final void makeVoice() {
        System.out.println("Биип биииип");
    }
}
