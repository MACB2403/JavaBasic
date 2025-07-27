package package_general.package_07;

import package_general.package_07.Clase07Persona;

public class Main07 {
    public static void main(String[] args) {
        System.out.println("*** EJEMPLO PERSONA ***");
        Clase07Persona persona1 = new Clase07Persona();
        persona1.setNombre("Mario");
        persona1.setApellido("Cesén");
        Clase07Persona persona2 = new Clase07Persona("Carlos","Ruiz");
        System.out.println(persona1);
        System.out.println(persona2);
    }
}


