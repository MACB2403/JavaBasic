package package_A01;

import java.util.Scanner;

public class Clase03Promedio {
    public static void main(String[] args) {

        Scanner consola=new Scanner(System.in);

        System.out.println("*** CALIFICACIONES ***");
        System.out.print("\tCuantas calificaciones desea ingresar: ");
        int largo = Integer.parseInt(consola.nextLine());
        double[] calificaciones=new double[largo];
        double sumaCalificaciones=0.0;
        System.out.println("\tIngrese las calificaciones");
        for (int i = 0; i < largo; i++) {
            System.out.print("\t\tCalificación "+(i+1)+": ");
            calificaciones[i]=Double.parseDouble(consola.nextLine());
            sumaCalificaciones+=calificaciones[i];
        }
        System.out.println("\t\tPromedio: "+(sumaCalificaciones/largo));

    }
}
