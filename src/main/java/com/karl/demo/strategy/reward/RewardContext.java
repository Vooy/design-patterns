package com.karl.demo.strategy.reward;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 11:03
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class RewardContext {

    private RewardStrategy rewardStrategy;

    public RewardContext(RewardStrategy rewardStrategy) {
        this.rewardStrategy = rewardStrategy;
    }

    public void doReward(Long userId) {
        rewardStrategy.reward(userId);
        System.out.println("执行策略");
    }
}
