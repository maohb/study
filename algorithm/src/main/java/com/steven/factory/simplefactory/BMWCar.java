package com.steven.factory.simplefactory;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 20:38
 */
public class BMWCar implements ICar{
    @Override
    public void drive() {
        System.out.println("开上宝马到处溜达");
    }
}
