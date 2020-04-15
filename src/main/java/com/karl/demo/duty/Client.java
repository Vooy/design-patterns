package com.karl.demo.duty;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 15:13
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        Handle rule1 = new HandleRule1(1);
        Handle rule2 = new HandleRule2(2);
        rule1.setNextHandle(rule2);
        rule1.handleMessage(new Request(2));
    }
}
