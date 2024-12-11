package tresraya;
// import javax.swing.JButton;
// import javax.swing.JPanel;
// import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;

public class Tablero extends JPanel {
    
    public Celda[][] celdas;
    public int CANTIDAD = 3;

    public Tablero() {
        GridLayout miLayout = new GridLayout(CANTIDAD, CANTIDAD);

        this.setLayout(miLayout);

        this.celdas = new Celda[this.CANTIDAD][this.CANTIDAD];

        for (int f = 0; f < this.CANTIDAD; f++) {
            for (int c = 0; c < this.CANTIDAD; c++) {
                this.celdas[f][c] = new Celda();
                this.add(this.celdas[f][c]);
            }
        }
    }

    public boolean hayCeldasVacias() {
        for (int fila = 0; fila < celdas.length; fila++) { // Recorrer filas
            for (int columna = 0; columna < celdas[fila].length; columna++) { // Recorrer columnas
                JButton boton = celdas[fila][columna]; // Obtener el botón actual
                if (boton.getText().trim().isEmpty()) {
                    return false;
                }               
            }
        }
        
        return true;
    }
}
