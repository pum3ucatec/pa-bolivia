package tresraya;
import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        JFrame ventanaFrame = new JFrame("Dibujo de Rectángulo");

        Juego miJuego = new Juego();

        // System.out.println("jugador1: " + miJuego.jugador1.nombre);
        // System.out.println("jugador2: " + miJuego.jugador2.nombre);
        ventanaFrame.setLayout(new BorderLayout());
        ventanaFrame.add(miJuego, BorderLayout.CENTER);
        ventanaFrame.setSize(800, 800);
        ventanaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaFrame.setVisible(true);
    }
}
