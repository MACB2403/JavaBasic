package package_general.package_13;

public class Main13 {
    public static void main(String[] args) {
        System.out.println("*** Interfaces ***");
        Clase13Interface traduccion1 = new Ingles();
        Clase13Interface traduccion2 = new Frances();
        traduccion1.iniciarTraductor();
        traduccion1.traducir();
        traduccion2.iniciarTraductor();
        traduccion2.traducir();
    }
}
