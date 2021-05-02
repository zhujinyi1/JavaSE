package com.zjy.ExceptionTest;

public class Test08 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.exit(0);//直接退出JVMfinally不执行
        }catch(Exception e){
            System.out.println("catch");//有异常执行，没异常不管
        }finally{
            System.out.println("finally");
        }
    }
}
