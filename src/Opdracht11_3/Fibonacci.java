package Opdracht11_3;

import java.applet.*;
import java.awt.*;

public class Fibonacci extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int getal1=0, getal2=1, i, totaal;
        int y = 30;

        for (i = 0; i < 15; i++) {
            totaal = getal1 + getal2;
            y += 20;
            g.drawString("1",50,30);
            g.drawString("" + totaal,50,y);
            getal1 = getal2;
            getal2 = totaal;
        }

    }
}
