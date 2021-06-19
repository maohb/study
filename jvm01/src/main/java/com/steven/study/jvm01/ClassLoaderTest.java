package com.steven.study.jvm01;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @program study
 * @description: 启动类引导器
 * @author: StevenMao
 * @create: 2020/08/25 00:11
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2021,1,6).getDayOfYear());
        System.out.println(ClassLoaderTest.class.getClassLoader());//应用程序类加载器
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent());//扩展类加载器
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getParent());//引导类加载器（启动类加载器）

    }
}
