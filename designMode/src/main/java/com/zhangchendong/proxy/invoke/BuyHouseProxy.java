/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.proxy.invoke;

/**
 * 创建代理类
 * @author zhangchendong
 * @data 2024/7/29 下午4:08
 */
public class BuyHouseProxy implements BuyHouse{
    private BuyHouse byHouse;

    public BuyHouseProxy(final BuyHouse buyHouse){
        this.byHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        byHouse.buyHouse();
        System.out.println("买房后装修");
    }
}
