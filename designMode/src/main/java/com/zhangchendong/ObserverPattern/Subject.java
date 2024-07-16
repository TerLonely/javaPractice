/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式设计模板
 * @author 张琛栋
 * @data 2022/12/2 17:40
 */
public interface Subject<T> {

    //存储订阅者
    List<Observice> list = new ArrayList<>();

    //注册订阅者
    public void registerObserver(T obj);

    //移除订阅者
    public void removeObserver(T obj);

    //通知所有的观察者更新状态
    public void notifyAllObserver();
}
