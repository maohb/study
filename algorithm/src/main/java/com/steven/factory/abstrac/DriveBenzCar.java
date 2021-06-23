package com.steven.factory.abstrac;

import com.steven.factory.factorymethod.ICar;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 20:40
 */
public class DriveBenzCar implements IDriveCar {
    @Override
    public void drive() {
        System.out.println("开上奔驰到处溜达");
    }
}
