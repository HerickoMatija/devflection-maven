package com.devflection.bank.desktop.ActionListeners;

import com.devflection.bank.models.Mortgage;
import services.MortgageService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Random;

public class MortgageButtonActionListener implements ActionListener {

    private Random random = new Random();

    private JLabel label;

    public MortgageButtonActionListener(JLabel label) {
        this.label = label;
    }

    public void actionPerformed(ActionEvent e) {
        int amount = random.nextInt(100000);

        BigDecimal loanAmount = new BigDecimal(amount);
        BigDecimal downPayment = new BigDecimal(random.nextDouble() * amount);
        int duration = random.nextInt(72);

        Mortgage mortgage = getMortgage("My name", loanAmount, downPayment, duration);

        label.setText(mortgage.toString());
    }

    private Mortgage getMortgage(String name, BigDecimal amount, BigDecimal downPayment, int duration) {
        return MortgageService.getMortgage(name, amount, downPayment, duration);

    }
}
