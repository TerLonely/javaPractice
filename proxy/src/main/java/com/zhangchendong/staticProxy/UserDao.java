package com.zhangchendong.staticProxy;

/**
 * @Author 张琛栋 QQ：847890638
 * @ClassName UserDao
 * @Date 2021/12/16 10:44 AM
 * @Description // 目标接口实现类
 */
public class UserDao implements IUserDao{


    public void save() {
        System.out.println("---- 已保存用例 ----");
    }
}
