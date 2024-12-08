package practica3;  

public class Principal {
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");

        Persona obj1 = new Persona("Erlan", "Nuñez");
        Persona obj2 = new Persona("Daniel", "Rodriguez");

        obj1.mostrar();
        obj2.mostrar();
    }
}
