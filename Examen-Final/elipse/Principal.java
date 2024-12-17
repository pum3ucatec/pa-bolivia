import javax.swing.*;
import java.awt.*;

public class Principal extends JPanel {

    private Elipse e1;

    public Principal() {
        this.e1 = new Elipse(new Point(300, 200), 150, 100, Color.green);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.e1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Elipse");
        Principal panel = new Principal();
       
        ventana.add(panel);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
