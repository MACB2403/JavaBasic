package package_01;

public class Clase10If {
    public static void main(String[] args) {
        System.out.println("*** IF ***");
        int edad=20;
        final int MIN_EDAD=18, MAX_EDAD=21;
        if ((edad>MIN_EDAD)&&(edad<MAX_EDAD)){
            System.out.println("\t\tDentro del rango de edad");
        } else if (edad<MIN_EDAD) {
            System.out.println("\t\tPor debajo del rango de edad");
        }else {
            System.out.println("\t\tPor arriba del rango de edad");
        }
    }
}
