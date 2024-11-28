package practicaFERNANDO;

public class Moto {
    public String marca;
    public String modelo;
    public int cilindrada; 

    public Moto(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }
    public void mostrar() {
        System.out.println("=================================");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cilindrada: " + this.cilindrada + " cc");
        System.out.println("=================================");
    }
}
