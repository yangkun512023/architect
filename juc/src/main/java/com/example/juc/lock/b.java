package com.example.juc.lock;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yk
 * @date 2020/8/3 10:37
 */
public class b implements Runnable {
    private volatile int value;

    public synchronized int compareAndSwap(int expectedValue, int newValue) {
        int oldValue = value;
        if (oldValue == expectedValue) {
            value = newValue;
        }
        return oldValue;
    }

    public static void main(String[] args) throws InterruptedException {
        b r = new b();
        r.value = 0;
        Thread t1 = new Thread(r,"Thread 1");
        Thread t2 = new Thread(r,"Thread 2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(r.value);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
    }

    @Override
    public void run() {
        compareAndSwap(0, 1);
    }
}
