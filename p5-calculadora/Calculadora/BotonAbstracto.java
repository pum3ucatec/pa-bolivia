package Calculadora;


import javax.swing.JButton;
import java.awt.Color;

public abstract class BotonAbstracto extends JButton {
    private String etiqueta;

    public BotonAbstracto(String etiqueta) {
        super(etiqueta);
        this.etiqueta = etiqueta;
        this.setBounds(10, 10, 100, 50);  // Tamaño y posición del botón
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public abstract void hacerClic();
}
