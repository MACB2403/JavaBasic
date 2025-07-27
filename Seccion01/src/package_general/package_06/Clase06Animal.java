package package_general.package_06;

public class Clase06Animal {
    //ATRIBUTOS
    //CONSTRUCTOR
    //MÉTODOS
    protected void hacerSonido(){
        System.out.println("Sonido Genérico");
    }
}

class Clase06Perro extends Clase06Animal{
    //ATRIBUTOS
    //CONSTRUCTOR
    //MÉTODOS
    @Override
    protected void hacerSonido(){
        System.out.println("Guau, Guau");
    }
}
class Clase06Gato extends Clase06Animal{
    //ATRIBUTOS
    //CONSTRUCTOR
    //MÉTODOS
    @Override
    protected void hacerSonido(){
        System.out.println("Miau, Miau");
    }
}

