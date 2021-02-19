import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//面板(panel)可以看成一个空间，
public class Panel01 {
    public static void main(String[] args) {

        Frame frame = new Frame();

        //布局的概念
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(96, 114, 203, 255));

        //panel设置坐标，相对于frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(208, 56, 56));

        //frame.add(panel);
        frame.add(panel);

        //可见
        frame.setVisible(true);

        //监听事件：监听窗口关闭System.exit(0)
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });

    }
}
