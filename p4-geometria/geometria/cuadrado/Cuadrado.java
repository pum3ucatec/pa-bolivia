package cuadrado;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Geometria implements Dibujable {
    public Point inicial;
    public int lado;

    public Cuadrado(Point i, int lado, Color c) {
        super(c);
        this.inicial = i;
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.inicial.x, this.inicial.y, lado, lado);
       }
}
