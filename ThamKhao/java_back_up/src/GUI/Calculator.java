package GUI;

import javax.swing.*;

public class Calculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JLabel firstNum = new JLabel("First Number");
        JLabel secondNum = new JLabel("Second Number");
        JLabel ans = new JLabel("Answer");
        JButton sum = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton equal = new JButton("=");
        JButton clr = new JButton("CLEAR");

        sum.setBounds(50, 170, 50, 30);
        sub.setBounds(130, 170, 50, 30);
        mul.setBounds(260, 170, 50, 30);
        div.setBounds(340, 170, 50, 30);
        equal.setBounds(50, 220, 50, 30);
        clr.setBounds(120, 220, 100, 30);
        frame.add(sum); frame.add(sub); frame.add(mul);
        frame.add(div); frame.add(equal);frame.add(clr);
        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JTextField cal = new JTextField();

        sum.addActionListener(e ->{
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            cal.setText(n1 + n2 + "");
        });
        sub.addActionListener(e ->{
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            cal.setText(n1 - n2 + "");
        });
        mul.addActionListener(e ->{
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            cal.setText(n1 * n2 + "");
        });
        div.addActionListener(e ->{
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            if(n2 != 0)
                cal.setText(1.0 * n1 / n2 + "");
            else{
                JOptionPane.showMessageDialog(frame, "ERROR!");
            }
        });
        clr.addActionListener(e ->{
            num1.setText("");
            num2.setText("");
            cal.setText("");
        });
        equal.addActionListener(e ->{
            JOptionPane.showMessageDialog(frame,"Ket qua cua ban la " + cal.getText());
        });
        num1.setBounds(200, 30, 100, 30);
        num2.setBounds(200, 70, 100, 30);
        cal.setBounds(200, 110, 100, 30);
        firstNum.setBounds(30, 30, 100, 30);
        secondNum.setBounds(30, 70, 100, 30);
        ans.setBounds(30, 110, 100, 30);

        frame.add(firstNum); frame.add(secondNum); frame.add(ans);
        frame.add(num1); frame.add(num2); frame.add(cal);

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
