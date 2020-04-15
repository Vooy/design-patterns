package com.karl.demo.strategy.reward;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 10:56
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class FactorRewardStrategyFactory extends StrategyFactory {
    @Override
    RewardStrategy createStrategy(Class clazz) {

        try {
            RewardStrategy rewardStrategy = (RewardStrategy) Class.forName(clazz.getName()).newInstance();
            return rewardStrategy;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        StrategyFactory factory = new FactorRewardStrategyFactory();
        RewardStrategy strategy = factory.createStrategy(NewUserRewardStrategy.class);
        strategy.reward(1L);
    }
}
