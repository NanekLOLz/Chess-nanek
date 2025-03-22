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

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

}
