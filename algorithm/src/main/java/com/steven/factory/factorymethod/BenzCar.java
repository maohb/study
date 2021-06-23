package com.steven.factory.factorymethod;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 20:40
 */
public class BenzCar implements ICar {
    @Override
    public void drive() {
        System.out.println("开上奔驰到处溜达");
    }
}
