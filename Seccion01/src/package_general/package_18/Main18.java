package package_general.package_18;

import java.util.ArrayList;
import java.util.List;

public class Main18 {
    public static void main(String[] args) {
        System.out.println("*** FUNCIONES LAMBDA ***");

        List<String> miListaA = new ArrayList<>();
        miListaA.add("Enero");
        miListaA.add("Febrero");
        miListaA.add("Marzo");

        //Función lambda (función anónima, con código compacto)
        miListaA.forEach(elemento ->{System.out.println("Elemento: "+elemento);});

    }
}
