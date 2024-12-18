package geometria2;

import java.awt.*;

public class Elipse {
    private Point superiorIzq;
    private Point inferiorDer;
    private Color color;

    public Elipse(Point superiorIzq, Point inferiorDer, Color color) {
        this.superiorIzq = superiorIzq;
        this.inferiorDer = inferiorDer;
        this.color = color;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        int width = Math.abs(inferiorDer.x - superiorIzq.x);
        int height = Math.abs(inferiorDer.y - superiorIzq.y);
        g.fillOval(superiorIzq.x, superiorIzq.y, width, height);
    }
}
