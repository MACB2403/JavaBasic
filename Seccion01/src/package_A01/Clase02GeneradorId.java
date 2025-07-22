package package_A01;

import java.util.Random;
import java.util.Scanner;

public class Clase02GeneradorId {
    public static void main(String[] args) {
        System.out.println("***GENERADOR DE ID***");
        Scanner scanner= new Scanner(System.in);
        Random aleatorio=new Random();
        String nombre=new String();
        String apellido=new String();
        String anio;
        String codigo;
        String id=new String();
        System.out.print("\tIngrese su nombre: ");
        nombre=scanner.nextLine();
        System.out.print("\tIngrese su apellido: ");
        apellido=scanner.nextLine();
        System.out.print("\tIngrese su año de nacimiento (YYYY): ");
        anio=scanner.nextLine();
        codigo=String.format("%04d",aleatorio.nextInt(9999));
        id=nombre.substring(0,2).toUpperCase()+apellido.substring(0,2).toUpperCase()+anio.substring(2)+codigo;
        System.out.printf("Id generado: %s%n",id);

    }
}
