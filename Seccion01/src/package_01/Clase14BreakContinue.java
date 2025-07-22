package package_01;

public class Clase14BreakContinue {
    public static void main(String[] args) {
        System.out.println("*** BREAK Y CONTINUE ***");
        System.out.println("\t Imprimir solo el primer número par del 1 al 10");
        for (int i = 1; i <= 10; i++) {
            if(i%2==0) {
                System.out.print("\t\t "+i);
                break;
            }
        }

        System.out.println("\n\t Imprimir solo los números pares del 1 al 10");
        for (int i = 1; i <= 10; i++) {
            if(i%2!=0) {
                continue;
            }
            System.out.print("\t\t"+i);
        }

    }
}
