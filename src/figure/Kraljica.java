package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Kraljica extends figura {

    public Kraljica(ploca ploca, int row, int column, boolean isWhite) {
        super(ploca, row, column, isWhite);

        this.name = "queen";

        try {
            if (isWhite) {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("queen_w.png"));
            } else {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("queen_b.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



