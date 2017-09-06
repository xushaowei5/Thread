package com.itheima.runnable;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        //创建Runnable子类
        Runnable myrunnable=new MyRunnable();

        Thread t=new Thread(myrunnable);
        t.start();
        //主线程的程序
        for(int i=0;i<500;i++)
        {
            System.out.println("这是主线程的程序");
       }
    }
}
