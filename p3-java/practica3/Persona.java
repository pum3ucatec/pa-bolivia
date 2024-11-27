package practica3;

public class Persona {

    public String Nombre;
    public String Apellido;

    public Persona(String nombre, String apellido) {
        this.Nombre = nombre;
        this.Apellido = apellido;
    }

    public void Mostrar() {
        System.out.println("==============================");
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Apellido: " + this.Apellido);
        System.out.println("==============================");
    }
}