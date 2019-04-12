package com.zzy.concurrentdemo.thread;

/**
 * @auther: zhangzhaoyuan
 * @date: 2019/04/09
 * @description:
 */
public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int i = 0;
            boolean isInterrupted = Thread.currentThread().isInterrupted();
            while (!isInterrupted) {
                i++;
                if (i % 10 == 0)
                    System.out.println(i);
                isInterrupted = Thread.currentThread().isInterrupted();

            }
        });

        thread.start();

        Thread.sleep(1000);
        thread.interrupt();
    }


}
