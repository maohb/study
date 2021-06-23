package com.steven.factory.factorymethod;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 21:20
 */
public class BMWCarFactory implements ICarFactory{
    @Override
    public ICar createCar() {
        return new BMWCar();
    }
}
