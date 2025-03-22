import javax.swing.*;
import java.awt.*;

public class ploca extends JPanel {

    public int velicina = 70;

    int redovi = 8;
    int stupci = 8;

    public ploca() {
        this.setPreferredSize(new Dimension(redovi * velicina, stupci * velicina));
    }


    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (int r = 0; r < redovi; r++) {
            for (int s = 0; s < stupci; s++) {
                g2d.setColor((s + r) % 2 == 0 ? new Color(58, 43, 4) : new Color(199, 183, 149));
                g2d.fillRect(s * velicina, r * velicina, velicina, velicina);
            }

        }
    }
}
