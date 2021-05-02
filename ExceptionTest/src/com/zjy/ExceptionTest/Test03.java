package com.zjy.ExceptionTest;

public class Test03 {
    /*
    //第一种处理方式，程序继续上跑，抛给调用者
        上抛类似于推卸责任，把异常抛给调用者
    public static void main(String[] args) throws ClassNotFoundException{

        doSome();
    }
    */
    //第二种，try-catch捕捉
    //捕捉类似于解决
    public static void main(String[] args) throws ClassNotFoundException{
        try {
            doSome();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
    }
    public static void doSome() throws ClassNotFoundException{
        System.out.println("dosome");
    }

}