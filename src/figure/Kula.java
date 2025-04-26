package figure;


import main.Move;
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
    @Override
    public boolean canMove(Move move){
        int dx = Math.abs(move.newst - move.figura.column);
        int dy = Math.abs(move.newrd - move.figura.row);

        if(dx == 0 || dy == 0){
            if (!isPathClear(move)) {
                return false;
            }
            return true;
        }

        return false;
    }
}



