package pers.shawn.interview.designPattern.proxy.virtual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

/**
 * Test class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public class Test {

    JFrame frame = new JFrame("CD Cover Viewer");
    Hashtable cds = new Hashtable();
    ImageComponent component;
    JMenuBar bar;
    JMenu menu;

    public static void main(String[] args) {
        Test test = new Test();
    }

    public Test() {
        init();
        URL initURL = getCDUrl("Buddha Bar");
        bar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        bar.add(menu);
        frame.setJMenuBar(bar);
        cds.forEach((k, v) -> {
            JMenuItem item = new JMenuItem((String) k);
            menu.add(item);
            item.addActionListener(actionEvent -> {
                component.setIcon(new ImageProxy(getCDUrl(actionEvent.getActionCommand())));
                frame.repaint();
            });
        });

        Icon icon = new ImageProxy(initURL);
        component = new ImageComponent(icon);
        frame.getContentPane().add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public void init() {
        cds.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        cds.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        cds.put("MCMXC A.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
    }

    URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
