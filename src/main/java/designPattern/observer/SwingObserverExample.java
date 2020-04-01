package designPattern.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
//        while(example.jFrame.isVisible()){
//            try{
//                Thread.sleep(1000);//死循环中降低CPU占用
//            } catch(Exception e){
//                e.printStackTrace();
//            }
//        }
    }

    public void go() {
        jFrame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    static class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Don't do it, you might regret it !");
        }
    }

    static class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Come on, do it!");
        }
    }

}
