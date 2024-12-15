package practica3;



public class Principal {

    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");

        Persona objDavid = new Persona("David Jairo", "Vasquez Velarde");
        Persona objRaul = new Persona("Raul", "Heredia Almanza");

        objDavid.mostrar();
        objRaul.mostrar();

    }
}
