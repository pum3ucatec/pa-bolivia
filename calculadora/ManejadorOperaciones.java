package calculadora;

class ManejadorOperaciones {
    // Método para sumar
    public double sumar(double numero1, double numero2) {
        Operacion operacion = new Operacion(numero1, numero2);
        return operacion.getNumero1() + operacion.getNumero2();
    }

    // Método para restar
    public double restar(double numero1, double numero2) {
        Operacion operacion = new Operacion(numero1, numero2);
        return operacion.getNumero1() - operacion.getNumero2();
    }

    // Método para multiplicar
    public double multiplicar(double numero1, double numero2) {
        Operacion operacion = new Operacion(numero1, numero2);
        return operacion.getNumero1() * operacion.getNumero2();
    }

    // Método para dividir
    public double dividir(double numero1, double numero2) {
        Operacion operacion = new Operacion(numero1, numero2);
        if (operacion.getNumero2() == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return operacion.getNumero1() / operacion.getNumero2();
    }
}