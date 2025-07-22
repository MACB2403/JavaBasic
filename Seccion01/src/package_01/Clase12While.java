package package_01;

public class Clase12While {
    public static void main(String[] args) {
        int contador = 1;
        System.out.println("***WHILE***");
        while (contador<5){
            System.out.println("\tcontador = " + contador);
            ++contador;
        }
        System.out.println("\tSalio del bucle while, contador = "+contador);

        System.out.println("***DO WHILE***");
        do{
            System.out.println("\tcontador = " + contador);
            --contador;
        }
        while (contador>1);
        System.out.println("\tSalio del bucle do while, contador = "+contador);
    }
}
