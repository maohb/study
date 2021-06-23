package com.steven.singleton;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 22:59
 */
public enum EnumSingleton {
    /**
     *优点：利用java保证线程安全
     * 缺点：资源浪费
    */
    INSTANCE;
    public static EnumSingleton EnumSingleton(){
        return INSTANCE;
    }
}
