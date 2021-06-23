package com.steven.factory.factorymethod;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 21:24
 */
public class Test {
    public static void main(String[] args) {
        ICarFactory carFactory = new BenzCarFactory();
        ICar car = carFactory.createCar();
        car.drive();

        carFactory = new BMWCarFactory();
        car = carFactory.createCar();
        car.drive();
    }
}
