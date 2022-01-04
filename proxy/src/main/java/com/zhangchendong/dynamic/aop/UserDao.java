package com.zhangchendong.dynamic.aop;

/**
 * @Author 张琛栋 QQ：847890638
 * @ClassName UserDao
 * @Date 2021/12/16 5:48 PM
 * @Description //TODO
 */
public class UserDao implements IUserDao {

    public void save() {
        System.out.println("save");
    }

    public void delete() {
        System.out.println("delete");
    }

    public void saveAndDelete() {

        save();

        delete();

    }
}
