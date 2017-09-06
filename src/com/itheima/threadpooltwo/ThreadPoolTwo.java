package com.itheima.threadpooltwo;

import com.itheima.runnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
public class ThreadPoolTwo {
    public static void main(String[] args) {
        //创建池对象
        ExecutorService pooltwo= Executors.newFixedThreadPool(3);

        //创建Runnable子类接口
        Runnable myrunnable=new MyRunnableTwo();

        pooltwo.submit(myrunnable);
        pooltwo.submit(myrunnable);
        pooltwo.submit(myrunnable);
        pooltwo.submit(myrunnable);
        pooltwo.submit(myrunnable);


    }
}
