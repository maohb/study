package com.steven.singleton;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 22:01
 */
public class StaticInnerClassLazySingleton {
    private StaticInnerClassLazySingleton() {
        if(LazyHandle.INSTANCE!=null){
            throw new RuntimeException("不允许反射破坏");
        }
    }

    /**
     *
     * 优点：利用java本身特性，性能高，避免了资源浪费
     * 缺点：
    */

    private static class LazyHandle{
        private static final StaticInnerClassLazySingleton INSTANCE = new StaticInnerClassLazySingleton();
    }

    public static StaticInnerClassLazySingleton getInstance(){
        return LazyHandle.INSTANCE;
    }
}
