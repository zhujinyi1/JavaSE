package com.zjy.ExceptionTest;

public class mianshiti {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);
        //答案为什么不是101，是100
    }
    /*
    * java 语法规则
    *   方法体中代码必须自上而下依次进行（亘古不变的语法）
    * */
    public static int m(){
        int i = 100;
        try{
            //这行代码出现在i的下面，所以必须返回100
            //return执行之后方法结束
            return i;
        } finally {
            i++;
       }
    }
}











































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































