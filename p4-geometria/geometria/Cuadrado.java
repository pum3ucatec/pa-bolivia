package geometria;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cuadrado extends Geometria implements Dibujable {
    public Point esquinaSuperiorIzquierda;
    public int lado;

    public Cuadrado(Point esquina, int lado, Color color) {
        super(color);
        this.esquinaSuperiorIzquierda = esquina;
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect(esquinaSuperiorIzquierda.x, esquinaSuperiorIzquierda.y, lado, lado);
    }
}
