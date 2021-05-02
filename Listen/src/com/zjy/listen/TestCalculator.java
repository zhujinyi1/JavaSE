package com.zjy.listen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TestCalculator {
    public static void main(String[] args) {
        new Calculator().LoadFrame();
    }
}

//计算器类
class Calculator extends Frame{

    //属性
    TextField num1,num2,num3;

    //方法
    public void LoadFrame(){

        //三个文本框
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        //一个标签
        Label label = new Label("+");
        //一个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener(this));

        //布局（流式布局）
        setLayout(new FlowLayout());

        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        setVisible(true);
    }

}

//监听器类
class MyCalculatorListener implements ActionListener{

    //获取计算器对象
    Calculator calculator = null;

    public MyCalculatorListener(Calculator calculator) {
        this.calculator =calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //1.获得加数和被加数
        int n1 = Integer.parseInt(calculator.num1.getText());
        int n2 = Integer.parseInt(calculator.num2.getText());

        //2.等于以后将结果放到第三个框
        calculator.num3.setText(""+(n1+n2));
        //3.清除前两个框
        calculator.num1.setText("");
        calculator.num2.setText("");
    }
}

////监听器类
//class MyCalculatorListener implements ActionListener{
//
//
//    //获取三个变量
//    private TextField num1,num2,num3;
//
//    public MyCalculatorListener(TextField num1,TextField num2,TextField num3) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.num3 = num3;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        //1.获得加数和被加数
//        int n1 = Integer.parseInt(num1.getText());
//        int n2 = Integer.parseInt(num2.getText());
//
//        //2.等于以后将结果放到第三个框
//        num3.setText(""+(n1+n2));
//        //3.清楚前两个框
//        num1.setText("");
//        num2.setText("");
//    }
//}
