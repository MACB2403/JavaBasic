package package_01;

public class Clase17Funciones {

    static int sumar(int a, int b){
        return(a+b); // Devuelvo el resultado
    }
    static int restar(int a, int b){
        return(a-b); // Devuelvo el resultado
    }
    static int multiplicar(int a, int b){
        return(a*b); // Devuelvo el resultado
    }
    static double dividir(double a, double b){
        return(a/b); // Devuelvo el resultado
    }

    static void calcular(int a, int b){
        System.out.println();
        System.out.println("Suma: "+sumar(a,b)); // Llamo a la función sumar
        System.out.println("Resta: "+restar(a,b)); // Llamo a la función restar
        System.out.println("Multiplicacion: "+multiplicar(a,b)); // Llamo a la función multiplicar
        System.out.println("División: "+dividir(a,b)); // Llamo a la función dividir
    }

    public static void main(String[] args) {
        System.out.println("*** FUNCIONES ***");
        calcular(130,50); // Llamo al procedimiento operar

    }
}
