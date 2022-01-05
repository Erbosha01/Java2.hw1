package com.company;

public class Transport {
    private String name;
    private int year;
    private int speed;
    private Color color;
    private CarShowroom carShowroom;

    public Transport(String name, int year, int speed, Color color, CarShowroom carShowroom) {
        this.name = name;
        this.year = year;
        this.speed = speed;
        this.color = color;
        this.carShowroom = carShowroom;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public CarShowroom getCarShowroom() {
        return carShowroom;
    }
}
