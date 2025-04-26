package figure;


import main.Move;
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
    @Override
    public boolean canMove(Move move){
        int dx = Math.abs(move.newst - move.figura.column);
        int dy = Math.abs(move.newrd - move.figura.row);

        if(dx == dy){
            if (!isPathClear(move)) {
                return false;
            }
            return true;
        }
       return false;
    }

}



