package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorGUI extends JFrame {
    private final Calculator calculator = new Calculator();
    private JTextField input1,input2, result;

    public CalculatorGUI() {
        setTitle("Calculator");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2));

        add(new JLabel("Number 1:"));
        input1 = new JTextField();
        add(input1);

        add(new JLabel("Number 2:"));
        input2 = new JTextField();
        add(input2);

        add(new JLabel("Result:"));
        result = new JTextField();
        add(result);

        JButton addButton = new JButton("+");
        addButton.addActionListener(e->performOperation("add"));
        add(addButton);

        JButton subButton = new JButton("-");
        subButton.addActionListener(e->performOperation("subtract"));
        add(subButton);

        JButton multiButton = new JButton("*");
        multiButton.addActionListener(e->performOperation("multiply"));
        add(multiButton);

        JButton divideButton = new JButton("/");
        divideButton.addActionListener(e->performOperation("divide"));
        add(divideButton);

        setVisible(true);
    }

    private void performOperation(String operation) {
        try{
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double res = 0;

            switch (operation) {
                case "add":
                    res = num1 + num2;
                    break;
                case "subtract":
                    res = num1 - num2;
                    break;
                case "multiply":
                    res = num1 * num2;
                    break;
                case "divide":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(this, "Division by zero is not allowed.");
                        return;
                    }
                    res = calculator.divide(num1, num2);
                    break;
            }
            result.setText(String.valueOf(res));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter a number");
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorGUI::new);
    }
}
