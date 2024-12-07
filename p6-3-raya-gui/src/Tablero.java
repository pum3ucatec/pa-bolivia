// import javax.swing.JButton;
// import javax.swing.JPanel;
// import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class Tablero extends JPanel {
    
    public JButton[][] celdas;
    public int CANTIDAD = 3;

    public Tablero() {
        GridLayout miLayout = new GridLayout(CANTIDAD, CANTIDAD);

        this.setLayout(miLayout);

        this.celdas = new JButton[this.CANTIDAD][this.CANTIDAD];

        for (int f = 0; f < this.CANTIDAD; f++) {
            for (int c = 0; c < this.CANTIDAD; c++) {
                this.celdas[f][c] = new JButton(" ");
                this.add(this.celdas[f][c]);
            }
        }
    }

    
}
