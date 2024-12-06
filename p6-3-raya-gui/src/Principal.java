import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Rectángulo");
       
        Tablero miTablero = new Tablero();

        ventana.add(miTablero);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
