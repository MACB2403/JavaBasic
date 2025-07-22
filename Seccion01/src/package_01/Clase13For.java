package package_01;

public class Clase13For {
    public static void main(String[] args) {
        System.out.println("*** FOR ***");
        int resultado=0;
        for (int i = 0; i < 5; i++) {
            resultado=i;
            System.out.println("\tresultado = " + resultado);
        }
        System.out.println("\tSalio del bucle while, resultado = "+resultado);
    }
}
