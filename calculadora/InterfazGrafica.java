package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculadoraGUI extends JFrame {
    private JTextField numero1Field;
    private JTextField numero2Field;
    private JLabel resultadoLabel;
    private ManejadorOperaciones manejador;

    public CalculadoraGUI() {
        manejador = new ManejadorOperaciones();

        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Componentes de la interfaz
        add(new JLabel("Número 1:"));
        numero1Field = new JTextField();
        add(numero1Field);

        add(new JLabel("Número 2:"));
        numero2Field = new JTextField();
        add(numero2Field);

        JButton sumarButton = new JButton("Sumar");
        sumarButton.addActionListener(new OperacionListener("sumar"));
        add(sumarButton);

        JButton restarButton = new JButton("Restar");
        restarButton.addActionListener(new OperacionListener("restar"));
        add(restarButton);

        JButton multiplicarButton = new JButton("Multiplicar");
        multiplicarButton.addActionListener(new OperacionListener("multiplicar"));
        add(multiplicarButton);

        JButton dividirButton = new JButton("Dividir");
        dividirButton.addActionListener(new OperacionListener("dividir"));
        add(dividirButton);

        add(new JLabel("Resultado:"));
        resultadoLabel = new JLabel();
        add(resultadoLabel);

        setVisible(true);
    }

    private class OperacionListener implements ActionListener {
        private String operacion;

        public OperacionListener(String operacion) {
            this.operacion = operacion;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double numero1 = Double.parseDouble(numero1Field.getText());
                double numero2 = Double.parseDouble(numero2Field.getText());
                double resultado = 0;

                switch (operacion) {
                    case "sumar":
                        resultado = manejador.sumar(numero1, numero2);
                        break;
                    case "restar":
                        resultado = manejador.restar(numero1, numero2);
                        break;
                    case "multiplicar":
                        resultado = manejador.multiplicar(numero1, numero2);
                        break;
                    case "dividir":
                        resultado = manejador.dividir(numero1, numero2);
                        break;
                }

                resultadoLabel.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(CalculadoraGUI.this, "Por favor, ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(CalculadoraGUI.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
