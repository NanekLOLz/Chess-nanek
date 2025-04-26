package figure;


import main.Main;
import main.Move;
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

    @Override
    public boolean canMove(Move move){
        int dir = isWhite ? -1 : 1;
        int dx = move.newst - move.figura.column; // horizontal movement
        int dy = move.newrd - move.figura.row;


        if (dx == 0 && dy == dir && move.capture == null) {
            return true;
        }
        if (dx == 0 && dy == 2 * dir && move.capture == null && ((isWhite && move.figura.row == 6) || (!isWhite && move.figura.row == 1))) {
            return true;
        }
        if (Math.abs(dx) == 1 && dy == dir && move.capture != null) {
            return true;
        }

        return false;
    }

}



