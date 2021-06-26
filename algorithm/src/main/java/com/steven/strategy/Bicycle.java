package com.steven.strategy;

import java.util.Iterator;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/24 12:10
 */
public class Bicycle implements IVehicle{

    @Override
    public void goHome() {
        System.out.println("骑自行车回家");
    }
}
