public class Principal {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Alice", 'X');
        Jugador jugador2 = new Jugador("Bob", 'O');
        Juego juego = new Juego(jugador1, jugador2);

        juego.iniciar();
    }
}
