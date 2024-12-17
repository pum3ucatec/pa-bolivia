
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculadoraGUI extends JFrame implements ActionListener {

    private JTextField pantalla;
    private JButton[] botonesNumeros = new JButton[10];
    private JButton btnSuma, btnResta, btnMultiplicacion, btnDivision, btnIgual, btnClear;
    private double num1 = 0, num2 = 0;
    private String operador = "";

    public CalculadoraGUI() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Pantalla
        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        add(pantalla, BorderLayout.NORTH);

        // Panel de botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Botones numéricos
        for (int i = 0; i < 10; i++) {
            botonesNumeros[i] = new JButton(String.valueOf(i));
            botonesNumeros[i].addActionListener(this);
            panel.add(botonesNumeros[i]);
        }

        // Botones de operaciones
        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMultiplicacion = new JButton("×");
        btnDivision = new JButton("÷");
        btnIgual = new JButton("=");
        btnClear = new JButton("C");

        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnMultiplicacion.addActionListener(this);
        btnDivision.addActionListener(this);
        btnIgual.addActionListener(this);
        btnClear.addActionListener(this);

        panel.add(btnSuma);
        panel.add(btnResta);
        panel.add(btnMultiplicacion);
        panel.add(btnDivision);
        panel.add(btnClear);
        panel.add(btnIgual);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == botonesNumeros[i]) {
                pantalla.setText(pantalla.getText() + i);
            }
        }

        if (e.getSource() == btnClear) {
            pantalla.setText("");
            num1 = num2 = 0;
            operador = "";
        }

        if (e.getSource() == btnSuma || e.getSource() == btnResta || e.getSource() == btnMultiplicacion || e.getSource() == btnDivision) {
            num1 = Double.parseDouble(pantalla.getText());
            pantalla.setText("");
            operador = e.getActionCommand();
        }

        if (e.getSource() == btnIgual) {
            num2 = Double.parseDouble(pantalla.getText());
            Operacion operacion;

            switch (operador) {
                case "+":
                    operacion = new Suma(num1, num2);
                    break;
                case "-":
                    operacion = new Resta(num1, num2);
                    break;
                case "×":
                    operacion = new Multiplicacion(num1, num2);
                    break;
                case "÷":
                    operacion = new Division(num1, num2);
                    break;
                default:
                    operacion = null;
            }

            if (operacion != null) {
                pantalla.setText(String.valueOf(operacion.calcular()));
            }
        }
    }
}
