package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Konj extends figura {

    public Konj(ploca ploca, int row, int column, boolean isWhite) {
        super(ploca, row, column, isWhite);

        this.name = "knight";

        try {
            if (isWhite) {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("knight_w.png"));
            } else {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("knight_b.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


