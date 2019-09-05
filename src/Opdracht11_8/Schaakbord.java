package Opdracht11_8;

import java.applet.*;
import java.awt.*;

public class Schaakbord extends Applet {

    public void init() {
        setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        int y;
        int x;

        for (int rij = 0; rij < 8; rij++) {
            for (int kolom = 0; kolom < 8; kolom++) {
                x = rij * 20;
                y = kolom * 20;

                if ((rij + kolom ) % 2 == 0) {
                    g.setColor(Color.black);
                } else {
                    g.setColor(Color.white);
                }
                g.fillRect(x, y, 20, 20);


            }

        }
    }
}

