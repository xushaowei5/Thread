package com.itheima.thread;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
public class Demo2 {
    public static void main(String[] args) {
        MyThread m1=new MyThread("小强");
        m1.start();

        for(int i=0;i<10100;i++)
        {
            System.out.println("主线程在运行"+i);
        }

    }
}
