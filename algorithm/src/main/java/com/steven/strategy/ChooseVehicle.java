package com.steven.strategy;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/24 12:13
 */
public class ChooseVehicle {

    private IVehicle vehicle;
    public ChooseVehicle(IVehicle vehicle){
        this.vehicle = vehicle;
    }

    public void chooseVehicleGoHome(){
        vehicle.goHome();
    }
}
