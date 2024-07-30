/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

/**
 * 模版方法模式
 * @author zhangchendong
 * @data 2024/7/30 上午10:42
 */
public class TemplatePattern {
    public static void main(String[] args) {
        AbstractClass template = new ConcreteClass();
        template.templateMethod();
    }
}

/**
 * 模版类
 */
abstract class AbstractClass{

    //基本方法，子类需要实现
   abstract void step1();
   abstract void step2();
   abstract void step3();

   //模版方法，定义算法骨架
    public void templateMethod(){
        step1();
        step2();
        step3();
    }
}

/**
 * 具体子类实现
 */
class ConcreteClass extends AbstractClass{
    @Override
    void step1() {
        System.out.println("ConcreteClass step1");
    }

    @Override
    void step2() {
        System.out.println("ConcreteClass step2");
    }

    @Override
    void step3() {
        System.out.println("ConcreteClass step3");
    }
}