package geometria2;

import java.awt.*;
import javax.swing.*;

public class Principal extends JPanel {

    public Triangulo t1;
    public Elipse e1;

    public Principal() {
        this.t1 = new Triangulo(new Point(300, 500), 100, Color.GREEN);
        this.e1 = new Elipse(new Point(200, 100), new Point(400, 300), Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.t1.dibujar(g);
        this.e1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujos geométricos");
        Principal panel = new Principal();

        ventana.add(panel);
        ventana.setSize(600, 600); // Tamaño ajustado
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
