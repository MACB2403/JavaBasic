package package_general.package_12;

public abstract class Clase12AbstractaFigura {// No se puede instanciar
    public abstract void dibujar();
}

class Rectangulo extends Clase12AbstractaFigura{
    @Override
    public void dibujar() {
        System.out.println("********");
        System.out.println("********");
        System.out.println("********");
    }
    public void numeroLados(){
        System.out.println("4 lados");
    }
}
class Triangulo extends Clase12AbstractaFigura{
    @Override
    public void dibujar() {
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");
    }
    public void numeroLados(){
        System.out.println("3 lados");
    }
}
class Hexagono extends Clase12AbstractaFigura{
    @Override
    public void dibujar() {
        System.out.println("   ****  ");
        System.out.println("  ****** ");
        System.out.println(" ******** ");
        System.out.println("  ****** ");
        System.out.println("   ****  ");
    }
    public void numeroLados(){
        System.out.println("6 lados");
    }
}