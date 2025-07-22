package package_01;

import java.util.Random;

public class Clase07NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** GENERACIÓN DE NÚMEROS ALEATORIOS ***");
        Random aleatorio = new Random();
        System.out.println("\t ENTERO ALEATORIO ENTRE 0 Y 9");
        int resultado = aleatorio.nextInt(10);
        System.out.println("\t\tresultado = " + resultado);
        System.out.println("\t ENTERO ALEATORIO ENTRE 1 y 6");
        resultado = aleatorio.nextInt(6)+1;
        System.out.println("\t\tresultado = " + resultado);

        System.out.println("\t FLOTANTE ALEATORIO ENTRE 0.0 y 1.0");
        float resultadoFloat= aleatorio.nextFloat();
        System.out.println("\t\tresultadoFloat = " + resultadoFloat);
    }
}
