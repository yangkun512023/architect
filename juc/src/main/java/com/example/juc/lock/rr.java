package com.example.juc.lock;

/**
 * @author yk
 * @date 2020/7/28 14:21
 */
public enum rr {
    INSTANCE;

    public void whatever() {
        System.out.println("1111122222");
    }

    public static void main(String[] args) {
        rr r=rr.INSTANCE;
        r.whatever();
    }
}
