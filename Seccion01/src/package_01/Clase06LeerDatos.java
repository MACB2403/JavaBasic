package package_01;

import java.util.Scanner;

public class Clase06LeerDatos {
    public static void main(String[] args) {
        System.out.println("*** LEER DATOS POR CONSOLA***");
        Scanner scanner= new Scanner(System.in);

        System.out.println("\t MÉTODO 1");
        String nombre= new String();
        double altura;
        int edad;

        System.out.print("\t\tIngrese su Altura: ");
        altura=scanner.nextDouble();//no consume el salto de línea
        System.out.print("\t\tIngrese su Edad: ");
        edad=scanner.nextInt();//no consume el salto de línea
        scanner.nextLine();// se debe consumir los saltos de línea
        System.out.print("\t\tIngrese su Nombre: ");
        nombre=scanner.nextLine();

        System.out.println("\t\tResumen 01");
        System.out.println("\t\t1.1nombre = " + nombre);
        System.out.println("\t\t1.2.altura = " + altura);
        System.out.println("\t\t1.3.edad = " + edad);

        System.out.println("\t MÉTODO 2 (RECOMENDABLE)");

        System.out.print("\t\tIngrese su edad: ");
        int edadInt = Integer.parseInt(scanner.nextLine());
        System.out.print("\t\tIngrese su altura: ");
        double alturaDouble = Double.parseDouble(scanner.nextLine());
        System.out.print("\t\tIngrese su Nombre: ");
        nombre=scanner.nextLine();
        System.out.println("\t\tResumen 02");
        System.out.println("\t\t2.1.nombre = " + nombre);
        System.out.println("\t\t2.2.altura = " + alturaDouble);
        System.out.println("\t\t2.3.edad = " + edadInt);


    }
}
