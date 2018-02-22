package jd.code;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                Ventana ventana = null;
                try {
                    ventana = new Ventana();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                ventana.setSize(400,300);
                ventana.setVisible(true);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

    }
}