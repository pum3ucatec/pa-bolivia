package triangulo;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar coordenadas de los vértices del triángulo
        System.out.println("Introduce las coordenadas de los tres vértices del triángulo:");

        System.out.print("x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("x3, y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Crear instancia de Triangle con las coordenadas ingresadas
        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);

        // Configurar JFrame para mostrar el triángulo
        JFrame frame = new JFrame("Vista del Triángulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Añadir el panel con el triángulo
        frame.add(new TrianglePanel(triangle));

        frame.setVisible(true);
    }
}
