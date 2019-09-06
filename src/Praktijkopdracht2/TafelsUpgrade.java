package Praktijkopdracht2;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TafelsUpgrade extends Applet {
    TextField tekstvak;
    int getal;

    public void init() {
        tekstvak = new TextField("");
        getal = 0;
        //Knop
        Button knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        //Toevoegen
        add(knop);
        setSize(800, 500);

    }

    public void paint(Graphics g) {
        int y = 50;
        int x = 30;
        for (int i = 1; i <= 10; i++) {
            y += 20;

            switch (getal) {
                case 1:
                    getal = 1;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                case 2:
                    getal = 2;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                case 3:
                    getal = 3;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                case 4:
                    getal = 4;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                case 5:
                    getal = 5;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                case 6:
                    getal = 6;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                case 7:
                    getal = 7;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                case 8:
                    getal = 8;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                case 9:
                    getal = 9;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                case 10:
                    getal = 10;
                    g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
                    break;
                default:
                    g.drawString(i + " x " + 1 + " = " + (i), x, y);
                    g.drawString(i + " x " + 2 + " = " + (i * 2), 100, y);
                    g.drawString(i + " x " + 3 + " = " + (i * 3), 170, y);
                    g.drawString(i + " x " + 4 + " = " + (i * 4), 240, y);
                    g.drawString(i + " x " + 5 + " = " + (i * 5), 310, y);
                    g.drawString(i + " x " + 6 + " = " + (i * 6), 380, y);
                    g.drawString(i + " x " + 7 + " = " + (i * 7), 450, y);
                    g.drawString(i + " x " + 8 + " = " + (i * 8), 520, y);
                    g.drawString(i + " x " + 9 + " = " + (i * 9), 590, y);
                    g.drawString(i + " x " + 10 + " = " + (i * 10), 660, y);
                    break;
            }
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal++;
            tekstvak.setText(String.valueOf(getal));
            repaint();
        }
    }
}




