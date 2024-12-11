package tresraya;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class Juego extends JPanel {
    public Tablero tablero;
    public Jugador jugador1;
    public Jugador jugador2;
    public Jugador jugadorActual;
    public JLabel jugadorLabel;

    public Juego() {
        this.setLayout(new BorderLayout());
        this.tablero = new Tablero();

        this.jugador1 = new Jugador("Juan", 'X');
        this.jugador2 = new Jugador("Pedro", 'O');
        this.jugadorActual = this.jugador1;

        this.jugadorLabel = new JLabel();
        this.jugadorLabel.setText("Es el turno de " + this.jugadorActual.nombre + " simbolo de juego: " + this.jugadorActual.simbolo);

        this.add(this.jugadorLabel, BorderLayout.NORTH);
        this.add(this.tablero, BorderLayout.CENTER);

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
                        Celda boton = tablero.celdas[fila][columna];
                        if (boton.getText().equals(" ")) { // Solo permitir si está vacía
                            boton.setText(String.valueOf(jugadorActual.simbolo));
                            if (verificarVictoria(jugadorActual)) {
                                JOptionPane.showMessageDialog(tablero, "¡" + jugadorActual.nombre + " ha ganado!");
                                // reiniciarJuego();
                            } else if (tablero.hayCeldasVacias()) {
                                JOptionPane.showMessageDialog(tablero, "¡Es un empate!");
                                // reiniciarJuego();
                            } else {
                                alternarJugador(); // Cambiar turno
                            }                           
                        }
                    }
                });
            }
        }
    }

    public boolean verificarVictoria(Jugador jugador) {
        // Verificar filas
        String simbolo = String.valueOf(jugador.simbolo);

        for (int fila = 0; fila < 3; fila++) {
            if (this.tablero.celdas[fila][0].getText().equals(simbolo) &&
                this.tablero.celdas[fila][1].getText().equals(simbolo) &&
                this.tablero.celdas[fila][2].getText().equals(simbolo)) {
                return true;
            }
        }
    
        // Verificar columnas
        for (int columna = 0; columna < 3; columna++) {
            if (this.tablero.celdas[0][columna].getText().equals(simbolo) &&
                this.tablero.celdas[1][columna].getText().equals(simbolo) &&
                this.tablero.celdas[2][columna].getText().equals(simbolo)) {
                return true;
            }
        }
    
        // Verificar diagonal principal
        if (this.tablero.celdas[0][0].getText().equals(simbolo) &&
            this.tablero.celdas[1][1].getText().equals(simbolo) &&
            this.tablero.celdas[2][2].getText().equals(simbolo)) {
            return true;
        }
    
        // Verificar diagonal secundaria
        if (this.tablero.celdas[0][2].getText().equals(simbolo) &&
            this.tablero.celdas[1][1].getText().equals(simbolo) &&
            this.tablero.celdas[2][0].getText().equals(simbolo)) {
            return true;
        }
    
        // Si no hay combinación ganadora
        return false;
    }
    

    public void alternarJugador() {
        if (this.jugadorActual == this.jugador1) {
            this.jugadorActual = this.jugador2;
        } else {
            this.jugadorActual = this.jugador1;
        }
        this.jugadorLabel.setText("Es el turno de " + this.jugadorActual.nombre + " simbolo de juego: " + this.jugadorActual.simbolo);
    }
}
