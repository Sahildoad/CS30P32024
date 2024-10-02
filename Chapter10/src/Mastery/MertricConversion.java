package Mastery;

import javax.swing.*;
import java.awt.event.*;

public class MertricConversion extends JFrame {
    private JComboBox<String> comboBox;
    private JLabel resultLabel;

    public MertricConversion() {
        setTitle("MetricConversion");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        String[] conversions = {"Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"};
        comboBox = new JComboBox<>(conversions);
        comboBox.setBounds(50, 20, 200, 30);
        add(comboBox);

        resultLabel = new JLabel("Select a conversion type:");
        resultLabel.setBounds(50, 60, 250, 30);
        add(resultLabel);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedConversion = (String) comboBox.getSelectedItem();
                displayConversion(selectedConversion);
            }
        });
    }

    private void displayConversion(String conversion) {
        switch (conversion) {
            case "Inches to Centimeters":
                resultLabel.setText("1 inch = 2.54 centimeters");
                break;
            case "Feet to Meters":
                resultLabel.setText("1 foot = 0.3048 meters");
                break;
            case "Gallons to Liters":
                resultLabel.setText("1 gallon = 4.5461 liters");
                break;
            case "Pounds to Kilograms":
                resultLabel.setText("1 pound = 0.4536 kilograms");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MertricConversion().setVisible(true);
            }
        });
    }
}














