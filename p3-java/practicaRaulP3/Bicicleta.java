package practicaRaulP3;

public class Bicicleta {
    public String marca;
    public String modelo;

    public Bicicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrar() {
        System.out.println("=================================");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("=================================");
    }
}