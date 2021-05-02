package com.zjy.ExceptionTest;

public class Text02 {
    public static void main(String[] args) {

        //运行前就要处理,编译时异常
        //dosome方法上有ClassNotFoundException
        //调用前就要进行预处理
        doSome();
    }

    /**
     * dospme方法在方法执行中，有可能会出现classNotFoundException
     * 这个代码表示dosome（）方法在执行过程中有可能会出现classNotFoundException异常
     * 这个异常属于编译时异常
     * @throws ClassNotFoundException
     */
    public static void doSome()throws ClassNotFoundException{
        System.out.println("dosome");
    }

}
