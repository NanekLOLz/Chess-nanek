package figure;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class figura {

    public int red,stupac;
    public int x,y;

    public boolean isWhite;
    public String ime;
    public int vrijednost;

    BufferedImage sheet;
    {
        try{
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("figurice.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
