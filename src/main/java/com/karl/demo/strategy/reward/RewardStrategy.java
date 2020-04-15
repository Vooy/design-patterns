package com.karl.demo.strategy.reward;

/**
 * 接口描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 10:51
 * @since: 1.8.0
 * @version: 1.0.0
 */
public abstract class RewardStrategy {

    public abstract void reward(Long userId);

    public void insertRewardAndSettlement(Long userId, int reward) {}

}
