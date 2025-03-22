package main;

import figure.figura;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Input extends MouseAdapter {

    ploca ploca;

    public Input(ploca ploca){
        this.ploca = ploca;
    }

    @Override
    public void mousePressed(MouseEvent e) {

        int stupac = e.getX() / ploca.velicina;
        int red = e.getY() / ploca.velicina;

        figura figuraXY = ploca.getFigura(red,stupac);
        if(figuraXY != null){
            ploca.selectedPiece = figuraXY;
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {

        if(ploca.selectedPiece != null){
            ploca.selectedPiece.xPos = e.getX() - ploca.velicina / 2;
            ploca.selectedPiece.yPos = e.getY() - ploca.velicina / 2;

            ploca.repaint();

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        int stupac = e.getX() / ploca.velicina;
        int red = e.getY() / ploca.velicina;

        if(ploca.selectedPiece != null){
            Move move  = new Move(ploca,ploca.selectedPiece,red,stupac);

            if(ploca.isValidMove(move)) {
                ploca.makeMove(move);
            }else{
                ploca.selectedPiece.xPos = ploca.selectedPiece.stupac * ploca.velicina;
                ploca.selectedPiece.yPos = ploca.selectedPiece.red * ploca.velicina;
            }


        }

        ploca.selectedPiece = null;
        ploca.repaint();
    }

}
