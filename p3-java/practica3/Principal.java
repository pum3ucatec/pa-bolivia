package practica3;
import practica3.Persona;

public class Principal {

    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");

        Persona objDavid = new Persona("David Jairo", "Vasquez Velarde");
        Persona objRaul = new Persona("Raul", "Heredia Almanza");

        objDavid.Mostrar();
        objRaul.Mostrar();
    }
}
