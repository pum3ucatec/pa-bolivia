package geometria2;

import java.awt.*;

public class Triangulo {
    private Point baseCenter;
    private int height;
    private Color color;

    public Triangulo(Point baseCenter, int height, Color color) {
        this.baseCenter = baseCenter;
        this.height = height;
        this.color = color;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        int halfBase = height / 2;

        int[] xPoints = {
            baseCenter.x - halfBase, // Izquierda
            baseCenter.x + halfBase, // Derecha
            baseCenter.x             // Arriba
        };

        int[] yPoints = {
            baseCenter.y,            // Base izquierda
            baseCenter.y,            // Base derecha
            baseCenter.y - height    // Vértice superior
        };

        g.fillPolygon(xPoints, yPoints, 3);
    }
}
