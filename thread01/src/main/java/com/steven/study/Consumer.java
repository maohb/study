package com.steven.study;

import java.util.Queue;

/**
 * @program study
 * @description:
 * @author: StevenMao
 * @create: 2021/05/26 21:38
 */
public class Consumer implements Runnable{
    private Queue<String> queues;
    private Integer size;

    public Consumer(Queue<String> queues, Integer size) {
        this.queues = queues;
        this.size = size;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (queues) {
                while (queues.isEmpty()) {
                    System.out.println("queues 为空");
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
                System.out.println("消费者消费消息："+queues.remove());
                queues.notifyAll();
            }
        }
    }
}
