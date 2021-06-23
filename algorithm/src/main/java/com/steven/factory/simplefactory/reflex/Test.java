package com.steven.factory.simplefactory.reflex;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 21:07
 */
public class Test {
    public static void main(String[] args) {
        ICar car = CarFactory.createCar("com.steven.factory.simplefactory.reflex.BMWCar");
        car.drive();
    }
}
