package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class movieBatman extends JFrame{
    private JPanel panel1;
    private JPanel panelPic;
    private JPanel panelDis;
    private JPanel panelBtn;
    private JButton btnGoBack;
    private JButton btnQuit;
    private JLabel lblPic;
    private JLabel lblDesc;

    public movieBatman() {
        add(panel1);
        String description = "<html> A reclusive billionaire who obsessively protects Gotham City<br> as a masked vigilante to cope with his traumatic past.<br> Batman is around 30 years old and <br>is not yet an experienced crime fighter,<br> as director Matt Reeves wanted to explore the <br>character before he becomes fully formed.";
        lblDesc.setText(description);
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
        JFrame frame = new JFrame("movieBatman");
        frame.setContentPane(new movieBatman().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
