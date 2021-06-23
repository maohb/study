package com.steven.factory.abstrac;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/22 00:18
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new BMWCarFactory();
        factory.createDrice().drive();
        factory.createWash().wash();
    }
}
