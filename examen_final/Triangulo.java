package examen_final;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Triangulo extends Geometria implements Dibujable {
    public Point p1;
    public Point p2;
    public Point p3;

    public Triangulo(Point p1, Point p2, Point p3, Color c) {
        super(c);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double calcularArea() {
        return Math.abs(p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0;
    }

    public double calcularPerimetro() {
        double lado1 = p1.distance(p2);
        double lado2 = p2.distance(p3);
        double lado3 = p3.distance(p1);
        return lado1 + lado2 + lado3;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        int[] xPoints = {p1.x, p2.x, p3.x};
        int[] yPoints = {p1.y, p2.y, p3.y};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
