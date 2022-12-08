package com.amardzeloipia.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class loginForm extends JFrame {
    private JPanel loginPanel;
    private JTextField txtBoxUser;
    private JTextField txtBoxPass;
    private JButton btnLogin;
    private JPanel loginBtnPanel;
    private JLabel lblUser;
    private JLabel lblPassword;
    private JLabel lblPicure;

    public loginForm() {
        add(loginPanel);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = txtBoxUser.getText();
                String password = txtBoxPass.getText();

                if(username.equals("admin") && password.equals("123"))
                {
                    successfullyLoginForm newForm = new successfullyLoginForm();
                    newForm.setVisible(true);
                    dispose();



                }
                else
                {
                    invalidForm invalidLogin = new invalidForm();
                    invalidLogin.setVisible(true);
                    dispose();
                }


            }

        });

        dispose();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new loginForm().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setMinimumSize(new Dimension(250,350));
        frame.setMaximumSize(new Dimension(250,350));
        frame.pack();
        frame.setVisible(true);
    }
}
