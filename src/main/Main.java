package main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(800,800));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Chess - Nanek");

        ploca ploca = new ploca();
        frame.add(ploca);

        frame.setVisible(true);


    }


}
