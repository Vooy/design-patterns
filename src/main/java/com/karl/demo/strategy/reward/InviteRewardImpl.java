package com.karl.demo.strategy.reward;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 11:05
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class InviteRewardImpl {

    public static void main(String[] args) {
        StrategyFactory strategyFactory = new FactorRewardStrategyFactory();
        RewardStrategy strategy = strategyFactory.createStrategy(NewUserRewardStrategy.class);
        RewardContext context = new RewardContext(strategy);
        context.doReward(1L);

    }
}
