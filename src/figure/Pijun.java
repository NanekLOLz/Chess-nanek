package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Pijun extends figura {

    public Pijun(ploca ploca, int row, int column, boolean isWhite) {
        super(ploca, row, column, isWhite);

        this.name = "pawn";

        try {
            if (isWhite) {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("pawn_w.png"));
            } else {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("pawn_b.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



