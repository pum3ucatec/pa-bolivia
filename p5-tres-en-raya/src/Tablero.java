

public class Tablero {
    private char[][] celdas;
    private static final int TAMANO = 3;

    public Tablero() {
        this.celdas = new char[TAMANO][TAMANO];
        inicializar();
    }

    public void inicializar() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                celdas[i][j] = ' ';
            }
        }
    }

    public boolean marcarCelda(int fila, int columna, char simbolo) {
        if (fila < 0 || fila >= TAMANO || columna < 0 || columna >= TAMANO || celdas[fila][columna] != ' ') {
            return false;
        }
        celdas[fila][columna] = simbolo;
        return true;
    }

    public boolean hayGanador(char simbolo) {
        // Verificar filas, columnas y diagonales
        for (int i = 0; i < TAMANO; i++) {
            if (celdas[i][0] == simbolo && celdas[i][1] == simbolo && celdas[i][2] == simbolo) return true;
            if (celdas[0][i] == simbolo && celdas[1][i] == simbolo && celdas[2][i] == simbolo) return true;
        }
        if (celdas[0][0] == simbolo && celdas[1][1] == simbolo && celdas[2][2] == simbolo) return true;
        if (celdas[0][2] == simbolo && celdas[1][1] == simbolo && celdas[2][0] == simbolo) return true;

        return false;
    }

    public boolean estaLlena() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (celdas[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void mostrar() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                System.out.print(celdas[i][j]);
                if (j < TAMANO - 1) System.out.print("|");
            }
            System.out.println();
            if (i < TAMANO - 1) System.out.println("-----");
        }
    }
}
