package pers.shawn.interview.designPattern.template;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {

    String message;

    @Override
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    @Override
    public void destroy() {
        System.out.println("正在被销毁!");
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawString(message, 5, 15);
    }
}
