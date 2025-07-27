package package_general.package_02;

public class Clase02Aritmetica {
    // ATRIBUTOS
    private int operador1; // encapsular por buenas prácticas
    private int operador2; // encapsular por buenas prácticas
    // CONSTRUCTORES
    public Clase02Aritmetica(int operador1, int operador2){
        this.operador1=operador1;
        this.operador2=operador2;
    }
    // MÉTODOS
    public void sumar(){
        int resultado= this.operador1+this.operador2;
        System.out.println("\t\tResultado Sumar: "+resultado);
    }
    public void restar(){
        int resultado= this.operador1-this.operador2;
        System.out.println("\t\tResultado restar: "+resultado);
    }
    public int getOperador1(){
        return this.operador1;
    }
    public void setOperador1(int operador1){
        this.operador1=operador1;
    }
    public int getOperador2(){
        return this.operador2;
    }
    public void setOperador2(int operador2){
        this.operador2=operador2;
    }
}
