package package_general.package_16;

public class Clase16Excepciones {
    public static int division(int numerador, int denominador){
        try {
            return numerador/denominador;
        } catch (RuntimeException e) {
            throw new RuntimeException("ERROR: "+e);
            //throw new RuntimeException("ERROR: DIVISIÓN ENTRE 0");
        }
        finally {
            System.out.println("Se reviso la división entre cero");
        }

    }
}
