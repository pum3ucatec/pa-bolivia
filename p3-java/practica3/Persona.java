package practica3;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
    }
}