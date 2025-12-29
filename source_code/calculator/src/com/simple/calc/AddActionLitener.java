package com.simple.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddActionLitener implements ActionListener {
    private CalculatorWindow calculatorWindow;

    public AddActionLitener(CalculatorWindow calculatorWindow) {
            this.calculatorWindow = calculatorWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(
                    calculatorWindow.getTf1().getText());

            double num2 = Double.parseDouble(
                    calculatorWindow.getTf2().getText());

            double result = num2 + num1;

        calculatorWindow.getTfOut().setText(result+"");
    }
}
