package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Kula extends figura {

    public Kula(ploca ploca, int row, int column, boolean isWhite) {
        super(ploca, row, column, isWhite);

        this.name = "rook";

        try {
            if (isWhite) {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("rook_w.png"));
            } else {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("rook_b.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



