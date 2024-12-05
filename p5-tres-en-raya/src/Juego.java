import java.util.Scanner;

public class Juego {
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugadorActual;

    public Juego(Jugador jugador1, Jugador jugador2) {
        this.tablero = new Tablero();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugadorActual = jugador1;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            tablero.mostrar();
            System.out.println("Turno de " + jugadorActual.getNombre() + " (" + jugadorActual.getSimbolo() + ")");
            System.out.print("Ingrese fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese columna (0-2): ");
            int columna = scanner.nextInt();

            if (!tablero.marcarCelda(fila, columna, jugadorActual.getSimbolo())) {
                System.out.println("Movimiento inválido. Intente de nuevo.");
                continue;
            }

            if (tablero.hayGanador(jugadorActual.getSimbolo())) {
                tablero.mostrar();
                System.out.println("¡" + jugadorActual.getNombre() + " ha ganado!");
                break;
            }

            if (tablero.estaLlena()) {
                tablero.mostrar();
                System.out.println("¡Empate!");
                break;
            }

            alternarTurno();
        }
        scanner.close();
    }

    private void alternarTurno() {
        jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
    }
}
