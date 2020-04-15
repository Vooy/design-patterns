package com.karl.demo.state.order;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 11:39
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class RewardStateContext {

    private RewardState state;

    public RewardState getState() {
        return state;
    }

    public void setState(RewardState state) {
        this.state = state;
    }

    public void echo(RewardStateContext context, Request request) {
        state.doReward(context, request);
    }
}
