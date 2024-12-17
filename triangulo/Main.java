package triangulo;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);

        JFrame frame = new JFrame("Vista del Triangulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new TrianglePanel(triangle));
        frame.setVisible(true);

        scanner.close();
    }
}
