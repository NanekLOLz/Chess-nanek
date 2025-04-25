package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Kralj extends figura {

    public Kralj(ploca ploca, int row, int column, boolean isWhite) {
        super(ploca, row, column, isWhite);

        this.name = "king";

        try {
            if (isWhite) {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("king_w.png"));
            } else {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("king_b.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


