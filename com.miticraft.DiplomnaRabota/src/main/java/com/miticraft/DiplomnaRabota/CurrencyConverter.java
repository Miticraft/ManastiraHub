package com.miticraft.DiplomnaRabota;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame {
    private JComboBox<String> currencyComboBox;
    private JTextField amountField;
    private JLabel resultLabel;
    private JLabel changeLabel;
    private JButton convertButton;
    private JButton payButton;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Currency selection
        add(new JLabel("Избери вид валута за обмяна:"));
        String[] currencies = {"Евро", "Долар", "Фунт"};
        currencyComboBox = new JComboBox<>(currencies);
        add(currencyComboBox);

        // Exchange rate
        add(new JLabel("Валутен курс за 1:"));
        JLabel rateLabel = new JLabel("1.95583 лв.");
        add(rateLabel);

        // Amount to pay
        add(new JLabel("Платена сума на каса:"));
        amountField = new JTextField();
        add(amountField);

        // Pay button
        payButton = new JButton("Плати");
        add(payButton);

        // Change label
        add(new JLabel("Ресто:"));
        changeLabel = new JLabel("0.00 лв.");
        add(changeLabel);

        // Convert button
        convertButton = new JButton("Конвертирай");
        add(convertButton);

        // Result label
        add(new JLabel("Левова разностойност:"));
        resultLabel = new JLabel("0.00 лв.");
        add(resultLabel);

        // Event handling
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateChange();
            }
        });
    }

    private void convertCurrency() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            double rate = 1.95583; // Fixed rate for demonstration
            double result = amount * rate;
            resultLabel.setText(String.format("%.2f лв.", result));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Невалидна сума");
        }
    }

    private void calculateChange() {
        try {
            double paidAmount = Double.parseDouble(amountField.getText());
            double change = paidAmount - 195.58; // Assuming the cost is 195.58 лв.
            changeLabel.setText(String.format("%.2f лв.", change));
        } catch (NumberFormatException ex) {
            changeLabel.setText("Невалидна сума");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }
}
