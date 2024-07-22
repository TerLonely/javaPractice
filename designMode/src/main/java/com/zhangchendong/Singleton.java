package com.zhangchendong;

/**
 * 单例模式
 * @author zhangchendong
 * @data 2024/7/22 上午11:33
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Singleton!");
    }

    public static void main(String[] args) {

        Singleton singleton  = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton == singleton1);

        singleton.showMessage();
    }
}
