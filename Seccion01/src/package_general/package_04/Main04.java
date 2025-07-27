package package_general.package_04;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("*** HERENCIA ***");
        ClaseAnimal animalGenerico=new ClaseAnimal();
        ClasePerro labrador=new ClasePerro();
        System.out.println("\tAnimal Genérico = " + animalGenerico);
        animalGenerico.comer();
        animalGenerico.dormir();
        System.out.println("\tPerro = " + labrador);
        labrador.comer();
        labrador.dormir();
        labrador.sonido();
    }
}
