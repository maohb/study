package com.steven.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/06/22 18:05
 */
public class PersonInvocation implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("选则黄牛公司帮忙代买票，并交押金");
        Object obj=methodProxy.invokeSuper(o, objects);
        System.out.println("黄牛公司购买成功收取尾款");
        return obj;
    }
}
