package package_general.package_15;

public class Main15 {
    public static void main(String[] args) {
        System.out.println("*** EXCEPCIONES ***");
        int numerador=5, denominador=0;
        try {
            double resultado= numerador/denominador;
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("ERROR = " + e);
        }
    }
}
