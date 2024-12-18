
public class Division extends Operacion {

    public Division(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        if (numero2 == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return numero1 / numero2;
    }
}
