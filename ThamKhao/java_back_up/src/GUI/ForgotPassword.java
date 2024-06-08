package GUI;

import javax.swing.*;

public class ForgotPassword {
    private JFrame frame;
    private JLabel logo;
    private JLabel oldPass;
    private JLabel newPass;
    private JLabel confirm;
    private JPasswordField old;
    private JPasswordField newP;
    private JPasswordField conf;
    private JButton save;
    private JButton cancel;

    public ForgotPassword() {
        frame = new JFrame("Login");
        logo = new JLabel("Password recovery");
        oldPass = new JLabel("Old password");
        newPass = new JLabel("New password");
        confirm = new JLabel("Confirm password");
        old = new JPasswordField();
        newP = new JPasswordField();
        conf = new JPasswordField();
        save = new JButton("Save");
        cancel = new JButton("Cancel");

        logo.setBounds(120,5, 100, 30);
        oldPass.setBounds(30, 40, 100, 30);
        newPass.setBounds(30, 75, 100, 30);
        confirm.setBounds(30, 115, 120, 30);
        old.setBounds(145, 40, 120, 30);
        newP.setBounds(145, 75, 120, 30);
        conf.setBounds(145, 115, 120, 30);
        save.setBounds(180, 155, 70, 30);
        cancel.setBounds(30, 155, 100, 30);
        save.addActionListener(e -> {
            String oldUseer = String.valueOf(old.getPassword());
            String newpass1 = String.valueOf(newP.getPassword());
            String newpass2 = String.valueOf(conf.getPassword());
            if(!newpass1.equals(newpass2)){
                JOptionPane.showMessageDialog(frame,"password incorrect");
            }
            else {
                JOptionPane.showMessageDialog(frame, "Password change successful");
                frame.dispose();
            }
        });
        cancel.addActionListener(e -> {
            frame.setVisible(false);
        });
        frame.add(logo); frame.add(oldPass); frame.add(newPass); frame.add(confirm);
        frame.add(old); frame.add(newP); frame.add(conf);
        frame.add(save); frame.add(cancel);

        frame.setSize(300, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
    }

    public String getPass(){
        return  String.valueOf(conf.getPassword());
    }
    public void showFrame() {
        frame.setVisible(true);
    }
}
