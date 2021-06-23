package com.steven.singleton;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 22:01
 */
public class SyncLazySingleton {
    private SyncLazySingleton() {
    }

    /**
     *
     * 优点：线程安全
     * 缺点：锁力度较大，性能较差
    */
    private static SyncLazySingleton instance;

    public synchronized static SyncLazySingleton getInstance(){
        if(instance==null){
            instance = new SyncLazySingleton();
        }
        return instance;
    }
}
