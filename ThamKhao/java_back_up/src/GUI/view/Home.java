package view;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Home extends JFrame {
    private JLabel lblRoomFund, lblGarbage,lblChangeWater,lblCleaningSchedule, lblTitle;
    private JButton btnRoomFund,btnGarbage, btnChangeWater, btnCleaningSchedule;
    private JPanel pnSetLayOut, center;
    public Home(String title) {
        this.setTitle(title);
        init();
        add();
        setBound();
        setNorth();
        setCenter();
        this.setSize(800,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
    }
    public void init(){
        lblRoomFund = new JLabel("Quy Phong");
        lblChangeWater = new JLabel("Doi nuoc");
        lblGarbage = new JLabel(" Do rac");
        lblCleaningSchedule = new JLabel("Lich don phong");
        lblTitle = new JLabel("Tieu De");

        btnRoomFund = new JButton("1");
        btnGarbage = new JButton("2");
        btnCleaningSchedule = new JButton("3");
        btnChangeWater = new JButton("4");
        pnSetLayOut = new JPanel(new BorderLayout());
        center = new JPanel(null);
//        center = new JPanel(new GridLayout(2, 2));
    }
    void setNorth(){
        pnSetLayOut.add(lblTitle,BorderLayout.NORTH);
        lblTitle.setPreferredSize(new Dimension(300, 50));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setFont(lblTitle.getFont().deriveFont(20.0f));
        lblTitle.setFont(lblTitle.getFont().deriveFont(Font.BOLD));
        lblTitle.setBackground(Color.pink);
        lblTitle.setOpaque(true);
    }

    void setCenter(){

        lblRoomFund.setBounds(30, 40, 100, 20);
        lblChangeWater.setBounds(30, 80, 100, 20);
        lblGarbage.setBounds(30, 120, 100, 20);
        lblCleaningSchedule.setBounds(30, 160, 150, 20);

        lblRoomFund.setFont(lblRoomFund.getFont().deriveFont(17.0f));
        lblChangeWater.setFont(lblChangeWater.getFont().deriveFont(17.0f));
        lblGarbage.setFont(lblGarbage.getFont().deriveFont(17.0f));
        lblCleaningSchedule.setFont(lblCleaningSchedule.getFont().deriveFont(17.0f));
        center.add(lblGarbage); center.add(lblCleaningSchedule); center.add(lblChangeWater); center.add(lblRoomFund);
        lblGarbage.setOpaque(true);
        lblCleaningSchedule.setOpaque(true);
        lblChangeWater.setOpaque(true);
        lblRoomFund.setOpaque(true);
    }
    public void add(){
        this.add(lblRoomFund); this.add(lblGarbage); this.add(lblChangeWater);this.add(lblCleaningSchedule);
        this.add(btnRoomFund); this.add(btnGarbage); this.add(btnChangeWater); this. add(btnCleaningSchedule);
        pnSetLayOut.setBackground(Color.LIGHT_GRAY);
        pnSetLayOut.add(btnGarbage,BorderLayout.SOUTH);
        btnRoomFund.setPreferredSize(new Dimension(150, 200));
        pnSetLayOut.add(btnRoomFund,BorderLayout.WEST);
        pnSetLayOut.add(btnChangeWater,BorderLayout.EAST);
        btnChangeWater.setPreferredSize(new Dimension(150, 200));
        pnSetLayOut.add(center,BorderLayout.CENTER);
        this.add(pnSetLayOut);
        this.pack();
    }
    public void setBound(){

    }
}
