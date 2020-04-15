package com.karl.demo.state;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 11:13
 * @since: 1.8.0
 * @version: 1.0.0
 */
public abstract class State {


    Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle1();

    public abstract void handle2();

}
