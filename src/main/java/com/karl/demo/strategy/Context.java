package com.karl.demo.strategy;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 10:26
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy() {
        strategy.strategyImplementation();
    }

    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.doStrategy();
    }
}
