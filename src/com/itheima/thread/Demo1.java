package com.itheima.thread;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
public class Demo1 {
    String name;
    //带名字的构造
    Demo1(String name){
        this.name=name;
    }

    public void show(){
        for (int i=0;i<=10001;i++)
        {
            System.out.println("name="+name+";"+"i="+i);
        }

    }

    public static void main(String[] args) {
        Demo1 d1=new Demo1("下滑");
        Demo1 d2=new Demo1("上升");
        d1.show();
        d2.show();
        System.out.println("Hello World");
    }
}
