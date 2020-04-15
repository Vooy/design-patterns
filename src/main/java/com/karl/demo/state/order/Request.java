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
public class Request {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Request(Integer id) {
        this.id = id;
    }
}
