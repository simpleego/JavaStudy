package com.simple.calc;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindow extends JFrame {
    private JTextField tf1, tf2, tfOut;
    private JLabel lbl1, lbl2, lbl3;
    private JButton btnAdd, btnSub, btnMul, btnDiv;

    public CalculatorWindow() throws HeadlessException {
        // 윈도우 설정
        setTitle("OOP 계산기");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // 객체 생성
        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        tfOut = new JTextField(10);

        lbl1 = new JLabel("숫자1: ");
        lbl2 = new JLabel("숫자2: ");
        lbl3 = new JLabel("연산결과: ");

        btnAdd = new JButton("덧셈");
        btnSub = new JButton("뺄셈");
        btnMul = new JButton("곱셈");
        btnDiv = new JButton("나눗셈");

        // 객체 등록
        add(lbl1); add(tf1);
        add(lbl2); add(tf2);
        add(btnAdd);add(btnSub);add(btnMul);add(btnDiv);
        add(lbl3);add(tfOut);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorWindow();
    }
}
