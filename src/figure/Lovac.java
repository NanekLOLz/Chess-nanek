package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Lovac extends figura {

    public Lovac(ploca ploca, int red, int stupac, boolean isWhite) {
        super(ploca);
        this.red = red;
        this.stupac = stupac;
        this.x = stupac * ploca.velicina;
        this.y = red * ploca.velicina;

        this.isWhite = isWhite;
        this.ime = "lovac";

        if (isWhite) {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("bishop_w.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("bishop_b.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



