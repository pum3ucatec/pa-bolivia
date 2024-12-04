package rectangulo;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo extends Geometria {
    public Point inicial;
    public Point fin;
    public Color color;

    public Rectangulo(Point i, Point f, Color c) {
        this.inicial = i;
        this.fin = f;
        this.color = c;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        int ancho, alto;
        ancho = Math.abs(this.inicial.x - this.fin.x);
        alto = Math.abs(this.inicial.y - this.fin.y);

        g.fillRect(this.inicial.x, this.inicial.y, ancho, alto);
    }
}

