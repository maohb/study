package com.steven.factory.abstrac;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 20:40
 */
public class WashBenzCar implements IWashCar {
    @Override
    public void wash() {
        System.out.println("开脏了洗洗车");
    }
}
