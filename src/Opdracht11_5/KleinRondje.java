package Opdracht11_5;

import java.awt.*;
import java.applet.*;

public class KleinRondje extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int i;
        int y = 150;
        int x = 150;
        int h = 1;
        int b = 1;

        for (i = 0; i < 5; i++) {
            h += 20;
            b += 20;
            x -= 10;
            y -= 10;
            g.drawOval(x,y,b,h);

        }

    }
}
