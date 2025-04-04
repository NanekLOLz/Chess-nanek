package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Pijun extends figura {

    public Pijun(ploca ploca, int red, int stupac, boolean isWhite) {
        super(ploca);
        this.row = red;
        this.column = stupac;
        this.x = stupac * ploca.velicina;
        this.y = red * ploca.velicina;

        this.isWhite = isWhite;
        this.name = "Pijun";//pawn

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



