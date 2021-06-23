package com.steven.proxy.staticproxy;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/22 17:38
 */
public class Test {
    public static void main(String[] args) {
        //将实例传给代理类
        ITicket ticket = new Scalper(new Personage());
        ticket.bugTicket();
    }
}
