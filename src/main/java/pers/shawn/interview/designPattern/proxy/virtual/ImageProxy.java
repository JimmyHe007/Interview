package pers.shawn.interview.designPattern.proxy.virtual;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * ImageProxy class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public class ImageProxy implements Icon {

    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int i, int i1) {
        if (imageIcon != null) {
            imageIcon.paintIcon(component, graphics, i, i1);
        } else {
            graphics.drawString("Loading CD cover, please wait...", i+300, i1+190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(() -> {
                        try {
                            imageIcon = new ImageIcon(imageURL, "CD Cover");
                            component.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }
}
