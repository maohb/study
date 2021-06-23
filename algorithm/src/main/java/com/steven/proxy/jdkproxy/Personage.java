package com.steven.proxy.jdkproxy;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/22 17:29
 */
public class Personage implements ITicket {
    @Override
    public void bugTicket() {
        System.out.println("购买周杰伦演唱会门票");
    }
}
