package com.steven.singleton;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 22:01
 */
public class LazySingleton {
    private LazySingleton() {
    }

    /**
     *
     * 优点：避免了资源浪费
     * 缺点：在高并发场景下存在线程安全问题
     * 运行结果：
     *      1、同一个实例正常顺序执行，后则覆盖前者
     *      2、不同实例创建不同对象
    */
    private static LazySingleton instance;

    public static LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
