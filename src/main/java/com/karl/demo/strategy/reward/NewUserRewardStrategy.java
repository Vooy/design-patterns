package com.karl.demo.strategy.reward;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 10:53
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class NewUserRewardStrategy extends RewardStrategy {
    @Override
    public void reward(Long userId) {

        System.out.println("新用户奖励策略");

    }
}
