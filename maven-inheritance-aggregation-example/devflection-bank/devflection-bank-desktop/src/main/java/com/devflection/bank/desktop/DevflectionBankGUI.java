package com.devflection.bank.desktop;

import com.devflection.bank.desktop.ActionListeners.MortgageButtonActionListener;

import javax.swing.*;

public class DevflectionBankGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Devflection mortgage calculator GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        JPanel panel = new JPanel();

        JLabel mortgageLabel = new JLabel();

        JButton button = new JButton("Get a random mortgage");
        button.addActionListener(new MortgageButtonActionListener(mortgageLabel));

        panel.add(button);
        panel.add(mortgageLabel);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
