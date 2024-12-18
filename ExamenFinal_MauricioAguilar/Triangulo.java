// Archivo: triangulo.java

public class Triangulo {
    public static void main(String[] args) {
        // Altura del triángulo
        int altura = 5;

        // Código ANSI para color amarillo patito
        final String ANSI_YELLOW = "\u001B[93m";
        final String ANSI_RESET = "\u001B[0m";

        // Generar el triángulo
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios para centrar el triángulo
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir los asteriscos del triángulo en amarillo
            System.out.print(ANSI_YELLOW);
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.print(ANSI_RESET);

            // Salto de línea
            System.out.println();
        }
    }
}
