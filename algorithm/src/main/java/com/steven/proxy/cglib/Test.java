package com.steven.proxy.cglib;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/22 21:32
 */
public class Test {
    public static void main(String[] args) {
        Personage personage= (Personage) new PersonInvocation().getInstance(Personage.class);
        personage.bugTicket();

    }
}
