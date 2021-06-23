package com.steven.factory.simplefactory;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 20:42
 */
public class Test {
    public static void main(String[] args) {
        ICar car = CarFactory.createCar("BMW");
        car.drive();
    }
}
