package triangulo;

import javax.swing.*;
import java.awt.*;

public class TrianglePanel extends JPanel {

    private Triangle triangle;

    public TrianglePanel(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Configurar el color y dibujar el triángulo
        g.setColor(Color.BLUE);
        g.fillPolygon(triangle.getXPoints(), triangle.getYPoints(), triangle.getNPoints());
    }
}
