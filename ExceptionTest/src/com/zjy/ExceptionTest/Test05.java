package com.zjy.ExceptionTest;

/*
* 异常对象有两个重要的方法：
*
* 获取对象描述信息
*   String msg = exception.getmessage
*
* 打印异常追踪堆栈信息
*   exception.printStackTrace
* */

public class Test05 {

    public static void main(String[] args) {

        //这里只是测试getmessage和printstacktrace方法，Java虚拟机会默认认为这是一个对象
        NullPointerException e = new NullPointerException("空指针异常");

        //获取异常信息，这个信息就是构造方法中的String参数
        String msg = e.getMessage();
        System.out.println(msg);

        //打印异常堆栈信息,后台专门有个线程负责打印异常信息
        e.printStackTrace();
        //异步线程

        System.out.println("HelloWorld");
    }
}
