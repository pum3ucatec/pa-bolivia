package examen_final;

import java.awt.Color;

public abstract class Geometria {
    protected Color color;

    public Geometria(Color c) {
        this.color = c;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color c) {
        this.color = c;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
