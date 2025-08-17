package package_general.package_13;

public interface Clase13Interface {
    // public y abstract
    void traducir();

    // Método con implementación default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    };
}

class Ingles implements Clase13Interface{
    public void traducir(){
        System.out.println("Traduzco a Inglés");
    };

}

class Frances implements Clase13Interface{
    @Override
    public void traducir() {
        System.out.println("Traduzco en Francés");
    }

    @Override
    public void iniciarTraductor() {
        //Clase13Interface.super.iniciarTraductor();
        System.out.println("Iniciando traductor en Francés");
    }
}
