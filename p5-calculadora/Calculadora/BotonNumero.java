package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class BotonNumero extends BotonAbstracto {

    public BotonNumero(int numero) {
        super(String.valueOf(numero));
        this.setBackground(Color.LIGHT_GRAY); //color gris claro

        // Añadiendo un action listener para manejar el clic en el botón
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hacerClic();
            }
        });
    }

    @Override
    public void hacerClic() {
        // Acción que se realiza al hacer clic en el botón
        System.out.println("Botón " + getEtiqueta() + " fue presionado");
    }
}
