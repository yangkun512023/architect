package com.example.design.structure;

/**
 * @author yk
 * @date 2020/9/24 16:18
 */
public class LiSi implements Person {
    @Override
    public void eat() {
        System.out.println("李四在吃饭");
    }

    @Override
    public void dring() {
        System.out.println("李四在喝水");
    }
}
