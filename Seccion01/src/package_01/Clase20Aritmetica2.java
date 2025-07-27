package package_01;

import java.security.PublicKey;

public class Clase20Aritmetica2 {
    // ATRIBUTOS
    int operador1;
    int operador2;
    //CONSTRUCTOR
    public Clase20Aritmetica2(){
        System.out.println("Constructor A");
        System.out.println("Dir. Memoria this: "+this);
    }
    public Clase20Aritmetica2(int operador1,int operador2){
        System.out.println("Constructor B");
        System.out.println("Dir. Memoria this: "+this);
        this.operador1=operador1;
        this.operador2=operador2;
    }
    //MÉTODOS
    public void sumar(){
        System.out.println(this.operador1+this.operador2);
    }
    public void restar(){
        System.out.println(this.operador1-this.operador2);
    }

    public static void main(String[] args) {
        System.out.println("*** SOBRECARGA DE CONSTRUCTORES ***");
        Clase20Aritmetica2 objeto1 = new Clase20Aritmetica2();
        System.out.println("Dirección de memoria objeto1: "+objeto1);
        Clase20Aritmetica2 objeto2= new Clase20Aritmetica2(4,7);
        System.out.println("Dirección de memoria objeto2: "+objeto2);
    }
}
