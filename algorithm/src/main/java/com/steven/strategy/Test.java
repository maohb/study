package com.steven.strategy;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/24 12:12
 */
public class Test {
    public static void main(String[] args) {
        ChooseVehicle chooseVehicle = new ChooseVehicle(new Bus());
        chooseVehicle.chooseVehicleGoHome();
        chooseVehicle = new ChooseVehicle(new Bicycle());
        chooseVehicle.chooseVehicleGoHome();
    }
}
