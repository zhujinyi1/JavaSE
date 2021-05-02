package com.zjy.ExceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
处理异常第一种方式：在方法声明位置使用throw关键字抛出，谁调用这个方法，就抛给谁，调用者来处理

 */
public class Test04 {
    public static void main(String[] args) {
        //不建议在main方法抛出异常，因为一旦抛出，只有终止
        //异常抛出机制的作用就是让程序更加健壮，出了异常也能继续运行
        m1();
    }

    private static void m1(){
        //捕捉，解决
        try {
            m2();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在，可能文件路径错误，也可能删除了");
        }

    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        //调用jdk中某个方法
        //没学过，io流中东西
        //创建一个输入流对象，指向一个文件
        /*
            编译报错原因：调用构造方法
            方法里面有一个异常抛出
            编译时异常，必须编译时对其进行处理，不处理就报错
         */
        //采用继续上抛，无限上抛，抛给jvm，不能抛别的，只能抛这个异常，或其父类
        //或者捕捉异常
        new FileInputStream("D:\\Test.txt");
    }
}
