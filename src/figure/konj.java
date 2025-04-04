package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.io.IOException;

public class konj extends figura {

    public konj(ploca ploca, int red, int stupac, boolean isWhite) {
        super(ploca);
        this.row = red;
        this.column = stupac;
        this.xPos = stupac * ploca.velicina;
        this.yPos = red * ploca.velicina;

        this.isWhite = isWhite;
        this.name = "konj";//knight

        if (isWhite) {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("knight_w.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("knight_b.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


