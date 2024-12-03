package geometria;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Rectangulo {

    public Cuadrado(Point i, int lado, Color c) {
        super(i, new Point(i.x + lado, i.y + lado), c);
    }

    @Override
    public double calcularArea() {
        int lado = Math.abs(this.inicial.x - this.fin.x);
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        int lado = Math.abs(this.inicial.x - this.fin.x);
        return 4 * lado;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        int lado = Math.abs(this.inicial.x - this.fin.x);
        g.fillRect(this.inicial.x, this.inicial.y, lado, lado);
    }
}
