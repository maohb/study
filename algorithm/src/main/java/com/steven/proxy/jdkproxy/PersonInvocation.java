package com.steven.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/22 18:05
 */
public class PersonInvocation implements InvocationHandler {

    //代理对象
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        /**
         *ClassLoader loader,:指定当前目标对象使用类加载器,获取加载器的方法是固定的
         * Class<?>[] interfaces,:目标对象实现的接口的类型,使用泛型方式确认类型
         * InvocationHandler h:事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
         *
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("选中黄牛公司帮忙代买票，并交押金");
        Object obj=method.invoke(target, args);
        System.out.println("黄牛公司购买成功收取尾款");
        return obj;
    }
}
