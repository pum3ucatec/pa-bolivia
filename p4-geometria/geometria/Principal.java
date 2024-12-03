package geometria;

import javax.swing.*;
import java.awt.*;

public class Principal extends JPanel {

    public Rectangulo r1;
    public Cuadrado c1;
    public Redondo rd1;

    public Principal() {
        this.r1 = new Rectangulo(new Point(300, 200), new Point(500, 300), Color.RED);
        this.c1 = new Cuadrado(new Point(100, 100), 100, Color.BLUE);
        this.rd1 = new Redondo(new Point(400, 500), 50, Color.GREEN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.r1.dibujar(g);
        this.c1.dibujar(g);
        this.rd1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Figuras");
        Principal panel = new Principal();

        ventana.add(panel);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
