package calculadora;

class Operacion {
    private double numero1;
    private double numero2;

    // Constructor
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Getters
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
}