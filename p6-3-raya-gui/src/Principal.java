import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        JFrame ventanaFrame = new JFrame("Dibujo de Rectángulo");
        //Elementos visuales
        JLabel jugadorLabel = new JLabel();
        
        Juego miJuego = new Juego();
        jugadorLabel.setText("Es el turno de " + miJuego.jugadorActual.nombre + " simbolo de juego: " + miJuego.jugadorActual.simbolo);

        // System.out.println("jugador1: " + miJuego.jugador1.nombre);
        // System.out.println("jugador2: " + miJuego.jugador2.nombre);
        ventanaFrame.setLayout(new BorderLayout());
        ventanaFrame.add(jugadorLabel, BorderLayout.NORTH);
        ventanaFrame.add(miJuego.tablero, BorderLayout.CENTER);
        ventanaFrame.setSize(800, 800);
        ventanaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaFrame.setVisible(true);
    }
}
