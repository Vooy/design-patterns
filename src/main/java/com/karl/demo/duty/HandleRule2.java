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
public class HandleRule2 extends Handle {

    public HandleRule2(int level) {
        super(level);
    }

    @Override
    public void echo(Request request) {
        System.out.println("rule2执行");
    }
}
