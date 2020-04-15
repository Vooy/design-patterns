package com.karl.demo.state.order;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 11:40
 * @since: 1.8.0
 * @version: 1.0.0
 */
public abstract class RewardState {

    abstract void doReward(RewardStateContext context, Request request);

}
