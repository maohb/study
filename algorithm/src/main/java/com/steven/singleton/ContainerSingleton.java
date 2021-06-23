package com.steven.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/21 23:12
 */
public class ContainerSingleton {
    /**
     * 优点：能够创建大量对象
     * 缺点：能被序列化破坏，线程不安全
     *
    */

    private ContainerSingleton(){}

    private static Map<String, Object> map = new ConcurrentHashMap<>();

    public static Object getInstance(String className){
        Object instance = null;
        try {
            if(map.containsKey(className)){
                instance = map.get(className);

            }else {
                instance = Class.forName(className).newInstance();
                map.put(className, instance);
                return instance;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
