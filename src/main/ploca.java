package main;

import figure.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ploca extends JPanel {

    public int velicina = 70;

    int redovi = 8;
    int stupci = 8;

    ArrayList<figura> pieceList = new ArrayList<>();

    public figura selectedPiece;

    public ploca() {
        this.setPreferredSize(new Dimension(redovi * velicina, stupci * velicina));
        addPieces();
    }

    public figura getFigura(int red,int stupac){

        for(figura figura : pieceList){
            if((figura.stupac == stupac) && (figura.red == red)) {
                return figura;
            }
        }
        return null;
    }

    public void addPieces() {
        pieceList.add(new konj(this, 0, 1, false));
        pieceList.add(new konj(this, 0, 6, false));
        pieceList.add(new Kralj(this, 0, 4, false));
        pieceList.add(new Kraljica(this, 0, 3, false));
        pieceList.add(new Kula(this, 0, 0, false));
        pieceList.add(new Kula(this, 0, 7, false));
        pieceList.add(new Lovac(this, 0, 2, false));
        pieceList.add(new Lovac(this, 0, 5, false));
        for (int i = 0; i<stupci; i++){
            pieceList.add(new Pijun(this, 1, i, false));
        }

        pieceList.add(new konj(this, 7, 1, true));
        pieceList.add(new konj(this, 7, 6, true));
        pieceList.add(new Kralj(this, 7, 4, true));
        pieceList.add(new Kraljica(this, 7, 3, true));
        pieceList.add(new Kula(this, 7, 0, true));
        pieceList.add(new Kula(this, 7, 7, true));
        pieceList.add(new Lovac(this, 7, 2, true));
        pieceList.add(new Lovac(this, 7, 5, true));
        for (int j = 0; j<stupci; j++){
            pieceList.add(new Pijun(this, 6, j, true));
        }
    }


    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (int r = 0; r < redovi; r++) {
            for (int s = 0; s < stupci; s++) {
                g2d.setColor((s + r) % 2 == 0 ? new Color(168, 150, 119) : new Color(58, 43, 4));
                g2d.fillRect(s * velicina, r * velicina, velicina, velicina);
            }

        }

        for (figura figura : pieceList) {
            figura.paint(g2d);
        }
    }
}
