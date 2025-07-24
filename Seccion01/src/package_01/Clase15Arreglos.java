package package_01;

import java.util.Scanner;

public class Clase15Arreglos {
    public static void main(String[] args) {
        System.out.println("*** ARREGLOS ***");
        int [] enteros = new int[5];// declaración en inicialización

        System.out.println("\tImprimir por pantalla método 01 ");
        System.out.println("\t\tDirección de memoria de enteros: "+enteros);
        enteros[0]=0;
        enteros[1]=10;
        enteros[2]=20;
        enteros[3]=30;
        enteros[4]=40;
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("\t\tenteros["+i+"]: "+enteros[i]);
        };

        System.out.println("\tImprimir por pantalla método 02");
        var numeros = new int[]{0,100,200,300,400};
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("\t\tnumeros["+i+"]: "+numeros[i]);
        };

        System.out.println("\tIntroducir valores método 01 ");
        Scanner consola = new Scanner(System.in);
        System.out.print("\t\tIngrese el largo del arreglo: ");
        int largo= Integer.parseInt(consola.nextLine());
        int [] edades = new int[largo];
        for (int i = 0; i < largo; i++) {
            System.out.print("\t\tIngrese el valor de edades["+i+"]: ");
            edades[i]=Integer.parseInt(consola.nextLine());
        }
        System.out.println("\t\tValores de edades");
        System.out.print("\t\t[");
        for (int i = 0; i < largo; i++) {
            System.out.print(" "+edades[i]);
        }
        System.out.println(" ]");
    }
}
