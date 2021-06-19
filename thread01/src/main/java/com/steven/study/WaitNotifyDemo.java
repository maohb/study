package com.steven.study;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/05/26 21:58
 */
public class WaitNotifyDemo {

    public static void main(String[] args) {
        Queue<String> queues = new LinkedList<>();
        int size=10;
        Producer producer = new Producer(queues, size);
        Consumer consumer = new Consumer(queues, size);

        Thread t1=new Thread(producer);
        Thread t2=new Thread(consumer);
        t1.start();
        t2.start();

    }
}
