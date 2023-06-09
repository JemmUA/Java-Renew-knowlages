package codeBro.swing.aps.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {
    // I want to change calculations system:    (
    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton, negButton;
    private JPanel panel;
    private Font font;
    double num1, num2, result;
    Double num2buffer;
    char operator;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(410, 550);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        numberButtons = new JButton[10];
        functionButtons = new JButton[9];
        num1 = 0;
        num2 = 0;
        result = 0;

        font = new Font("Ink Free", Font.BOLD, 30);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setBackground(new Color(0xcccccc));
        textField.setFont(font);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        negButton = new JButton("(-)");
        equButton = new JButton("=");
        delButton = new JButton("<--");
        clrButton = new JButton("clear");
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(font);
            functionButtons[i].setFocusable(false);
        }

        for (int j = 0; j < 10; j++) {
            numberButtons[j] = new JButton(String.valueOf(j));
            numberButtons[j].setFont(font);
            numberButtons[j].addActionListener(this);
            numberButtons[j].setFocusable(false);
        }

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(new Color(0xdddddd));


        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == delButton) {
            String tempString = textField.getText();
            textField.setText("");
            for (int i = 0; i < tempString.length() - 1; i++) {
                textField.setText(textField.getText() + tempString.charAt(i));
            }
        }
         if (e.getSource() == negButton) {
            String tempString2 = textField.getText();
            textField.setText("-");
            for (int i = 0; i < tempString2.length() - 1; i++) {
                textField.setText(textField.getText() + tempString2.charAt(i));
            }
        }
        if (e.getSource() == clrButton) {
            textField.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());
            System.out.println("num2: " + num2);
            if (operator == '+') result = num1 + num2;
            if (operator == '-') result = num1 - num2;
            if (operator == '*') result = num1 * num2;
            if (operator == '/') result = num1 / num2;
            textField.setText(String.valueOf(result));
//            num1 = result;
        }

    }
}
