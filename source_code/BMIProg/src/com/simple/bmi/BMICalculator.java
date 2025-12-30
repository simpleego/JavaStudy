package com.simple.bmi;

import javax.swing.*;
import java.awt.*;

public class BMICalculator extends JFrame {
    private JTextField tfHeight;
    private JTextField tfWeight;
    private JTextArea taResult;

    public BMICalculator() throws HeadlessException {
        setTitle("BMI: 비만도 측정");
        setSize(350,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 입력패널
        JPanel inputPanel = new JPanel(new GridLayout(2,2));
        // 객체 생성
        JLabel lbl1 = new JLabel(" 키 : ");
        tfHeight = new JTextField(5);

        JLabel lbl2 = new JLabel(" 몸무게 : ");
        tfWeight = new JTextField(5);
        taResult = new JTextArea(5,10);

        JButton button = new JButton("BMI 계산");

        // 판넬에 등록
        inputPanel.add(lbl1);
        inputPanel.add(tfHeight);
        inputPanel.add(lbl2);
        inputPanel.add(tfWeight);

        // 객체 등록(배치)
        add(inputPanel,BorderLayout.NORTH);

        add(taResult);
        add(button,BorderLayout.CENTER);

        // 윈도우 보이기
        setVisible(true);
    }

    public static void main(String[] args) {
        new BMICalculator();
    }
}
