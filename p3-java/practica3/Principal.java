package practica3;
import practica3.Persona;
import practica3.Auto;

public class Principal {

    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");

        Persona objDavid = new Persona("David Jairo", "Vasquez Velarde");
        Persona objRaul = new Persona("Raul", "Heredia Almanza");

        objDavid.mostrar();
        objRaul.mostrar();

        Auto objAuto1 = new Auto("Nissan", "Versa", "Rojo", 2018, "ABC-123");
        Auto objAuto2 = new Auto("Chevrolet", "Spark", "Blanco", 2019, "XYZ-456");

        objAuto1.Mostrar();
        objAuto2.Mostrar();
    }
}
