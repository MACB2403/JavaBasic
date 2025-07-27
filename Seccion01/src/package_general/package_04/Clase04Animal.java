package package_general.package_04;

public class Clase04Animal {
    protected void comer(){
        System.out.println("\t\tComo muchas veces");
    }
    protected void dormir(){ // no es publico para todas las clases solo por clases hijas
        System.out.println("\t\tDuermo muchas horas");
    }

}
class Clase04Perro extends Clase04Animal {
    public void sonido(){
        System.out.println("\t\tGuau, Guau");
    }
}
