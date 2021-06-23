package com.steven.factory.simplefactory.reflex;


/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 20:37
 */
public class CarFactory {

    public static ICar createCar(String ClassName){

        try {
            return (ICar) Class.forName(ClassName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
