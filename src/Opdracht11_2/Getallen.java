package Opdracht11_2;

import java.awt.*;
import java.applet.*;

public class Getallen extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int i;
        int y = 0;

        for (i = 20; i >= 10; i-- ) {
            y += 20;
            g.drawString("" + i,20,y);
        }

    }
}
