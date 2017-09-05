package com.itheima.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //自定义线程池对象（初始未5个线程）
        ExecutorService poolservice=Executors.newFixedThreadPool(5);

        //创建Runnable对象
        Runnable runnable=new MyRunnable();

        //创建3个线程
        poolservice.submit(runnable);
        poolservice.submit(runnable);
        poolservice.submit(runnable);
        poolservice.submit(runnable);
        poolservice.submit(runnable);
        poolservice.submit(runnable);
        poolservice.submit(runnable);


        poolservice.shutdown();
    }
}
