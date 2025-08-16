package package_general.package_12;

public class Main12 {
    static void dibujarFiguras(Clase12AbstractaFigura figura){
        figura.dibujar();
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("*** CLASES ABSTRACTAS ***");
        Rectangulo figura1 = new Rectangulo();
        Clase12AbstractaFigura figura2 = new Rectangulo();
        Clase12AbstractaFigura figura3 = new Triangulo();
        Clase12AbstractaFigura figura4 = new Hexagono();
        figura1.numeroLados();
        dibujarFiguras(figura2);
        dibujarFiguras(figura3);
        dibujarFiguras(figura4);

    }
}


