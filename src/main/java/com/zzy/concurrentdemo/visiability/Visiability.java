package com.zzy.concurrentdemo.visiability;

/**
 * @auther: zhangzhaoyuan
 * @date: 2019/04/01
 * @description:
 */
public class Visiability {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();


        number = 42;

        ready = true;
    }
}