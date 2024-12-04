package hexagono;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class Hexagono extends Geometria implements Dibujable {
    public Point centro;
    public int radio;

    public Hexagono(Point centro, int radio, Color c) {
        super(c);
        this.centro = centro;
        this.radio = radio;
    }

    public double calcularArea() {
        return (3*Math.sqrt(3) * Math.pow(radio, 2))/2;
    }

    public double calcularPerimetro() {
        return 6 * radio;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        Polygon hex = new Polygon();
        for (int i=0; i<6; i++)
        {hex.addPoint(
            (int) (centro.x + radio * Math.cos(i*2*Math.PI / 6)),
            (int) (centro.y +radio * Math.sin(i*2* Math.PI / 6)) 
            );
        }
        g.fillPolygon(hex);
        
       }
}
