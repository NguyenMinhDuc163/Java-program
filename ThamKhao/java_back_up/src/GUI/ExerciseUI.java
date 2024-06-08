package GUI;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ExerciseUI extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JButton readButton;
    private JButton sortButton;

    public ExerciseUI() {
        setTitle("Exercise Interface");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        readButton = new JButton("Đọc từ file");
        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readFromFile();
            }
        });

        sortButton = new JButton("Sắp xếp");
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortData();
            }
        });

        panel.add(readButton);
        panel.add(sortButton);

        model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("Data");

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);

        getContentPane().add(panel, BorderLayout.CENTER);
    }

    private void readFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                String line;
                while ((line = reader.readLine()) != null) {
                    model.addRow(new Object[]{line});
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void sortData() {
        ArrayList<String> dataList = new ArrayList<>();
        for (int i = 0; i < model.getRowCount(); i++) {
            dataList.add((String) model.getValueAt(i, 0));
        }
        Collections.sort(dataList);
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt(dataList.get(i), i, 0);
        }
    }

    public static void main(String[] args) {
        ExerciseUI exerciseUI = new ExerciseUI();
        exerciseUI.setVisible(true);
    }
}
