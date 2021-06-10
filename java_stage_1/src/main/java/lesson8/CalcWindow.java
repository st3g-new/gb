package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalcWindow extends JFrame {
    private Double d1;
    private Double d2;
    private Operation operation;

    public CalcWindow() throws HeadlessException {
        setTitle("Калькулятор");
        setBounds(300, 300, 231, 290);
        setResizable(false); //запрет изменять размеры формы
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null); //включил ручное задание координат элементов

        JTextField textField = new JTextField();
        textField.setBounds(10, 20, 194, 45);
        add(textField);
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9'))) {
                    e.consume();
                }
            }
        });

        JButton backspaceButton = new JButton("\u2190", null);
        backspaceButton.setBounds(10, 80, 44, 27);
        add(backspaceButton);
        backspaceButton.addActionListener(e -> {
            String s = textField.getText();
            s = s.substring(0, s.length() - 1);
            textField.setText(s);
        });

        JButton sqrtButton = new JButton("\u221A", null);
        sqrtButton.setBounds(60, 80, 44, 27);
        add(sqrtButton);
        sqrtButton.addActionListener(e -> {
            if (textField.getText().length() != 0) {
                double d = Double.parseDouble(textField.getText());
                if (d >= 0) {
                    d = Math.sqrt(d);
                    textField.setText(Double.toString(d));
                } else {
                    textField.setText("Недопустимый ввод");
                }
            }
        });

        JButton clearButton = new JButton("C", null);
        clearButton.setBounds(110, 80, 44, 27);
        add(clearButton);
        clearButton.addActionListener(e -> textField.setText(""));

        JButton changeSignButton = new JButton("\u00B1", null);
        changeSignButton.setBounds(160, 80, 44, 27);
        add(changeSignButton);
        changeSignButton.addActionListener(e -> {
            if (textField.getText().contains("-")) {
                String s = textField.getText().substring(1);
                textField.setText(s);
            } else {
                String s = "-" + textField.getText();
                textField.setText(s);
            }
        });


        JButton sevenButton = new JButton("7", null);
        sevenButton.setBounds(10, 113, 44, 27);
        add(sevenButton);
        setNumber(sevenButton, textField, "7");

        JButton eightButton = new JButton("8", null);
        eightButton.setBounds(60, 113, 44, 27);
        add(eightButton);
        setNumber(eightButton, textField, "8");

        JButton nineButton = new JButton("9", null);
        nineButton.setBounds(110, 113, 44, 27);
        add(nineButton);
        setNumber(nineButton, textField, "9");

        JButton deleteButton = new JButton("\u00F7", null);
        deleteButton.setBounds(160, 113, 44, 27);
        add(deleteButton);
        deleteButton.addActionListener(e -> {
            d1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = Operation.Division;
        });


        JButton fourButton = new JButton("4", null);
        fourButton.setBounds(10, 146, 44, 27);
        add(fourButton);
        setNumber(fourButton, textField, "4");

        JButton fiveButton = new JButton("5", null);
        fiveButton.setBounds(60, 146, 44, 27);
        add(fiveButton);
        setNumber(fiveButton, textField, "5");

        JButton sixButton = new JButton("6", null);
        sixButton.setBounds(110, 146, 44, 27);
        add(sixButton);
        setNumber(sixButton, textField, "6");

        JButton multiplyButton = new JButton("\u00D7", null);
        multiplyButton.setBounds(160, 146, 44, 27);
        add(multiplyButton);
        multiplyButton.addActionListener(e -> {
            d1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = Operation.Multiply;
        });

        JButton oneButton = new JButton("1", null);
        oneButton.setBounds(10, 179, 44, 27);
        add(oneButton);
        setNumber(oneButton, textField, "1");

        JButton twoButton = new JButton("2", null);
        twoButton.setBounds(60, 179, 44, 27);
        add(twoButton);
        setNumber(twoButton, textField, "2");

        JButton threeButton = new JButton("3", null);
        threeButton.setBounds(110, 179, 44, 27);
        add(threeButton);
        setNumber(threeButton, textField, "3");

        JButton minusButton = new JButton("-", null);
        minusButton.setBounds(160, 179, 44, 27);
        add(minusButton);
        minusButton.addActionListener(e -> {
            d1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = Operation.Minus;
        });


        JButton zeroButton = new JButton("0", null);
        zeroButton.setBounds(10, 212, 44, 27);
        add(zeroButton);
        zeroButton.addActionListener(e -> {
            if (textField.getText().length() > 0) {
                String s = textField.getText() + "0";
                textField.setText(s);
            }
        });

        JButton pointButton = new JButton(".", null);
        pointButton.setBounds(60, 212, 44, 27);
        add(pointButton);
        pointButton.addActionListener(e -> {
            if (!textField.getText().contains(".")) {
                String s = textField.getText() + ".";
                textField.setText(s);
            }
        });

        JButton plusButton = new JButton("+", null);
        plusButton.setBounds(110, 212, 44, 27);
        add(plusButton);
        plusButton.addActionListener(e -> {
            d1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = Operation.Addition;
        });

        JButton equalButton = new JButton("=", null);
        equalButton.setBounds(160, 212, 44, 27);
        add(equalButton);
        equalButton.addActionListener(e -> {
            switch (operation) {
                case Division -> {
                    d2 = Double.parseDouble(textField.getText());
                    double del = d1 / d2;
                    textField.setText(checkIntegerOrDouble(del));
                    d1 = 0.;
                    d2 = 0.;
                }
                case Multiply -> {
                    d2 = Double.parseDouble(textField.getText());
                    double multiply = d1 * d2;
                    textField.setText(checkIntegerOrDouble(multiply));
                    d1 = 0.;
                    d2 = 0.;
                }
                case Addition -> {
                    d2 = Double.parseDouble(textField.getText());
                    double plus = d1 + d2;
                    textField.setText(checkIntegerOrDouble(plus));
                    d1 = 0.;
                    d2 = 0.;
                }
                case Minus -> {
                    d2 = Double.parseDouble(textField.getText());
                    double minus = d1 - d2;
                    textField.setText(checkIntegerOrDouble(minus));
                    d1 = 0.;
                    d2 = 0.;
                }
            }
        });
        setVisible(true);
    }

    public String checkIntegerOrDouble(double number) {
        if (number % 1 == 0) {
            return Integer.toString((int) number);
        } else {
            return Double.toString(number);
        }
    }

    public void setNumber(JButton button, JTextField textField, String value) {
        button.addActionListener(e -> {
            String s = textField.getText() + value;
            textField.setText(s);
        });
    }
}
