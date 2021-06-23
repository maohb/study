package com.steven.factory.abstrac;


/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 21:20
 */
public class BMWCarFactory extends AbstractFactory {

    @Override
    protected IDriveCar createDrice() {
        return new DriveBMWCar();
    }

    @Override
    protected IWashCar createWash() {
        return new WashBMWCar();
    }
}
