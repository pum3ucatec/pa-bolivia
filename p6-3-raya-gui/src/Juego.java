import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class Juego {
    public Tablero tablero;
    public Jugador jugador1;
    public Jugador jugador2;
    public Jugador jugadorActual;

    public Juego() {
        this.tablero = new Tablero();
        this.jugador1 = new Jugador("Juan", 'X');
        this.jugador2 = new Jugador("Pedro", 'O');
        this.jugadorActual = this.jugador1;
        this.configurarListeners();
    }

    private void configurarListeners() {
        // Vincular el ActionListener a cada celda del tablero
        for (int f = 0; f < tablero.CANTIDAD; f++) {
            for (int c = 0; c < tablero.CANTIDAD; c++) {
                int fila = f;
                int columna = c;

                tablero.celdas[fila][columna].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton boton = tablero.celdas[fila][columna];
                        if (boton.getText().equals(" ")) { // Solo permitir si está vacía
                            boton.setText(String.valueOf(jugadorActual.simbolo));
                            // if (verificarVictoria(jugadorActual)) {
                            //     JOptionPane.showMessageDialog(tablero, "¡" + jugadorActual.getNombre() + " ha ganado!");
                            //     reiniciarJuego();
                            // } else if (!tablero.hayCeldasVacias()) {
                            //     JOptionPane.showMessageDialog(tablero, "¡Es un empate!");
                            //     reiniciarJuego();
                            // } else {
                            //     alternarJugador(); // Cambiar turno
                            // }
                            alternarJugador();
                        }
                    }
                });
            }
        }
    }

    public void alternarJugador() {
        if (this.jugadorActual == this.jugador1) {
            this.jugadorActual = this.jugador2;
        } else {
            this.jugadorActual = this.jugador1;
        }
    }
}
