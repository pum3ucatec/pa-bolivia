package geometria04;

import javax.swing.*;
import java.awt.*;

public class Principal extends JPanel {

    public Triangulo t1;
    public Elipse e1;

    public Principal() {

        this.t1 = new Triangulo(new Point(100, 500), new Point(200, 300), new Point(300, 500), Color.BLACK);
        this.e1 = new Elipse(new Point(400, 400), 100, 50, Color.MAGENTA);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.t1.dibujar(g);
        this.e1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Figuras Geométricas");
        Principal panel = new Principal();

        ventana.add(panel);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
