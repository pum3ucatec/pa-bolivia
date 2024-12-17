package geometria;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Elipse {
    private Point centro;
    private int ancho;
    private int alto;
    private Color color;

    public Elipse(Point centro, int ancho, int alto, Color color) {
        this.centro = centro;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval(centro.x - ancho / 2, centro.y - alto / 2, ancho, alto);
    }
}