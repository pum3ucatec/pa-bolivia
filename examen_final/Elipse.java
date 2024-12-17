package examen_final;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Elipse extends Geometria implements Dibujable {
    public Point centro;
    public int radioX;
    public int radioY;

    public Elipse(Point centro, int radioX, int radioY, Color c) {
        super(c);
        this.centro = centro;
        this.radioX = radioX;
        this.radioY = radioY;
    }

    public double calcularArea() {
        return Math.PI * radioX * radioY;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * Math.sqrt((radioX * radioX + radioY * radioY) / 2.0);
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval(centro.x - radioX, centro.y - radioY, 2 * radioX, 2 * radioY);
    }
}
