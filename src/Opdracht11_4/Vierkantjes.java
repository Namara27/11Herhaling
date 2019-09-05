package Opdracht11_4;

import java.awt.*;
import java.applet.*;

public class Vierkantjes extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int y = 0;
        int x = 0;
        int i;

        for (i = 0; i < 5; i++) {
            y += 20;
            x += 20;
            g.drawRect(x, y,20,20);

        }

    }
}
