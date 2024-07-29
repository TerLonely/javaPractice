/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.proxy.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态处理器
 * @author zhangchendong
 * @data 2024/7/29 下午3:58
 *
 *
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;


    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    /**
     *
     * 代理对象
     * @param  proxy the proxy instance that the method was invoked on
     *
     * 当前执行的方法
     * @param method the {@code Method} instance corresponding to
     * the interface method invoked on the proxy instance.  The declaring
     * class of the {@code Method} object will be the interface that
     * the method was declared in, which may be a superinterface of the
     * proxy interface that the proxy class inherits the method through.
     *
     * 当前执行的方法运行是传递过来的参数
     * @param args an array of objects containing the values of the
     * arguments passed in the method invocation on the proxy instance,
     * or {@code null} if interface method takes no arguments.
     * Arguments of primitive types are wrapped in instances of the
     * appropriate primitive wrapper class, such as
     * {@code java.lang.Integer} or {@code java.lang.Boolean}.
     *
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备");

        Object invoke = new Object();
        invoke = method.invoke(object, args);
        System.out.println("买房后装修");
        return invoke;
    }
}
