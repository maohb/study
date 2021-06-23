package com.steven.factory.abstrac;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 21:20
 */
public class BenzCarFactory extends AbstractFactory {

    @Override
    protected IDriveCar createDrice() {
        return new DriveBenzCar();
    }

    @Override
    protected IWashCar createWash() {
        return new WashBenzCar();
    }
}
