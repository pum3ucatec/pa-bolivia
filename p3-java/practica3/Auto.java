package practica3;

public class Auto {
    public String Marca;
    public String Modelo;
    public String Color;
    public int Anio;
    public String Placa;

    public Auto(String marca, String modelo, String color, int anio, String placa) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Color = color;
        this.Anio = anio;
        this.Placa = placa;
    }

    public void Mostrar() {
        System.out.println("==============================");
        System.out.println("Marca: " + this.Marca);
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Color: " + this.Color);
        System.out.println("Anio: " + this.Anio);
        System.out.println("Placa: " + this.Placa);
        System.out.println("==============================");
    }
}
