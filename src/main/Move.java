package main;

import figure.figura;

public class Move {

    int oldst;
    int oldrd;

    int newst;
    int newrd;

    figura figura;
    figura capture;

    public Move(ploca ploca, figura figura, int newrd, int newst){

        this.oldrd = figura.red;
        this.oldst = figura.stupac;
        this.newrd = newrd;
        this.newst = newst;

        this.figura = figura;
        this.capture = ploca.getFigura(newrd,newst);

    }

}
