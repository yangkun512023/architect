package com.agency.agency.proxy.jdk;

/**
 * @author yk
 * @date 2019/5/28 14:24
 */
public class xiaoMing implements  Person {
    @Override
    public void talking() {
        System.out.println("正在说话");
    }

    @Override
    public void eating() {
        System.out.println("正在吃东西");
    }
}
