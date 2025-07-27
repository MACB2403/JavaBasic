package package_general.package_03;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("*** EJEMPLO PERSONA ***");
        Clase03Persona persona1 = new Clase03Persona();
        persona1.setNombre("Mario");
        persona1.setApellido("Cesén");
        Clase03Persona persona2 = new Clase03Persona("Carlos","Ruiz");

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();

        
    }
}
