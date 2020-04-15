package com.karl.demo.duty;

/**
 * 接口描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 15:06
 * @since: 1.8.0
 * @version: 1.0.0
 */
public abstract class Handle {

    private Handle nextHandler;

    private int level;

    public Handle(int level) {
        this.level = level;
    }

    public void setNextHandle(Handle handle) {
        this.nextHandler = handle;
    }

    public final void handleMessage(Request request) {
        if (level == request.getLevel()) {
            this.echo(request);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(request);
            } else {
                System.out.println("已经到尽头，找不到可以执行的对象");
            }
        }
    }

    /**
     * 抽象方法，子类实现
     *
     * @param request
     */
    public abstract void echo(Request request);
}
