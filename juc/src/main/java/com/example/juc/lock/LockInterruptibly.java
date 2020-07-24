package com.example.juc.lock;

import com.sun.org.glassfish.gmbal.AMXMBeanInterface;
import org.springframework.scheduling.config.Task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockInterruptibly  implements Runnable  {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new LockInterruptibly());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("11111111111111111111");
        try {
            Thread.currentThread().wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
