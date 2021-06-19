package com.steven.study.jvm01;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/05/17 22:21
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        Class<? extends List> clazz = list.getClass();
        Method method=clazz.getDeclaredMethod("remove", Object.class);
        method.invoke(list, 1);
        System.out.println(list);


    }
}
