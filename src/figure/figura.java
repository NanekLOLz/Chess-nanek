package figure;

import main.ploca;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class figura {

    public int red,stupac;
    public int x,y;

    public boolean isWhite;
    public String ime;
    public int vrijednost;

    BufferedImage sheet;
    {
        try{
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("figurice.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    protected int sheetScale = sheet.getWidth() / 6;

    Image sprite;

    ploca ploca;

    public figura(ploca ploca) {
    }

    public void figura(ploca ploca) {
        this.ploca = ploca;
    }

    public void print(Graphics2D g2d){

        g2d.drawImage(sprite,x,y,null);

    }

    public void paint(Graphics2D g2d) {
    }
}
