package main;

import figure.figura;
import figure.konj;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ploca extends JPanel {

    public int velicina = 70;

    int redovi = 8;
    int stupci = 8;

    ArrayList<figura> pieceList = new ArrayList<>();

    public ploca() {
        this.setPreferredSize(new Dimension(redovi * velicina, stupci * velicina));
    }

    public void addPieces(){
        pieceList.add(new konj(this,0,2,true));
    }


    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (int r = 0; r < redovi; r++) {
            for (int s = 0; s < stupci; s++) {
                g2d.setColor((s + r) % 2 == 0 ? new Color(168, 150, 119): new Color(58, 43, 4) );
                g2d.fillRect(s * velicina, r * velicina, velicina, velicina);
            }

        }

        for(figura figura : pieceList){
            figura.paint(g2d);
        }


    }
}
