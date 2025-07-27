package package_general.package_02;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("*** PAQUETES Y ENCAPSULAMIENTO ***");
        System.out.println("\tValores iniciales");
        Clase02Aritmetica aritmetica1=new Clase02Aritmetica(15,100);
        System.out.println("\t\tDir. Memoria: "+aritmetica1);
        System.out.println("\t\taritmetica1.getOperador1() = " + aritmetica1.getOperador1());
        System.out.println("\t\taritmetica1.getOperador2() = " + aritmetica1.getOperador2());
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println("\tCambio de valores");
        aritmetica1.setOperador1(3);
        aritmetica1.setOperador2(4);
        System.out.println("\t\tDir. Memoria: "+aritmetica1);
        System.out.println("\t\taritmetica1.getOperador1() = " + aritmetica1.getOperador1());
        System.out.println("\t\taritmetica1.getOperador2() = " + aritmetica1.getOperador2());
        aritmetica1.sumar();
        aritmetica1.restar();
    }
}
