package examen_final;

import javax.swing.*;
import java.awt.*;

public class Principal extends JPanel {
    public Triangulo t1;
    public Elipse e1;

    public Principal() {
        this.t1 = new Triangulo(new Point(300, 100), new Point(200, 300), new Point(400, 300), Color.RED);
        this.e1 = new Elipse(new Point(500, 400), 100, 50, Color.BLUE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.t1.dibujar(g);
        this.e1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Raulito dibujando un Triángulo y Elipse");
        Principal panel = new Principal();
        ventana.add(panel);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
