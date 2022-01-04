package com.zhangchendong.dynamic;

import com.zhangchendong.dynamic.aop.IUserDao;
import com.zhangchendong.dynamic.aop.ProxyFactory;
import com.zhangchendong.dynamic.aop.UserDao;

/**
 * @Author 张琛栋 QQ：847890638
 * @ClassName Client
 * @Date 2021/12/17 9:49 AM
 * @Description //TODO
 */
public class Client {

    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();
        System.out.println(target.getClass());

        //给目标对象 创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        //内存中动态生成代理对象
        System.out.println(proxy.getClass());

        System.out.println("----------");

        proxy.save();





    }



}
