package com.karl.demo.state.order;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 11:44
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class InviteRewardServiceImpl {

    public static void main(String[] args) {
        RewardStateContext context = new RewardStateContext();

        context.setState(new OrderCheckState());
        context.echo(context, new Request(1));

    }

}
