package com.steven.study;

import java.util.Queue;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/05/26 11:01
 */
public class Producer implements Runnable{
    private Queue<String> queues;
    private Integer size;

    public Producer(Queue<String> queues, Integer size) {
        this.queues = queues;
        this.size = size;
    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            i++;
            synchronized (queues) {
                while (queues.size() == size) {
                    System.out.println("queues 已经满了！！！！");
                    try {
                        queues.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产者-生产消息queues："+i);
                queues.add("queues" + i);
                queues.notifyAll();
            }
        }
    }
}
