package com.example.juc.lock;

import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.stream.IntStream;

/**
 * @author yk
 * @date 2020/7/28 16:53
 */
public class ggg {
    public static void main(String[] args) throws InterruptedException {
        LongAccumulator accumulator = new LongAccumulator((x, y) ->  x * y*2, 1);
        ExecutorService executor = Executors.newFixedThreadPool(8);
        Stack stack=new Stack();
//        IntStream.range(1, 4).forEach(i -> executor.submit(() -> accumulator.accumulate(i)));
//        Thread thread=new Thread();
//
//
//        executor.shutdown();
////        while (!executor.isTerminated()) {
////
////        }
//        System.out.println(accumulator.getThenReset());



//        String str1="abc";
//        String str2="def";
//        String str3=str1+str2;
//        System.out.println("===========test5============");
//        System.out.println(str3=="abcdef"); //false
        for (int i=0;i<100;i++){
            a:
            if(i==10){
                System.out.println(i);
                break a;
            }
        }
    }
}
