package jd.code;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.desktop.SystemSleepEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Delayed;

public class Ventana extends JFrame {

    private JLabel eq1 = new JLabel("Equipo 1: ");
    private JLabel eq2 = new JLabel("Equipo 2: ");
    private JLabel score = new JLabel("Puntaje");
    private JLabel tiempo = new JLabel(" Tiempo ");
    private JLabel separar = new JLabel(" : ");
    private JComboBox score1;
    private JComboBox score2;
    private JComboBox equipo1;
    private JComboBox equipo2;
    private JButton enviar;
    private JDialog Scoreboard;
    private JTextField team1 = new JTextField("");
    private JTextField team2 = new JTextField("");
    private JTextField puntos1 = new JTextField("");
    private JTextField puntos2 = new JTextField("");
    private MaskFormatter formatter = new MaskFormatter("##");
    private JFormattedTextField min = new JFormattedTextField(formatter);
    private JFormattedTextField seg = new JFormattedTextField(formatter);
    private JTextField tiempo2 = new JTextField("");
    private JTextField parte = new JTextField("");


    public Ventana() throws ParseException {
        super("Scoreboard");
        min.setText("00");
        seg.setText("00");
        Image icon = new ImageIcon(getClass().getResource("icon.png")).getImage();
        setIconImage(icon);
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
        setLayout(null);
        score.setBounds(300, 0, 80, 30);
        eq1.setBounds(15, 40, 80, 30);
        eq2.setBounds(15, 75, 80, 30);
        equipo1.setBounds(110, 40, 170, 30);
        equipo2.setBounds(110, 75, 170, 30);
        score1.setBounds(300, 40, 60, 30);
        score2.setBounds(300, 75, 60, 30);
        enviar.setBounds(160, 210, 80, 30);
        separar.setBounds(195, 150, 10, 30);
        tiempo.setBounds(175, 115, 60, 30);
        min.setBounds(160, 150, 30, 30);
        seg.setBounds(210, 150, 30, 30);
        min.setHorizontalAlignment(JTextField.CENTER);
        seg.setHorizontalAlignment(JTextField.CENTER);
        add(score);
        add(score1);
        add(score2);
        add(eq1);
        add(equipo1);
        add(eq2);
        add(equipo2);
        add(enviar);
        add(min);
        add(seg);
        add(separar);
        add(tiempo);
        Scoreboard = new JDialog(this);
        Scoreboard.setSize(700, 300);
        Scoreboard.getContentPane().setBackground(new Color(34, 139, 34));
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
        team1.setText(e1);
        puntos1.setText(p1);
        team2.setText(e2);
        puntos2.setText(p2);
        team1.setFont(new Font("OCR A Extended", Font.BOLD, 25));
        team2.setFont(new Font("OCR A Extended", Font.BOLD, 25));
        puntos1.setFont(new Font("OCR A Extended", Font.BOLD, 45));
        puntos2.setFont(new Font("OCR A Extended", Font.BOLD, 45));
        team1.setForeground(Color.YELLOW);
        team2.setForeground(Color.YELLOW);
        puntos1.setForeground(Color.YELLOW);
        puntos2.setForeground(Color.YELLOW);
        team1.setBackground(Color.black);
        team2.setBackground(Color.black);
        puntos1.setBackground(Color.black);
        puntos2.setBackground(Color.black);
        team1.setBounds(30, 30, 300, 40);
        team2.setBounds(355, 30, 300, 40);
        puntos1.setBounds(150, 90, 60, 80);
        puntos2.setBounds(475, 90, 60, 80);
        team1.setHorizontalAlignment(JTextField.CENTER);
        team2.setHorizontalAlignment(JTextField.CENTER);
        puntos1.setHorizontalAlignment(JTextField.CENTER);
        puntos2.setHorizontalAlignment(JTextField.CENTER);
        team1.setEditable(false);
        team2.setEditable(false);
        puntos1.setEditable(false);
        puntos2.setEditable(false);
        int minc = Integer.parseInt(min.getText());
        int sec = Integer.parseInt(seg.getText());
        tiempo2.setText(minc + ":" + sec);
        if (minc > 89 && sec < 60) {
            parte.setText("ERROR");
            tiempo2.setText("ERROR");
        } else {
            if (minc > 44 && sec < 60) {
                parte.setText("2 TIEMPO");
            } else {
                if (minc >= 0 && sec < 60) {
                    parte.setText("1 TIEMPO");
                } else {
                    parte.setText("ERROR");
                    tiempo2.setText("ERROR");
                }
            }
        }


        tiempo2.setFont(new Font("OCR A Extended", Font.BOLD, 45));
        tiempo2.setForeground(Color.RED);
        tiempo2.setBackground(Color.black);
        tiempo2.setBounds(250, 150, 200, 80);
        tiempo2.setHorizontalAlignment(JTextField.CENTER);
        tiempo2.setEditable(false);
        parte.setFont(new Font("OCR A Extended", Font.BOLD, 25));
        parte.setForeground(Color.RED);
        parte.setBackground(Color.black);
        parte.setBounds(250, 100, 200, 40);
        parte.setHorizontalAlignment(JTextField.CENTER);
        parte.setEditable(false);
        Scoreboard.add(parte);
        Scoreboard.add(tiempo2);
        Scoreboard.add(team1);
        Scoreboard.add(puntos1);
        Scoreboard.add(team2);
        Scoreboard.add(puntos2);

    }


}

