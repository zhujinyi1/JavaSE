package com.zjy.listen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionButton02 {
    public static void main(String[] args) {
        //两个按钮，同时实现一个监听
        //开始 停止
        Frame frame = new Frame("开始停止");

        frame.setLocation(500,500);
        frame.setBounds(500,500,600,500);
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        //可以显示的定义触发会返回命令,不显示定义，则会走默认值
        //多个按钮可以只写一个监听
        button2.setActionCommand("button2-stop");
        button1.setActionCommand("button1-start");

        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //获得按钮的信息
        System.out.println("按鈕被点击了"+e.getActionCommand());
    }
}
