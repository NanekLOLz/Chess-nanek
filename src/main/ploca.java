package main;

import figure.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ploca extends JPanel {

    public int velicina = 70;//sets the size of a tile

    int rows = 8;//sets the amount of rows
    int columns = 8;//sets the amount of columns

    ArrayList<figura> pieceList = new ArrayList<>();

    public figura selectedPiece;

    Input input = new Input(this);

    public ploca() {
        this.setPreferredSize(new Dimension(rows * velicina, columns * velicina));

        this.addMouseListener(input);
        this.addMouseMotionListener(input);

        addPieces();

    }

    public figura getFigura(int red, int stupac) {//gets the selected piece

        for (figura figura : pieceList) {
            if ((figura.column == stupac) && (figura.row == red)) {
                return figura;
            }
        }
        return null;
    }

    public void makeMove(Move move) {

        move.figura.column = move.newst;
        move.figura.row = move.newrd;

        move.figura.xPos = move.newst * velicina;
        move.figura.yPos = move.newrd * velicina;

        capture(move);
    }

    public void capture(Move move) {
        pieceList.remove(move.capture);
    }

    public boolean isValidMove(Move move) {

        if(move.newrd > 7 || move.newrd < 0 || move.newst > 7 || move.newst < 0){
            return false;
        }

        if (sameTeam(move.figura, move.capture)) {//if a piece tries to eat a piece on the same team it doesn't allow it
            return false;
        }

        return move.figura.canMove(move);
    }




    public boolean sameTeam(figura p1, figura p2) {//checks the team
        if (p1 == null || p2 == null) {
            return false;
        }
        return p1.isWhite == p2.isWhite;
    }

    public void addPieces() {//sets the pieces on their places at the begining
        pieceList.add(new Konj(this, 0, 1, false));
        pieceList.add(new Konj(this, 0, 6, false));
        pieceList.add(new Kralj(this, 0, 4, false));
        pieceList.add(new Kraljica(this, 0, 3, false));
        pieceList.add(new Kula(this, 0, 0, false));
        pieceList.add(new Kula(this, 0, 7, false));
        pieceList.add(new Lovac(this, 0, 2, false));
        pieceList.add(new Lovac(this, 0, 5, false));

        pieceList.add(new Pijun(this, 1, 0, false));
        pieceList.add(new Pijun(this, 1, 1, false));
        pieceList.add(new Pijun(this, 1, 2, false));
        pieceList.add(new Pijun(this, 1, 3, false));
        pieceList.add(new Pijun(this, 1, 4, false));
        pieceList.add(new Pijun(this, 1, 5, false));
        pieceList.add(new Pijun(this, 1, 6, false));
        pieceList.add(new Pijun(this, 1, 7, false));

        pieceList.add(new Konj(this, 7, 1, true));
        pieceList.add(new Konj(this, 7, 6, true));
        pieceList.add(new Kralj(this, 7, 4, true));
        pieceList.add(new Kraljica(this, 7, 3, true));
        pieceList.add(new Kula(this, 7, 0, true));
        pieceList.add(new Kula(this, 7, 7, true));
        pieceList.add(new Lovac(this, 7, 2, true));
        pieceList.add(new Lovac(this, 7, 5, true));

        pieceList.add(new Pijun(this, 6, 0, true));
        pieceList.add(new Pijun(this, 6, 1, true));
        pieceList.add(new Pijun(this, 6, 2, true));
        pieceList.add(new Pijun(this, 6, 3, true));
        pieceList.add(new Pijun(this, 6, 4, true));
        pieceList.add(new Pijun(this, 6, 5, true));
        pieceList.add(new Pijun(this, 6, 6, true));
        pieceList.add(new Pijun(this, 6, 7, true));

    }


    public void paintComponent(Graphics g) {//paints the board checkered
        Graphics2D g2d = (Graphics2D) g;

        for (int r = 0; r < rows; r++) {
            for (int s = 0; s < columns; s++) {
                g2d.setColor((s + r) % 2 == 0 ? new Color(168, 150, 119) : new Color(58, 43, 4));
                g2d.fillRect(s * velicina, r * velicina, velicina, velicina);
            }

        }

        if(selectedPiece != null) {
            for (int r = 0; r < rows; r++) {
                for (int s = 0; s < columns; s++) {

                    if (isValidMove(new Move(this, selectedPiece, s, r))) {
                        if((s+r)%2==0){
                            g2d.setColor(new Color(70, 176, 57));
                        } else {
                            g2d.setColor(new Color(45, 110, 38));
                        }
                        g2d.fillRect(r * velicina, s * velicina, velicina, velicina);

                    }

                }
            }
        }


            for (figura figura : pieceList) {
                figura.paint(g2d);
            }


        }
    }

