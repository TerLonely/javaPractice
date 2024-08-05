/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

/** 状态设计模式
 * @author zhangchendong
 * @data 2024/8/5 下午4:24
 */
public class StatePattern {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        // elevator.openDoors();
        elevator.move();
        elevator.closeDoors();
        elevator.openDoors();
        // elevator.openDoors();
        elevator.move();
        elevator.stop();
        elevator.openDoors();
    }
}

/**
 * 状态接口
 */
interface ElevatorState{

    void openDoors();
    void closeDoors();

    void move();
    void stop();

}

/**
 * 具体的状态类 打开门
 */
class OpenState implements ElevatorState{
    private Elevator elevator;

    public OpenState(Elevator elevator) {
        this.elevator = elevator;
    }
    @Override
    public void openDoors() {
        System.out.println("Doors are already open.");
    }

    @Override
    public void closeDoors() {
        System.out.println("Closing doors...");
        elevator.setState(new CloseState(elevator));
    }

    @Override
    public void move() {
        System.out.println("Cannot move while doors are open");
    }

    @Override
    public void stop() {
        System.out.println("Stopping while doors are open");
    }
}



class CloseState implements ElevatorState{

    private Elevator elevator;

    public CloseState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoors() {
        System.out.println("Opening doors...");
        elevator.setState(new OpenState(elevator));
    }

    @Override
    public void closeDoors() {
        System.out.println("Doors are already closed.");
    }

    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
    }
}

class Elevator {
    private ElevatorState state;

    public Elevator() {
        state = new CloseState(this);
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public void openDoors() {
        state.openDoors();
    }

    public void closeDoors() {
        state.closeDoors();
    }

    public void move() {
        state.move();
    }

    public void stop() {
        state.stop();
    }
}