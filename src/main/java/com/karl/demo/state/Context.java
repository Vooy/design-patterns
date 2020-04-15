package com.karl.demo.state;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 11:18
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class Context {


    public final static ConcreteStateA concreteStateA = new ConcreteStateA();
    public final static ConcreteStateB concreteStateB = new ConcreteStateB();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        currentState.setContext(this);
    }

    public void handle1() {
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.handle2();
    }
}
