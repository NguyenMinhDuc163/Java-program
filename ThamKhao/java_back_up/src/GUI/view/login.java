package view;

import controller.forgotListener;
import controller.loginListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class login extends JFrame{
    private JLabel lblUse, lblPass, lblLogo;    private JTextField txtUse;
    private JPasswordField txtPass;

    private JButton btnLogin, btnForgot;
    private JPanel pnlMid, pnlTop, pnlBot;
    public login(String title) {
        this.setTitle(title);
        init();
        setBound();
        add();
        ActionListener loginListener = new loginListener(this);
        btnLogin.addActionListener(loginListener);
        ActionListener forgotListener = new forgotListener(this);
        btnForgot.addActionListener(forgotListener);

        this.setSize(300, 220);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }
    public void init(){
        lblUse = new JLabel("UserName");
        lblPass = new JLabel("Password");
        lblLogo = new JLabel("LOGIN");
        txtUse = new JTextField("");
        txtPass = new JPasswordField("");
        btnLogin = new JButton("Login");
        btnForgot = new JButton("Forgot your password?");
    }
    public void setBound(){
        lblUse.setBounds(30, 40, 80, 30);
        lblPass.setBounds(30, 80, 80, 30);
        lblLogo.setBounds(120,5, 50, 30);
        lblLogo.setFont(new Font("Arial", Font.BOLD, 16));
        txtUse.setBounds(100, 40, 130, 30);
        txtPass.setBounds(100, 80, 130, 30);
        btnLogin.setBounds(100, 125, 70, 20);
        btnForgot.setBounds(120, 155, 170, 20);
    }

    public JTextField getTxtUse() {
        return txtUse;
    }

    public JPasswordField getTxtPass() {
        return txtPass;
    }
    public JButton getBtnLogin() {
        return btnLogin;
    }
    public void add(){
        this.add(lblUse);
        this.add(lblPass);
        this.add(lblLogo);
        this.add(txtUse);
        this.add(txtPass);
        this.add(btnLogin);
        this.add(btnForgot);
    }
}
