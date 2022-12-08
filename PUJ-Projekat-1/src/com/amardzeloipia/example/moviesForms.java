package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class moviesForms extends JFrame {
    private JPanel moviePanel;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JLabel lblSelect;
    private JLabel lblMovie1;
    private JLabel lblMovie2;
    private JLabel lblMovie3;
    private JLabel lblMovie4;
    private JLabel lblMovie5;
    private JLabel lblMovie6;


    public moviesForms() {

        add(moviePanel);
        lblMovie1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                openMovieJoker openForm=new openMovieJoker();
                openForm.setMinimumSize(new Dimension(500,200));
                openForm.setLocationRelativeTo(null);
                openForm.setVisible(true);
                dispose();
            }
        });


        lblMovie2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);
                movieBatman openFormBatman = new movieBatman();
                openFormBatman.setMinimumSize(new Dimension(500,200));
                openFormBatman.setLocationRelativeTo(null);
                openFormBatman.setVisible(true);
                dispose();
            }
        });
        lblMovie3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);
                movieBlade openFormBlade = new movieBlade();
                openFormBlade.setMinimumSize(new Dimension(500,200));
                openFormBlade.setLocationRelativeTo(null);
                openFormBlade.setVisible(true);
                dispose();
            }
        });
        lblMovie4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);
                movieTG openFormTG = new movieTG();
                openFormTG.setMinimumSize(new Dimension(500,200));
                openFormTG.setLocationRelativeTo(null);
                openFormTG.setVisible(true);
                dispose();
            }
        });
        lblMovie5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);
                movieTenet openFormTennet = new movieTenet();
                openFormTennet.setMinimumSize(new Dimension(500,200));
                openFormTennet.setLocationRelativeTo(null);
                openFormTennet.setVisible(true);
                dispose();
            }
        });
        lblMovie6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                movieInter openInterForm = new movieInter();
                openInterForm.setMinimumSize(new Dimension(500,200));
                openInterForm.setLocationRelativeTo(null);
                openInterForm.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("moviesForms");
        frame.setContentPane(new moviesForms().moviePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400,400));
        frame.pack();
        frame.setVisible(true);
    }
}
