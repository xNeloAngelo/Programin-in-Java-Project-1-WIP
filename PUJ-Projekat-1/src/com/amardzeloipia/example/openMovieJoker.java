package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class openMovieJoker extends JFrame{
    private JPanel jokerMain;
    private JButton btnGoBack;
    private JButton btnQuit;
    private JLabel lblMoviePic;
    private JLabel lblMovieDis;
    private JPanel panelMoviePic;
    private JPanel panelDisc;
    private JPanel panelBtn;

    public openMovieJoker() {
        add(jokerMain);
        String description ="<html>Set in 1981, it follows Arthur Fleck, a failed clown <br>and aspiring stand-up comedian whose descent into <br>insanity and nihilism inspires a violent countercultural<br> revolution against the wealthy in a decaying Gotham City. <br>Robert De Niro, Zazie Beetz, and Frances Conroy appear<br> in supporting roles.";
        lblMovieDis.setText(description);
        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        btnGoBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moviesForms goBack = new moviesForms();
                goBack.setMinimumSize(new Dimension(500,350));
                goBack.setLocationRelativeTo(null);
                goBack.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("openMovieJoker");
        frame.setContentPane(new openMovieJoker().jokerMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
