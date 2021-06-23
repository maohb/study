package com.steven.singleton;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 22:01
 */
public class DoubleCheckLazySingleton {
    private DoubleCheckLazySingleton() {
    }

    /**
     *
     * 优点：线程安全
     * 缺点：可读性太差
    */
    private volatile static DoubleCheckLazySingleton instance;

    public static DoubleCheckLazySingleton getInstance(){
        //第一次检查拦截大部分对象创建请求
        if(instance==null){
            synchronized (DoubleCheckLazySingleton.class) {
                //第二次检查是否需要创建对象
                if(instance==null){
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
