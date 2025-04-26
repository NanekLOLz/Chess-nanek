package main;

import figure.figura;

public class Move {

    int oldst;
    int oldrd;

    public int newst;
    public int newrd;

    public figura figura;
    public figura capture;

    public Move(ploca ploca, figura figura, int newrd, int newst){

        this.oldrd = figura.row;//old row
        this.oldst = figura.column;//old column
        this.newrd = newrd;//new row
        this.newst = newst;//new column

        this.figura = figura;
        this.capture = ploca.getFigura(newrd,newst);

    }

}
