package figure;


import main.ploca;

import java.awt.image.BufferedImage;

public class konj extends figura {

    public konj(ploca ploca,int red,int stupac,boolean isWhite) {
        super(ploca);
        this.red = red;
        this.stupac = stupac;
        this.x = stupac * ploca.velicina;
        this.y = red * ploca.velicina;

        this.isWhite = isWhite;
        this.ime = "konj";

        this.sprite = sheet.getSubimage(3 * sheetScale, isWhite ? 0 : sheetScale,sheetScale,sheetScale).getScaledInstance(sheetScale,sheetScale, BufferedImage.SCALE_SMOOTH);

    }
}
