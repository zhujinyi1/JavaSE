package com.zjy.ExceptionTest;
//处理异常两种方式：上报或者处理
public class Test01 {
    public static void main(String[] args) {
        /*
        运行时异常
            程序执行到此处发生了ArithmaticException异常，
            底层new了一个ArithmaticException对象。
            然后抛出了，由于main方法调用了100/0.
            所以异常ArithmaticException抛给了main方法
            main方法没处理，将其抛给jvm，jvm终止程序运行
         */
        //此处属于运行时异常，编译器不处理也不管
        System.out.println(100/0);
        //后面程序没有运行
        System.out.println("HelloWorld");
    }
}
