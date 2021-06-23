package com.steven.proxy.staticproxy;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/22 17:31
 */
public class Scalper implements ITicket{

    Personage personage=null;

    //构造器注入
    public Scalper(Personage personage) {
        this.personage = personage;
    }

    @Override
    public void bugTicket() {
        System.out.println("让客户交定金进行购票");
        personage.bugTicket();
        System.out.println("购票成功收取尾款");
    }
}
