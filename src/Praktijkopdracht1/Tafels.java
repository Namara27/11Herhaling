package Praktijkopdracht1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tafels extends Applet {
    private TextField tekstvak;
    private int getal;

    public void init() {
        tekstvak = new TextField("");
        //Knop
        Button knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        //Toevoegen
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        int y = 20;
        int x = 30;
        for (int i = 1; i <= 10; i++) {
            g.drawString(i + " x " + getal + " = " + (getal * i), x, y);
            y += 20;
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }
}


