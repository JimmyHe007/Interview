package pers.shawn.interview.designPattern.proxy.virtual;

import javax.swing.*;
import java.awt.*;

/**
 * ImageComponent class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
class ImageComponent extends JComponent {

    private Icon icon;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800-w)/2;
        int y = (600-h)/2;
        icon.paintIcon(this, g, x, y);
    }

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
