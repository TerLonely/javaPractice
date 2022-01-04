package com.zhangchendong.staticProxy;

/**
 * @Author 张琛栋 QQ：847890638
 * @ClassName App
 * @Date 2021/12/16 11:04 AM
 * @Description //TODO
 */
public class App {

    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();
    }
}
