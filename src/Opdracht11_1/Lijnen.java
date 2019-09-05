package Opdracht11_1;

import java.awt.*;
import java.applet.*;

public class Lijnen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller <= 10; teller++) {
            x += 20;
            g.drawLine(x , 20, x, 260 );
            g.drawString("" + teller, x, 270 );
        }
    }
}

