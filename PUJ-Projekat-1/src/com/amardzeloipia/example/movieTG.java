package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class movieTG extends JFrame {
    private JPanel mainPanel;
    private JButton btnGoBack;
    private JButton btnQuit;
    private JLabel lblPic;
    private JPanel panelPic;
    private JPanel panelDesc;
    private JPanel panelBtn;
    private JLabel lblDesc;

    public static void main(String[] args) {
        JFrame frame = new JFrame("movieTG");
        frame.setContentPane(new movieTG().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public movieTG() {
        add(mainPanel);
        String description ="<html>After thirty years, Maverick is still pushing<br> the envelope as a top naval aviator, but must<br> confront ghosts of his past when he leads TOP GUN's <br>elite graduates on a mission that demands the ultimate<br> sacrifice from those chosen to fly it.";
        lblDesc.setText(description);
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
    btnQuit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });

}
}
