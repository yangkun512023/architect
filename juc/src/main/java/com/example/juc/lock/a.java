package com.example.juc.lock;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author yk
 * @date 2020/8/3 10:37
 */
public class a implements Runnable {
    @Override
    public void run() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaa");
    }

    public static void main(String[] args) {
        ReentrantLock reentrantLock=new ReentrantLock();
        reentrantLock.lock();
        ReentrantReadWriteLock reentrantReadWriteLock=new ReentrantReadWriteLock();
        ArrayBlockingQueue arrayBlockingQueue=new ArrayBlockingQueue(10);
        arrayBlockingQueue.offer(2);
        arrayBlockingQueue.offer(3);
        arrayBlockingQueue.offer(24);
        arrayBlockingQueue.offer(25);
        arrayBlockingQueue.offer(26);
        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.size());
        Stack stack=new Stack();
        stack.push(2);
        stack.push(22);
        stack.push(243);
        stack.push(25);
        stack.push(26);
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
