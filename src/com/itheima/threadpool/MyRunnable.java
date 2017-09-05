package com.itheima.threadpool;

/**
 * Created by Administrator on 2017/9/5 0005.
 */

//自定义实现Runnable类
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "教练来了");
        System.out.println("教练又去水里了");
    }
}
