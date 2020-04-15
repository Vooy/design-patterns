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
public abstract class StrategyFactory<T> {

    abstract RewardStrategy createStrategy(Class<T> clazz);

}
