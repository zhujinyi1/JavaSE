package com.zjy.listen;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionButton01 {
    public static void main(String[] args) {
        //按下按钮触发事件
        Frame frame = new Frame("事件监听");
        Button button = new Button();

        //因为addlistener需要一个ActionListener,所以需要构造一个ActionListener
        Mylistener mylistener = new Mylistener();
        button.addActionListener(mylistener);

        frame.add(button,BorderLayout.CENTER);
        frame.pack();

        //关闭窗口
        windowsClose(frame);
        frame.setVisible(true);



    }

    //关闭窗口
    private static void windowsClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}

//事件监听
class Mylistener implements ActionListener{

    public void actionPerformed(ActionEvent e){
        System.out.println("aaa");
    }

}