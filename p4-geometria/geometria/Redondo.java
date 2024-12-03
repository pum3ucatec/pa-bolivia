package geometria;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Redondo extends Geometria implements Dibujable {
    public Point centro;
    public int radio;

    public Redondo(Point centro, int radio, Color color) {
        super(color);
        this.centro = centro;
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval(centro.x - radio, centro.y - radio, 2 * radio, 2 * radio);
    }
}
