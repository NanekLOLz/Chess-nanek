package figure;


import main.Main;
import main.Move;
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

    @Override
    public boolean canMove(Move move){
        int dx = Math.abs(move.newst - move.figura.column);
        int dy = Math.abs(move.newrd - move.figura.row);

        return dx <= 1 && dy <= 1;
    }
}


