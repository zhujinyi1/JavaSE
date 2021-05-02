package com.zjy.ExceptionTest;

import java.io.IOException;

public class Test07 {
    /*
    代码执行顺序：try-》finally-》return
     */
    public static void main(String[] args) {
        try{
            System.out.println("try");
            return;//执行return语句程序必然终止
        }catch(Exception e){
            System.out.println("catch");//有异常执行，没异常不管
        }finally{
            System.out.println("finally");
        }
    }
}
