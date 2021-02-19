import java.awt.*;

public class TestBorderLayOut {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayOut");

        Button East = new Button("East");
        Button West = new Button("West");
        Button North = new Button("North");
        Button Center = new Button("Center");
        Button South = new Button("South");

        frame.add(East,BorderLayout.EAST);
        frame.add(West,BorderLayout.WEST);
        frame.add(North,BorderLayout.NORTH);
        frame.add(South,BorderLayout.SOUTH);
        frame.add(Center,BorderLayout.CENTER);

        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
