package com.steven.singleton;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 21:58
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    /**
     *优点：执行效率高，性能高，没有锁开销
     * 缺点：类加载时便创建了对象在某些场景有资源浪费的情况
     *
    */
    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance;
    }
}
