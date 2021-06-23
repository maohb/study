package com.steven.factory.abstrac;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 23:46
 */
public abstract class AbstractFactory {



    protected abstract IDriveCar createDrice();

    protected abstract IWashCar createWash();

}
