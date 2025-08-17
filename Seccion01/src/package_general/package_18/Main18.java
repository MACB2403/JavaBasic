package package_general.package_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main18 {
    public static void main(String[] args) {
        System.out.println("*** FUNCIONES LAMBDA Y MÉTODOS DE REFERENCIA ***");

        List<String> miListaA = Arrays.asList("Enero","Febrero","Marzo");

        //Función lambda (función anónima, con código compacto)
        miListaA.forEach(elemento ->{System.out.println("Elemento: "+elemento);});

        //Método de referencia
        miListaA.forEach(System.out::println);
    }
}
