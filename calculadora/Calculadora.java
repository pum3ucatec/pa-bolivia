package calculadora;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraGUI());
    }
}