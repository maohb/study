package com.steven.strategy;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/24 12:09
 */
public class Bus implements IVehicle{
    @Override
    public void goHome() {
        System.out.println("乘坐公交车回家");
    }
}
