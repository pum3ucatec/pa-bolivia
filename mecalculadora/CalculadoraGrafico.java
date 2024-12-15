package mecalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGrafico extends CalculadoraLogica {
    
    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton;
    private JPanel panel;

    private double num1, num2, result;
    private char operator;

    public CalculadoraGrafico() {
        
        frame = new JFrame("Calculadora de Raulito");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);
        frame.add(textField);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new NumberListener());
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clrButton = new JButton("C");

        functionButtons = new JButton[]{addButton, subButton, mulButton, divButton, eqButton, clrButton};
        for (JButton button : functionButtons) {
            button.addActionListener(new FunctionListener());
        }

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

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
        panel.add(clrButton);
        panel.add(numberButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class NumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String value = ((JButton) e.getSource()).getText();
            textField.setText(textField.getText() + value);
        }
    }

    private class FunctionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();
            try {
                switch (command) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        num1 = Double.parseDouble(textField.getText());
                        operator = command.charAt(0);
                        textField.setText("");
                        break;
                    case "=":
                        num2 = Double.parseDouble(textField.getText());
                        switch (operator) {
                            case '+': result = sumar(num1, num2); break;
                            case '-': result = restar(num1, num2); break;
                            case '*': result = multiplicar(num1, num2); break;
                            case '/': result = dividir(num1, num2); break;
                        }
                        textField.setText(String.valueOf(result));
                        break;
                    case "C":
                        textField.setText("");
                        num1 = num2 = result = 0;
                        operator = '\0';
                        break;
                }
            } catch (Exception ex) {
                textField.setText("Error");
            }
        }
    }
}
