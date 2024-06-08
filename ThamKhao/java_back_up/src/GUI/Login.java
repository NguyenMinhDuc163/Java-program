package GUI;

import javax.swing.*;
import java.awt.*;

public class Login {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JLabel useLable = new JLabel("UserName");
        JLabel passLable = new JLabel("Password");
        JLabel loginLogo = new JLabel("LOGIN");
        JTextField useText = new JTextField("");
        JPasswordField passText = new JPasswordField("");
        JButton buttonLog = new JButton("Login");
        JButton buttonForgot = new JButton("Forgot your password?");

        useLable.setBounds(30, 40, 80, 30);
        passLable.setBounds(30, 80, 80, 30);
        loginLogo.setBounds(120,5, 50, 30);
        loginLogo.setFont(new Font("Arial", Font.BOLD, 16));
        useText.setBounds(100, 40, 130, 30);
        passText.setBounds(100, 80, 130, 30);
        buttonLog.setBounds(100, 125, 70, 20);
        buttonForgot.setBounds(120, 155, 170, 20);
        String tk = "admin";
        final String[] mk = {"admin"};
        buttonLog.addActionListener(e ->{
            String user = String.valueOf(useText.getText());
            String pass = String.valueOf(passText.getPassword());
            if(user.equals(tk) && pass.equals(mk[0])){
                JOptionPane.showMessageDialog(frame, "Login Successful!");
            }
            else {
                JOptionPane.showMessageDialog(frame,"Invalid handle userName or passWord");
                passText.setText("");
            }
        });
        buttonForgot.addActionListener(e ->{
            ForgotPassword forrgot= new ForgotPassword();
            forrgot.showFrame();
            mk[0] = forrgot.getPass();
        });
        frame.add(passLable); frame.add(useLable); frame.add(loginLogo);
        frame.add(useText); frame.add(passText);
        frame.add(buttonLog); frame.add(buttonForgot);

        frame.setSize(300, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame. setVisible(true);
    }
}
