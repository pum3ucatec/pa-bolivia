import javax.swing.*;
import java.awt.*;

public class Principal extends JPanel {

    private Triangulo t1;

    public Principal() {
        this.t1 = new Triangulo(new Point(100, 400), new Point(200, 300), new Point(300, 400), Color.blue);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.t1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Triangulo");
        Principal panel = new Principal();
       
        ventana.add(panel);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

