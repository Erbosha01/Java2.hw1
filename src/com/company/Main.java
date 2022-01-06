package com.company;

public class Main {

    public static void main(String[] args) {
        CarShowroom beshka = new CarShowroom("Beshka", "5 avenue");
        Car car = new Car("BMW", 2017, 400, Color.BLACK, beshka, "M5", "не знаю");
//        System.out.println("Name: " + car.getName() + "\nYear: " + car.getYear() +
//                "\nSpeed: " + car.getSpeed() + "\nColor: " + car.getColor() +
//                "\nCar showroom: " + car.getCarShowroom().getName() + " " + car.getCarShowroom().getStreet() +
//                "\nModel: " + car.getModel() + "\nCar body: " + car.getCarBody());
        System.out.println(car.printInfo());
        car.makeVoice("BMW ");
        System.out.println("--------------------------");
        CarShowroom benz = new CarShowroom("Benz","Vostok 5");
        Mercedes mers = new Mercedes("Mercedes", 2020, 500, Color.WHITE, benz, "AMG", "I DON'T KNOW", "S class");
//        System.out.println("Name: " + mers.getName() + "\nYear: " + mers.getYear() +
//                "\nSpeed: " + mers.getSpeed() + "\nColor: " + mers.getColor() +
//                "\nCar showroom: " + mers.getCarShowroom().getName() + " " + mers.getCarShowroom().getStreet() +
//                "\nModel: " + mers.getModel() + "\nCar body: " + mers.getCarBody() + "\nClass: " + mers.getCarClass());
        System.out.println(mers.printInfo());
        car.makeVoice();
    }
}
