package hexagono;

import javax.swing.*;

import java.awt.*;

public class Principal extends JPanel {

    public Hexagono h1;

    public Principal() {
        this.h1 = new Hexagono(new Point(300, 200), 100, Color.black);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.h1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Hexagono");
        Principal panel = new Principal();
       
        ventana.add(panel);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
