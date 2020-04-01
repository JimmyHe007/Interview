package pers.shawn.interview.designPattern.template;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String s) throws HeadlessException {
        super(s);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
    }

    @Override
    public void paint(Graphics graphics) {
//        super.paint(graphics);
        String msg = "I rule!";
        graphics.drawString(msg, 200, 200);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns!!!hx");
        myFrame.setVisible(true);
    }

}
