package view;

import javax.swing.*;

public class forgotPass extends JFrame{
    private JLabel lblLogo, lblOldPass, lblNewPass,lblConfirm;
    private JPasswordField ptxtOld, ptxtNew, ptxtConfirm;
    private JButton btnSave, btnCancel;

    public forgotPass(String title) {
        this.setTitle(title);
        init();
        setBound();
        add();
        this.setSize(300, 220);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    public JLabel getLblLogo() {
        return lblLogo;
    }

    public JPasswordField getPtxtOld() {
        return ptxtOld;
    }

    public JPasswordField getPtxtNew() {
        return ptxtNew;
    }

    public JPasswordField getPtxtConfirm() {
        return ptxtConfirm;
    }

    public void init(){
        lblLogo = new JLabel("Password recovery");
        lblOldPass = new JLabel("Old password");
        lblNewPass = new JLabel("New password");
        lblConfirm = new JLabel("Confirm password");
        ptxtOld = new JPasswordField();
        ptxtNew = new JPasswordField();
        ptxtConfirm = new JPasswordField();
        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");
    }
    public void setBound(){
        lblLogo.setBounds(120,5, 100, 30);
        lblOldPass.setBounds(30, 40, 100, 30);
        lblNewPass.setBounds(30, 75, 100, 30);
        lblConfirm.setBounds(30, 115, 120, 30);
        ptxtOld.setBounds(145, 40, 120, 30);
        ptxtNew.setBounds(145, 75, 120, 30);
        ptxtConfirm.setBounds(145, 115, 120, 30);
        btnSave.setBounds(180, 155, 70, 30);
        btnCancel.setBounds(30, 155, 100, 30);
    }
    public void add(){
        this.add(lblLogo); this.add(lblOldPass); this.add(lblNewPass); this.add(lblConfirm);
        this.add(ptxtOld); this.add(ptxtNew); this.add(ptxtConfirm);
        this.add(btnSave); this.add(btnCancel);
    }
}
