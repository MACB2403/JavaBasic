package package_01;

public class Clase19Aritmetica {
    // ATRIBUTOS
    int operando1;
    int operando2;
    // CONSTRUCTOR (public para que se pueda acceder desde otros archivos)
    public Clase19Aritmetica(int operando1, int operando2){
        System.out.println("Ingreso al constructor");
        this.operando1=operando1;
        this.operando2=operando2;
    }
    // MÉTODOS
    void sumar (){
        int resultado=this.operando1+this.operando2;
        System.out.println("Resultado Sumar = " + resultado);
    }
    void restar (){
        int resultado=this.operando1-this.operando2;
        System.out.println("Resultado Restar = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** CONSTRUCTORES ***");
        //OBJETO
        Clase19Aritmetica aritmetica= new Clase19Aritmetica(5,8);
        aritmetica.sumar();
        aritmetica.restar();
        aritmetica.operando1=7;
        aritmetica.operando2=10;
        aritmetica.sumar();
        aritmetica.restar();
    }
}
