package geometria;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Geometria implements Dibujable {
    
    public Point centro;
    public int radio;

    public Circulo(Point ce, int ra, Color c) {
        super(c);
        this.centro = ce;
        this.radio = ra;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        int diametro = 2 * this.radio;
        g.fillOval(this.centro.x - this.radio, this.centro.y - this.radio, diametro, diametro);
    }
}
