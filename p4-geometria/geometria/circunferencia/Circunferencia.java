package circunferencia;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class Circunferencia extends Geometria {
    
    public Point centro;
    public int radio;
    public Color color;

    public Circunferencia(Point c, int r, Color col) {
        this.centro = c;
        this.radio = r;
        this.color = col;
    }

    public double calcularArea() {
    return Math.PI * Math.pow(this.radio, 2);
    }

    public double calcularPerimetro() {
    return 2 * Math.PI * this.radio;
    }

    public void dibujar(Graphics g) {
    g.setColor(this.color);
    g.fillOval(this.centro.x - this.radio, this.centro.y - this.radio, this.radio * 2, this.radio * 2);
    }

}
