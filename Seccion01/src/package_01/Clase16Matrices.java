package package_01;

import java.util.Scanner;

public class Clase16Matrices {
    public static void main(String[] args) {
        System.out.println("*** MATRICES ***");

        int[][] matriz1=new int[2][3];//2 filas y 3 columnas
        matriz1[0][0]=1;
        matriz1[0][1]=2;
        matriz1[0][2]=3;
        matriz1[1][0]=4;
        matriz1[1][1]=5;
        matriz1[1][2]=6;

        int[][] matriz2=new int[][]{
                {100,200},
                {300,400},
                {500,600},
                {700,800}
        };//4 filas y 2 columnas

        System.out.println("\tImprimir matriz");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("\t\tvalor matriz ["+i+"]["+j+"]: "+matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\tIngresar datos a matriz");
        Scanner consola = new Scanner(System.in);
        System.out.print("\t\tIngrese el número de filas: ");
        int filas = Integer.parseInt(consola.nextLine());
        System.out.print("\t\tIngrese el número de columnas: ");
        int columnas = Integer.parseInt(consola.nextLine());
        int[][] matriz3= new int[filas][columnas];
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print("\t\tIngrese valor matriz3 ["+i+"]["+j+"]: ");
                matriz3[i][j]=Integer.parseInt(consola.nextLine());
            }
        }
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print("\t\t["+i+"]["+j+"]: "+matriz3[i][j]);
            }
            System.out.println();
        }

    }
}
