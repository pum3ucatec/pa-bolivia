package geometria;

import javax.swing.*;

import java.awt.*;

public class Principal extends JPanel {

    public Rectangulo r1;
    public Cuadrado obj1Cuadrado;

    public Principal() {
        this.r1 = new Rectangulo(new Point(300, 200), new Point(500, 300), Color.RED);
        this.obj1Cuadrado = new Cuadrado(new Point(100, 50), 75, Color.PINK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.r1.dibujar(g);
        this.obj1Cuadrado.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Rectángulo");
        Principal panel = new Principal();
       
        ventana.add(panel);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
