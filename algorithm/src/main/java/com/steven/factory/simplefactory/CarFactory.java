package com.steven.factory.simplefactory;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 20:37
 */
public class CarFactory {

    public static ICar createCar(String car){
        if("BMW".equals(car)){
           return new BMWCar();
        }else if("BENZ".equals(car)){
           return new BenzCar();
        }
        return null;
    }
}
