/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者模式
 * @author zhangchendong
 * @data 2024/8/2 上午11:35
 *
 * 个用户对象在构造时都传递了中介者实例，以便用户可以使用中介者发送和接收消息
 */
public class MediatorPattern {
    public static void main(String[] args) {
        ConcreChatMediator mediator = new ConcreChatMediator();

        User user1 = new User("张三", mediator);
        User user2 = new User("李四", mediator);
        User user3 = new User("王五", mediator);
        User user4 = new User("赵六", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessage("hello!");
        user2.sendMessage("hello alice!");
    }
}

//中介者接口
interface ChatMediator{
    void sendMessage(String message, User user);
    void addUser(User user);
}

//具体中介者类
class ConcreChatMediator implements ChatMediator{
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users){
            if(u != user){
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}

//用户类
class User{
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message){
        System.out.println(name + " 发送消息: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message){
        System.out.println(name + " 收到消息: " + message);
    }
}


