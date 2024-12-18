import javax.swing.*;
import java.awt.*;

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Dibujar Elipse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new Elipse()); // Añadir el panel personalizado
        frame.setVisible(true);
    }
}

// Clase Elipse que extiende JPanel para dibujar una elipse
class Elipse extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Suavizar los bordes de la elipse
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar la elipse
        g2d.setColor(Color.BLUE);
        g2d.fillOval(100, 50, 200, 150); // Coordenadas x, y, ancho, alto
    }
}
