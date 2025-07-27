package package_general.package_06;


public class Main06 {

    static void emitirSonido(Clase06Animal animal){ // Método polimorfico
        animal.hacerSonido();
    }
    public static void main(String[] args) {
        System.out.println("*** POLIMORFISMO ***");
        Clase06Animal generico = new Clase06Animal();
        Clase06Perro labrador = new Clase06Perro();
        Clase06Gato persa = new Clase06Gato();
        emitirSonido(generico);
        emitirSonido(labrador);
        emitirSonido(persa);
    }
}
