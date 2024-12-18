import javax.swing.*;
import java.awt.*;

public class MovingEllipse extends JPanel {
    private int x = 0; // Posición inicial en x
    private int y = 100; // Posición inicial en y
    private int dx = 5; // Incremento de movimiento en x
    private int dy = 2; // Incremento de movimiento en y

    public static void main(String[] args) {
        JFrame frame = new JFrame("Elipse en Movimiento");
        MovingEllipse panel = new MovingEllipse();

        frame.add(panel);
        frame.setSize(800, 400); // Tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.animate(); // Inicia la animación
    }

    // Método para animar la elipse
    public void animate() {
        while (true) {
            x += dx;
            y += dy;

            // Cambia de dirección si alcanza los bordes de la ventana
            if (x < 0 || x + 100 > getWidth()) {
                dx = -dx;
            }
            if (y < 0 || y + 50 > getHeight()) {
                dy = -dy;
            }

            repaint(); // Redibuja la elipse

            try {
                Thread.sleep(20); // Retardo para suavizar el movimiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Fondo blanco
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Dibuja la elipse
        g2d.setColor(Color.BLUE);
        g2d.fillOval(x, y, 100, 50); // Elipse con tamaño 100x50
    }
}
