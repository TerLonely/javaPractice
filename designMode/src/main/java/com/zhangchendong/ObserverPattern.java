
package com.zhangchendong;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * 观察者模式
 * @author zhangchendong
 * @data 2024/8/5 下午2:31
 *
 * ConcreteSubject 充当主题（被观察者）
 * ConcreteObserver 充当观察者
 */
public class ObserverPattern {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("观察者1");
        Observer observer2 = new ConcreteObserver("观察者2");

        subject.addObServer(observer1);
        subject.addObServer(observer2);

        subject.setState(10);
        subject.setState(20);

        subject.removeObserver(observer1);
        subject.setState(30);
    }
}

/**
 * 主题接口
 */
interface Subject{
    void addObServer(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}

/**
 * 具体主题类
 */
class ConcreteSubject implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }

    @Override
    public void addObServer(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList){
            observer.update(state);
        }
    }
}

/**
 * 观察者接口
 */
interface Observer{
    void update(int state);
}

/**
 * 具体观察者类
 */
class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        System.out.println("观察者" + name + "收到通知，状态为：" + state);
    }
}