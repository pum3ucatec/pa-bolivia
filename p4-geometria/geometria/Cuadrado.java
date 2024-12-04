package geometria;

import java.awt.Point;
import java.awt.Color;

public class Cuadrado extends Rectangulo {
    public int lado;

    public Cuadrado(Point i, int l, Color c) {
        super(i, new Point(i.x + l, i.y + l), c);
    }
}