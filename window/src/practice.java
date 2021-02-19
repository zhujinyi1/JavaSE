import java.awt.*;

public class practice {
    public static void main(String[] args) {
        Frame frame = new Frame("");
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(400,300);
        frame.setLocation(500,500);
        frame.setVisible(true);

        //4个面板
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        panel1.add(new Button("East1"),BorderLayout.EAST);
        panel1.add(new Button("West1"),BorderLayout.WEST);

        panel2.add(new Button("Button2-1"));
        panel2.add(new Button("Button2-2"));

        panel1.add(panel2,BorderLayout.CENTER);

        panel3.add(new Button("East2"),BorderLayout.EAST);
        panel3.add(new Button("West2"),BorderLayout.WEST);

        panel4.add(new Button("Button1"));
        panel4.add(new Button("Button2"));
        panel4.add(new Button("Button3"));
        panel4.add(new Button("Button4"));

        panel3.add(panel4,BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);



    }
}
