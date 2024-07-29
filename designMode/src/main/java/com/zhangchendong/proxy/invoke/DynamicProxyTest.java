/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.proxy.invoke;

import java.lang.reflect.Proxy;

/**
 * @author zhangchendong
 * @data 2024/7/29 下午3:56
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();

        /**
         * 创建动态代理
         * Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
         * 1. ClassLoader loader:指定当前目标对象使用的类加载器，获取加载器的方法是固定的
         * 2. Class<?>[] interfaces:目标对象实现的接口的类型，使用泛型方法确认类型
         * 3. InvocationHandler h:设置代理对象对应的自定义 InvocationHandler
         */
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(
                BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class},
                new DynamicProxyHandler(buyHouse)
                );
        proxyBuyHouse.buyHouse();
    }
}


