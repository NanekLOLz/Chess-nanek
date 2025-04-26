package figure;


import main.Move;
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

    @Override
    public boolean canMove(Move move) {
        int dx = Math.abs(move.newst - move.figura.column);
        int dy = Math.abs(move.newrd - move.figura.row);

        return (dx == 2 && dy == 1 ||dx == 1 && dy == 2);
    }

}


