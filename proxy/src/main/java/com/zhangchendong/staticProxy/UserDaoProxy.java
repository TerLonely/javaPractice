package com.zhangchendong.staticProxy;

/**
 * @Author 张琛栋 QQ：847890638
 * @ClassName UserDaoProxy
 * @Date 2021/12/16 11:00 AM
 * @Description //TODO
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target = target;
    }

    public void save() {
        System.out.println("开始事务...");
        target.save();
        System.out.println("提交事务...");
    }
}
