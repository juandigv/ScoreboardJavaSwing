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

    private JLabel eq1 = new JLabel("Equipo 1: ");
    private JLabel eq2 = new JLabel("Equipo 2: ");
    private JLabel score = new JLabel("Puntaje");
    private JComboBox score1;
    private JComboBox score2;
    private JComboBox equipo1;
    private JComboBox equipo2;
    private JButton enviar;
    private JDialog Scoreboard;
private JLabel team1=new JLabel("");
private JLabel team2=new JLabel("");
private JLabel puntos1=new JLabel("");
private JLabel puntos2=new JLabel("");
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
        score1.addItem("9");
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
        score2.addItem("9");
        equipo1 = new JComboBox();
        equipo1.addItem("Barcelona");
        equipo1.addItem("Real Madrid");
        equipo1.addItem("Juventus");
        equipo1.addItem("Manchester United");
        equipo1.addItem("Liverpool");
        equipo2 = new JComboBox();
        equipo2.addItem("Barcelona");
        equipo2.addItem("Real Madrid");
        equipo2.addItem("Juventus");
        equipo2.addItem("Manchester United");
        equipo2.addItem("Liverpool");
        enviar = new JButton("Enviar");
        FlowLayout f = new FlowLayout();
        setLayout(null);
        score.setBounds(290, 15, 80, 30);
        eq1.setBounds(15, 55, 80, 30);
        eq2.setBounds(15, 90, 80, 30);
        equipo1.setBounds(100, 55, 170, 30);
        equipo2.setBounds(100, 90, 170, 30);
        score1.setBounds(280, 55, 60, 30);
        score2.setBounds(280, 90, 60, 30);
        enviar.setBounds(180, 140, 80, 30);
        add(score);
        add(score1);
        add(score2);
        add(eq1);
        add(equipo1);
        add(eq2);
        add(equipo2);
        add(enviar);
        Scoreboard = new JDialog(this);
        Scoreboard.setSize(700, 300);
        Scoreboard.setLayout(null);
        Scoreboard.setVisible(false);


        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                enviarDatos();
                Scoreboard.setVisible(true);
            }
        });
    }


    private void enviarDatos() {

        String e1 = (String) equipo1.getSelectedItem();
        String e2 = (String) equipo2.getSelectedItem();
        String p1 = (String) score1.getSelectedItem();
        String p2 = (String) score2.getSelectedItem();
        //System.out.println("Partido: " + e1 + p1 + e2 + p2);
        team1.setText(e1);
        puntos1.setText(p1);
        team2.setText(e2);
        puntos2.setText(p2);
        team1.setFont(new Font("Impact", Font.BOLD,25));
        team2.setFont(new Font("Impact", Font.BOLD,25));
        puntos1.setFont(new Font("Impact", Font.BOLD,45));
        puntos2.setFont(new Font("Impact", Font.BOLD,45));
        team1.setBounds(30,30,300,40);
        team2.setBounds(355,30,300,40);
        puntos1.setBounds(60,90,60,80);
        puntos2.setBounds(400,90,60,80);

        Scoreboard.add(team1);
        Scoreboard.add(puntos1);
        Scoreboard.add(team2);
        Scoreboard.add(puntos2);
    }

}

