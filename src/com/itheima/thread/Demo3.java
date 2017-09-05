package com.itheima.thread;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
public class Demo3 {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        m1.start();
        MyThread m2=new MyThread();
        m2.run();

    }
}
