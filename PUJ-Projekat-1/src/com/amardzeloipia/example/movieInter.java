package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class movieInter extends JFrame {
    private JPanel mainPanel;
    private JButton btnGoBack;
    private JButton btnQuit;
    private JLabel lblPic;
    private JLabel lblDesc;
    private JPanel panelPic;
    private JPanel panelDesc;
    private JPanel panelBtn;

    public movieInter() {
        add(mainPanel);
        lblDesc.setText("<html>Interstellar is about Earth's last chance to find<br> a habitable planet before a lack of resources causes the<br> human race to go extinct. The film's protagonist<br> is Cooper (Matthew McConaughey), a former NASA pilot who<br> is tasked with leading a mission through a wormhole <br>to find a habitable planet in another galaxy.");
        btnGoBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moviesForms goBack = new moviesForms();
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
        JFrame frame = new JFrame("movieInter");
        frame.setContentPane(new movieInter().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
