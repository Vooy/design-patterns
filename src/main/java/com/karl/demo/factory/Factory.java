package com.karl.demo.factory;

/**
 * 接口描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 10:10
 * @since: 1.8.0
 * @version: 1.0.0
 */
public abstract class Factory<T> {


    abstract Product createProduct(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException;

}
