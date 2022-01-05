package com.company;

public class Main {

    public static void main(String[] args) {
        CarShowroom benz = new CarShowroom("kdlkds","lsjdk");
        Car car = new Car("lsdjkl", 23,345,Color.BLACK,benz,"jdslkfd","lsdkjflk");
        System.out.println("Name: " + car.getName() + "\nYear: " + car.getYear() +
                "\nSpeed: " + car.getSpeed() + "\nColor: " + car.getColor() +
                "\nCar showroom: " + car.getCarShowroom().getName() + " " + car.getCarShowroom().getStreet() +
                "\nModel: " + car.getModel() + "\nCar body: " + car.getCarBody());
        System.out.println("--------------------------");
        Mercedes mers = new Mercedes("lsdjkl", 23,345,Color.WHITE,benz,"jdslkfd","lsdkjflk","S class");
        System.out.println("Name: " + mers.getName() + "\nYear: " + mers.getYear() +
                "\nSpeed: " + mers.getSpeed() + "\nColor: " + mers.getColor() +
                "\nCar showroom: " + mers.getCarShowroom().getName() + " " + mers.getCarShowroom().getStreet() +
                "\nModel: " + mers.getModel() + "\nCar body: " + mers.getCarBody() + "\nClass: " + mers.getCarClass());
    }
}
