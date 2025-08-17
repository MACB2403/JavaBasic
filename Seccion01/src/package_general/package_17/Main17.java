package package_general.package_17;

import java.util.ArrayList;
import java.util.List;

public class Main17 {
    public static void main(String[] args) {
        System.out.println("*** LISTAS ***");
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Lunes");
        miLista.add("Martes");

        List<String> miLista2 = new ArrayList<>();
        miLista.add("Enero");
        miLista.add("Febrero");
        miLista.add("Marzo");

        for (Object elemento: miLista){
            System.out.println("Día: "+elemento);
        }
        for (String elemento: miLista2){
            System.out.println("Mes: "+elemento);
        }


    }
}
