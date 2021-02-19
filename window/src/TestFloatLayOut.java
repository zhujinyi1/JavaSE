import java.awt.*;

//流式布局
public class TestFloatLayOut {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //组件-按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //设置流式布局
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
                                      //布局靠哪边//可以不写，默认中
        frame.setSize(500,500);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
    }
}
