package com.itheima.thread;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
public class Ticket implements Runnable {
    int ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {

            method();

        }
    }

    public synchronized void method() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖票" + ticket--);

        }
    }
}
