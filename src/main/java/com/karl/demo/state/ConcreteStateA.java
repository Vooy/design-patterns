package com.karl.demo.state;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 11:17
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class ConcreteStateA extends State {


    @Override
    public void handle1() {
        System.out.println("ConcreteStateA --- handle1");
    }

    @Override
    public void handle2() {
        super.context.setCurrentState(Context.concreteStateB);
        super.context.handle2();
    }
}
