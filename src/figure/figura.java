package figure;

import main.ploca;


import java.awt.*;

public class figura {

    public int row, column;
    public int x,y;

    public boolean isWhite;//checks team
    public String name;//gets the name
    public int vrijednost;//value of pieces(currently not used)
    public int xPos;//x position of piece
    public int yPos;//y position of piece


    Image sprite;

    ploca ploca;


    public figura(ploca ploca) {
        this.ploca = ploca;
    }

    public void paint(Graphics2D g2d){

        g2d.drawImage(sprite, x,y,null);

    }
}