package cuadrado;

import javax.swing.*;

import java.awt.*;

public class Principal extends JPanel {

    public Cuadrado c1;

    public Principal() {
        this.c1 = new Cuadrado(new Point(300, 200), 200, Color.yellow);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.c1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Cuadrado");
        Principal panel = new Principal();
       
        ventana.add(panel);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
