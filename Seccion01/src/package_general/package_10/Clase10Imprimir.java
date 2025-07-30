package package_general.package_10;

public class Clase10Imprimir {
    static void imprimirNumeros(int ... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
    }
    static void imprimirParametros(String nombre,int ... numeros) {
        System.out.print(nombre + " ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
