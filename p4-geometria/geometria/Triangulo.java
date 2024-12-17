import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Triangulo {
    private Point p1, p2, p3;
    private Color color;

    public Triangulo(Point p1, Point p2, Point p3, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = color;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        int[] xPoints = {p1.x, p2.x, p3.x};
        int[] yPoints = {p1.y, p2.y, p3.y};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}