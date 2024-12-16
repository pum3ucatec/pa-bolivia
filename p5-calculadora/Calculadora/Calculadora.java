package Calculadora;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;

import javax.script.ScriptEngineManager; 
import javax.script.ScriptEngine; 
import javax.script.ScriptException;

public class Calculadora extends JFrame {
    
    private JTextField pantallaA;
    private JTextField pantallaB;
    
    public Calculadora() {
        // Configuración de la ventana
        this.setTitle("Pago y cobro de servicios a instituciones");
        this.setSize(590, 400); // Tamaño de la ventana en píxeles
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel con un GridLayout para organizar los botones
        JPanel panel = new JPanel();
        panel.setLayout(null); // Usar layout nulo para posicionar botones manualmente
        panel.setBackground(new Color(0, 0, 64)); // Azul marino oscuro
        
        //crear y configurar el campo de texto en la pantalla
        pantallaA = new JTextField();
        pantallaA.setBounds(10,10,440,50);
        panel.add(pantallaA);
        
        //crear y configurar el campo de texto en la pantalla
        pantallaB = new JTextField();
        pantallaB.setBounds(460,10,100,50);
        panel.add(pantallaB);

        // Añadir 9 botones numerados al panel
        for (int i = 0; i < 9; i++) {
            BotonNumero boton = new BotonNumero(i + 1);
            boton.setBounds(10 + (i % 3) * 110, 120 + (i / 3) * 60, 100, 50);  // Posición y tamaño del botón
            panel.add(boton);
        }

        // Añadir botones de operaciones al panel
        String[] operaciones = {"+", "-", "*", "/"};
        for (int i = 0; i < operaciones.length; i++) {
            BotonOperacion boton = new BotonOperacion(operaciones[i]);
            boton.setBounds(350, 120 + i * 60, 100, 50);  // Posición y tamaño del botón
            panel.add(boton);
        }

        // Añadir botones de operaciones adicionales al panel
        String[] operacionesAdicionales = {"<]", "^", "raiz", "%"};
        for (int i = 0; i < operacionesAdicionales.length; i++) {
            BotonOperacion boton = new BotonOperacion(operacionesAdicionales[i]);
            boton.setBounds(460, 120 + i * 60, 100, 50);  // Posición y tamaño del botón
            panel.add(boton);
        }

        // Añadir botón "C"
        BotonOperacion botonC = new BotonOperacion("C");
        botonC.setBounds(10, 300, 100, 50);  // Posición y tamaño del botón
        panel.add(botonC);

        // Añadir botón "0"
        BotonNumero boton0 = new BotonNumero(0);
        boton0.setBounds(120, 300, 100, 50);  // Posición y tamaño del botón
        panel.add(boton0);

        // Añadir botón "="
        BotonOperacion botonIgual = new BotonOperacion("=");
        botonIgual.setBounds(230, 300, 100, 50);  // Posición y tamaño del botón
        panel.add(botonIgual);

        // Añadir el panel a la ventana
        this.add(panel);
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        Calculadora ventana = new Calculadora();
        ventana.setVisible(true);
    }
}
