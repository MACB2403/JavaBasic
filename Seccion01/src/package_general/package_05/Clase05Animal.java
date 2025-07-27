package package_general.package_05;
public class Clase05Animal {
    protected void comer(){
        System.out.println("\t\tComo muchas veces");
    }
    protected void dormir(){ // no es publico para todas las clases solo por clases hijas
        System.out.println("\t\tDuermo muchas horas");
    }

}
class Clase05Perro extends Clase05Animal {
    public void sonido(){
        System.out.println("\t\tGuau, Guau");
    }
    @Override
    protected void dormir(){ // Para sobreescribir se de usar la firma del método
        System.out.println("\t\tDuermo 8 horas, Guau, Guau");
        System.out.print("\t\tDormir de clase padre:");
        super.dormir();
    }
    @Override
    protected void comer(){
        System.out.println("\t\tComo 2 veces, Guau, Guau");
        System.out.print("\t\tComer de clase padre:");
        super.comer();
    }
}