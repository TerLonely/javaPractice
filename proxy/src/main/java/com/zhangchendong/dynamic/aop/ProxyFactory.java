package com.zhangchendong.dynamic.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author 张琛栋 QQ：847890638
 * @ClassName ProxyFactory
 * @Date 2021/12/16 5:54 PM
 * @Description //TODO
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("事务处理开始");
                        Object returnValue = method.invoke(target,args);
                        System.out.println("事务处理提交");
                        return returnValue;

                    }
                }
        );

    }
}
