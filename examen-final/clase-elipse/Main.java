package elipse;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar parámetros de la elipse
        System.out.println("Introduce los parámetros de la elipse:");
        System.out.print("Centro X: ");
        int centerX = scanner.nextInt();

        System.out.print("Centro Y: ");
        int centerY = scanner.nextInt();

        System.out.print("Radio mayor: ");
        int radiusX = scanner.nextInt();

        System.out.print("Radio menor: ");
        int radiusY = scanner.nextInt();

        // Crear instancia de Elipse con los parámetros ingresados
        Elipse elipse = new Elipse(centerX, centerY, radiusX, radiusY);

        // Configurar JFrame para mostrar la elipse
        JFrame frame = new JFrame("Vista de la Elipse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Añadir el panel con la elipse
        frame.add(new ElipsePanel(elipse));

        frame.setVisible(true);
    }
}
