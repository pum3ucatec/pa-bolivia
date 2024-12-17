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
        Graphics2D g2d = (Graphics2D) g;

        
        g2d.setColor(Color.BLUE);
        int[] xPoints = { triangle.getX1(), triangle.getX2(), triangle.getX3() };
        int[] yPoints = { triangle.getY1(), triangle.getY2(), triangle.getY3() };
        g2d.fillPolygon(xPoints, yPoints, 3); 

        
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xPoints, yPoints, 3);
    }
}
