package package_01;

public class Clase08FormatoCadenas {
    public static void main(String[] args) {
        System.out.println("*** FORMATO DE CADEDNAS ***");
        String nombre = new String("Mario");
        int edad = 25;
        double tiempo= 55.6;
        String mensaje = new String();
        int idEmpleado=24;

        System.out.println("\t MÉTODO 01");
        mensaje = String.format("\t\tNombre: %s\n\t\tEdad: %d\n\t\tTiempo: %.2f\n\t\tId: %05d",nombre,edad,tiempo,idEmpleado);
        System.out.println(mensaje);

        System.out.println("\t MÉTODO 02");
        System.out.printf("\t\tNombre: %s%n\t\tEdad: %d%n\t\tTiempo: %.2f%n\t\tId: %05d%n",nombre,edad,tiempo,idEmpleado);

        System.out.println("\t MÉTODO 03 (BLOQUES DE TEXTO)");
        String mensaje2=    """
                            %n\t\tDetalle Persona:\s
                            \t\t--------------------
                            \t\t\tNombre: %s
                            \t\t\tEdad:%d
                            \t\t\tTiempo: %.2f
                            \t\t\tIdEmpleado:%04d
                            """.formatted(nombre,edad,tiempo,idEmpleado+442);
        System.out.println(mensaje2);

        System.out.println("\t MÉTODO 04 (BLOQUES DE TEXTO)");
        System.out.printf( """
                            %n\t\tDetalle Persona:\s
                            \t\t--------------------
                            \t\t\tNombre: %s
                            \t\t\tEdad:%d
                            \t\t\tTiempo: %.2f
                            \t\t\tIdEmpleado:%04d
                            """,nombre,edad,tiempo,(idEmpleado+442));
    }
}
