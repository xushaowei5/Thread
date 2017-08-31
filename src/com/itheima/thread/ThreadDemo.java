package com.itheima.thread;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Ticket ticker=new Ticket();

        Thread t1=new Thread(ticker,"窗口1");
        Thread t2=new Thread(ticker,"窗口2");
        Thread t3=new Thread(ticker,"窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
