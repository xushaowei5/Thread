package com.itheima.runnable;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
public class MyRunnable implements Runnable{


    @Override
    public void run() {
        for (int i=0;i<200;i++){
            System.out.println("我的Runnable线程执行了");
        }
    }
}
