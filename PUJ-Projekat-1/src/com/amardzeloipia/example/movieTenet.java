package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class movieTenet extends  JFrame{
    private JPanel panel1;
    private JButton btnGoBack;
    private JButton btnQuit;
    private JPanel panelPic;
    private JPanel paneDesc;
    private JPanel panelBtn;
    private JLabel lblPic;
    private JLabel lblDesc;

    public movieTenet() {
        add(panel1);
        String description ="<html>The film follows a former CIA agent who learns how to<br> manipulate the flow of time to prevent an attack from<br> the future that threatens to annihilate the present world.";
        lblDesc.setText(description);
        btnGoBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moviesForms goBack=new moviesForms();
                goBack.setVisible(true);
                dispose();
            }
        });
        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("movieTenet");
        frame.setContentPane(new movieTenet().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
