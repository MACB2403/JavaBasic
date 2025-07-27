package package_general.package_05;

import package_general.package_05.Clase05Animal;
import package_general.package_05.Clase05Perro;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("*** SOBREESCRITURA ***");
        Clase05Animal animalGenerico=new Clase05Animal();
        Clase05Perro labrador=new Clase05Perro();
        System.out.println("\tAnimal Genérico = " + animalGenerico);
        animalGenerico.comer();
        animalGenerico.dormir();
        System.out.println("\tPerro = " + labrador);
        labrador.comer();
        labrador.dormir();
        labrador.sonido();
    }
}
