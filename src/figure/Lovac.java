package figure;


import main.ploca;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Lovac extends figura {

    public Lovac(ploca ploca, int row, int column, boolean isWhite) {
        super(ploca, row, column, isWhite);

        this.name = "bishop";

        try {
            if (isWhite) {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("bishop_w.png"));
            } else {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("bishop_b.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



