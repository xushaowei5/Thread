package com.itheima.threadpooltwo;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
public class MyRunnableTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("教练过来了");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"教练教完又走了");
    }
}
