package package_general.package_08;

import package_general.package_08.Clase08Persona;

public class Main08 {
    public static void main(String[] args) {
        System.out.println("*** EJEMPLO PERSONA ***");
        Clase08Persona persona1 = new Clase08Persona("Carlos","Ruiz");
        System.out.println(persona1);
        System.out.println("Contador Estático: "+Clase08Persona.contadorPersona);

        Clase08Persona persona2 = new Clase08Persona("Mario","Ruiz");
        System.out.println(persona2);
        System.out.println("Contador Estático: "+Clase08Persona.contadorPersona);
    }
}
