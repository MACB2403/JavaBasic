package package_A01;

public class Clase01GeneradorCorreo {
    public static void main(String[] args) {
        System.out.println("***GENERADOR DE CORREO***");

        String nombre = new String("Jose Eduardo Casa");
        String empresa = new String("Mercado Libre");
        String dominio= new String("com.ec");

        String parte1Correo= new String(nombre.toLowerCase().trim().replace(" ","."));
        String parte2Correo= new String(empresa.toLowerCase().trim().replace(" ",""));
        String correo =new String(parte1Correo+"@"+parte2Correo+"."+dominio.trim().replace(" ",""));
        System.out.println("\tCorreo: "+correo);
    }
}
