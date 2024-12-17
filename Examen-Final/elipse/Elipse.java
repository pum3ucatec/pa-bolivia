import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Elipse extends Geometria implements Dibujable {
    private Point centro;
    private int radioMayor;
    private int radioMenor;

    public Elipse(Point centro, int radioMayor, int radioMenor, Color c) {
        super(c);
        this.centro = centro;
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }

    @Override
    public double calcularPerimetro() {
        // Aproximación de Ramanujan
        return Math.PI * (3 * (radioMayor + radioMenor) - Math.sqrt((3 * radioMayor + radioMenor) * (radioMayor + 3 * radioMenor)));
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval(centro.x - radioMayor, centro.y - radioMenor, 2 * radioMayor, 2 * radioMenor);
    }
}
