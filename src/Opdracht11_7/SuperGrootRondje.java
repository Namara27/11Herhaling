package Opdracht11_7;

import java.awt.*;
import java.applet.*;

public class SuperGrootRondje extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int i;
        int y = 20;
        int x = 20;
        int h = 1;
        int b = 1;

        for (i = 0; i < 100; i++) {
            h += 10;
            b += 10;
            x -= 0;
            y -= 0;
            g.drawOval(x, y, b, h);
        }
    }
}
