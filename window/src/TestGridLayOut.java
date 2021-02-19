import java.awt.*;

//表格布局
public class TestGridLayOut {
    public static void main(String[] args) {
        Frame frame = new Frame("Grid");

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");

        frame.setLayout(new GridLayout(3,2));

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        frame.pack();//java函数，自动选取好看的位置填充
        frame.setVisible(true);
    }
}
