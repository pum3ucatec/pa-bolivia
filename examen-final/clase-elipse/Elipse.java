package elipse;

public class Elipse {

    private int centerX;   // Coordenada X del centro
    private int centerY;   // Coordenada Y del centro
    private int radiusX;   // Radio mayor (horizontal)
    private int radiusY;   // Radio menor (vertical)

    public Elipse(int centerX, int centerY, int radiusX, int radiusY) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadiusX() {
        return radiusX;
    }

    public int getRadiusY() {
        return radiusY;
    }
}
