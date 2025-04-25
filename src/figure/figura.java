package figure;

import main.ploca;


import java.awt.*;

public class figura {

    public int row, column;

    public boolean isWhite;//checks team
    public String name;//gets the name
    public int vrijednost;//value of pieces(currently not used)
    public int xPos;//x position of piece
    public int yPos;//y position of piece


    Image sprite;

    ploca ploca;


    public figura(ploca ploca, int row, int column, boolean isWhite) {
        this.ploca = ploca;
        this.row = row;
        this.column = column;
        this.isWhite = isWhite;

        this.xPos = column * ploca.velicina;
        this.yPos = row * ploca.velicina;
    }

    public void paint(Graphics2D g2d){

        g2d.drawImage(sprite, xPos,yPos,null);

    }
}