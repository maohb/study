package com.steven.proxy.jdkproxy;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/22 18:16
 */
public class Test {
    public static void main(String[] args) {
        ITicket iTicket = (ITicket) new PersonInvocation().getInstance(new Personage());
        iTicket.bugTicket();
    }
}
