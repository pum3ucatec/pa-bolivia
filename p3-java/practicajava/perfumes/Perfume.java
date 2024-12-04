package perfumes;

public class Perfume {
    private String marca;
    private String nombre;
    
    public Perfume(String marca, String nombre) {
         this.marca = marca;
         this.nombre = nombre; 
        } 
        
    public void Mostrar() {
        System.out.println("====================");
        System.out.println("marca: " + this.marca);
        System.out.println("nombre: " + this.nombre);
        System.out.println("====================");
    } 
}