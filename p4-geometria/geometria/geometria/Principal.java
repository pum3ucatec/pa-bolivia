package geometria;

import javax.swing.*;

import java.awt.*;

public class Principal extends JPanel {

    public Rectangulo r1;

    public Principal() {
        this.r1 = new Rectangulo(new Point(300, 200), new Point(500, 300), Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.r1.dibujar(g);
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
