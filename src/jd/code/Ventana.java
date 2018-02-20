package jd.code;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ventana extends JFrame {

    private JLabel eq1= new JLabel("Equipo 1: ");
    private JLabel eq2= new JLabel("Equipo 2: ");
    private JLabel score = new JLabel("Puntaje");
    private JComboBox score1;
    private JComboBox score2;
    private JComboBox equipo1;
    private JComboBox equipo2;


    public Ventana() {
        super("Scoreboard");

        score1 = new JComboBox();
        score1.addItem("0");
        score1.addItem("1");
        score1.addItem("2");
        score1.addItem("3");
        score1.addItem("4");
        score1.addItem("5");
        score1.addItem("6");
        score1.addItem("7");
        score1.addItem("8");
        score2 = new JComboBox();
        score2.addItem("0");
        score2.addItem("1");
        score2.addItem("2");
        score2.addItem("3");
        score2.addItem("4");
        score2.addItem("5");
        score2.addItem("6");
        score2.addItem("7");
        score2.addItem("8");
        equipo1 = new JComboBox();
        equipo1.addItem("F.C. Barcelona");
        equipo1.addItem("Real Madrid");
        equipo1.addItem("Juventus");
        equipo2 = new JComboBox();
        equipo2.addItem("F.C. Barcelona");
        equipo2.addItem("Real Madrid");
        equipo2.addItem("Jueventus");
        FlowLayout f = new FlowLayout();
        setLayout(null);
        score.setBounds(290,15,80,30);
        eq1.setBounds(15,55,80,30);
        eq2.setBounds(15,90,80,30);
        equipo1.setBounds(100,55,170,30);
        equipo2.setBounds(100,90,170,30);
        score1.setBounds(280,55,60,30);
        score2.setBounds(280,90,60,30);
        add(score);
        add(score1);
        add(score2);
        add(eq1);
        add(equipo1);
        add(eq2);
        add(equipo2);


    }


}

