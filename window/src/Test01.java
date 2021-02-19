import java.awt.*;

public class Test01 {
    public static void main(String[] args) {
        //Frame.jdk 看源码！！！
        Frame frame = new Frame("我的第一个java图形窗口");

        //设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //设置背景颜色
        frame.setBackground(new Color(18, 184, 239));

        //弹出初始位置
        frame.setLocation(200,200);

        //设置大小固定
        frame.setResizable(false);
    }
}
