package practicaFERNANDO;
public class Principal {
    public static void main(String[] args) {
        Moto moto1 = new Moto("honda", "montañera", 300);
        Moto moto2 = new Moto("kawasaki", "Ninja", 400);
        moto1.mostrar();
        moto2.mostrar();
    }
}
