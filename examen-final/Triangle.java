package triangulo;

public class Triangle {

    private int[] xPoints; // Coordenadas X de los vértices
    private int[] yPoints; // Coordenadas Y de los vértices
    private final int nPoints = 3; // Número de vértices

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.xPoints = new int[]{x1, x2, x3};
        this.yPoints = new int[]{y1, y2, y3};
    }

    public int[] getXPoints() {
        return xPoints;
    }

    public int[] getYPoints() {
        return yPoints;
    }

    public int getNPoints() {
        return nPoints;
    }
}
