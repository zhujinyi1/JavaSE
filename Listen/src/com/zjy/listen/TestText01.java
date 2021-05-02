package com.zjy.listen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01{
    public static void main(String[] args) {
        //启动！！！
        new Myframe();
    }
}

class Myframe extends Frame{
    public Myframe(){
        //单行文本
        TextField textField = new TextField();
        add(textField);

        //监听文本框输入的文字
        MyActionListener2 MyActionListener2 = new MyActionListener2();
        //按下enter键就会触发输入框监听
        textField.addActionListener(MyActionListener2);

        pack();
        setVisible(true);
    }

}

class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();//获得一些资源
        System.out.println(textField.getText());//获得输入框中文本

    }
}