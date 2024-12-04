package circunferencia;

import javax.swing.*;
import java.awt.*;

public class dibCircunferencia extends JPanel {
    public Circunferencia c1;

    public dibCircunferencia() {
        this.c1 = new Circunferencia(new Point(300, 200), 100, Color.ORANGE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.c1.dibujar(g);
    }

    public static void main(String[] args) {
    JFrame ventana = new JFrame("Dibujo de Circunferencia");
    dibCircunferencia panel = new dibCircunferencia();

    ventana.add(panel);
    ventana.setSize(800, 800);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);
}
    
}
