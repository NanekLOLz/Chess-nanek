package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Pijun extends figura {

    public Pijun(ploca ploca, int red, int stupac, boolean isWhite) {
        super(ploca);
        this.red = red;
        this.stupac = stupac;
        this.x = stupac * ploca.velicina;
        this.y = red * ploca.velicina;

        this.isWhite = isWhite;
        this.ime = "Pijun";

        if (isWhite) {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("pawn_w.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("pawn_b.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



