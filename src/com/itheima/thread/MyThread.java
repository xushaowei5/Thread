package com.itheima.thread;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
public class MyThread  extends Thread{


    MyThread(){}//无参数的构造
    //继承父类带名字的构造
       MyThread (String name){
         super(name);
}

    @Override
    public void run() {
       for(int i=0;i<101;i++){
           System.out.println("name="+Thread.currentThread().getName()+":"+"正在运行"+"i=="+i);
       }
    }

}
