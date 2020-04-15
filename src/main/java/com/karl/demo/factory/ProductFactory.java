package com.karl.demo.factory;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/4/15 10:11
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class ProductFactory extends Factory {
    @Override
    Product createProduct(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Product p = (Product) Class.forName(c.getName()).newInstance();
        return p;
    }

    public static void main(String[] args) {
        Factory factory = new ProductFactory();
        try {
            Product product = factory.createProduct(ProductImpl.class);
            product.getProduct();
            System.out.println(product);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
