package Opdracht11_6;

import java.awt.*;
import java.applet.*;

public class GrootRondje extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int i;
        int y = 350;
        int x = 350;
        int h = 1;
        int b = 1;

        for (i = 0; i < 50; i++) {
            h += 10;
            b += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, b, h);
        }

    }
}