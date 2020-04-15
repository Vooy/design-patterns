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
public class ConcreteStateB extends State {

    Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }


    @Override
    public void handle1() {

        super.context.setCurrentState(Context.concreteStateA);
        super.context.handle1();

    }

    @Override
    public void handle2() {
        System.out.println("ConcreteStateB --- handle2");
    }
}
