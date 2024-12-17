import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Triangulo extends Geometria implements Dibujable {
    private Point p1, p2, p3;

    public Triangulo(Point p1, Point p2, Point p3, Color c) {
        super(c);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double calcularArea() {
        // Usando la fórmula de la mitad del determinante
        return Math.abs(p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double lado1 = p1.distance(p2);
        double lado2 = p2.distance(p3);
        double lado3 = p3.distance(p1);
        return lado1 + lado2 + lado3;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        Polygon triangulo = new Polygon();
        triangulo.addPoint(p1.x, p1.y);
        triangulo.addPoint(p2.x, p2.y);
        triangulo.addPoint(p3.x, p3.y);
        g.fillPolygon(triangulo);
    }
}
