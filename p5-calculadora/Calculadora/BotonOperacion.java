package Calculadora;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class BotonOperacion extends BotonAbstracto {

    public BotonOperacion(String etiqueta) {
        super(etiqueta);
        this.setBackground(Color.GRAY); //color gris neutro

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
        System.out.println("Operación " + getEtiqueta() + " fue seleccionada");
    }
}
