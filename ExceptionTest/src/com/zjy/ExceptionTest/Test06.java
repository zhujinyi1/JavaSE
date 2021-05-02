package com.zjy.ExceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 关于try-catch语句中的finally语句
* 1.最后执行，并且一定会执行，即使try语句块中代码出现异常
* 必须和try一起出现，不能单独编写
* 可以不出现catch语句
* 但是不管有没有异常都执行
* */
public class Test06 {
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\Test.txt");
            //开始读文件
            String s = null;
            //这里一定会出现空指针异常！
            s.toString();

            //fis流使用以后要关闭，占用空间
            //即使出现异常也要关闭
            //放这里可能关不了，应该放在finally语句块
           // fis.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            //在这里一定会执行，
            if(fis!=null) {//避免空指针异常
                try {
                    fis.close();//close方法有异常采用捕捉的方式
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
