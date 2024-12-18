package elipse;

import javax.swing.*;
import java.awt.*;

public class ElipsePanel extends JPanel {

    private Elipse elipse;

    public ElipsePanel(Elipse elipse) {
        this.elipse = elipse;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Configurar el color de la elipse
        g.setColor(Color.RED);

        // Dibujar la elipse
        g.fillOval(
                elipse.getCenterX() - elipse.getRadiusX(), // Posición X inicial
                elipse.getCenterY() - elipse.getRadiusY(), // Posición Y inicial
                elipse.getRadiusX() * 2, // Ancho
                elipse.getRadiusY() * 2 // Alto
        );
    }
}
