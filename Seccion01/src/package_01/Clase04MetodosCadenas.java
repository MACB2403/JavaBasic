package package_01;

public class Clase04MetodosCadenas {
    public static void main(String[] args) {
        System.out.println("*** MÉTODOS DE CADENAS ***");

        System.out.println("\tLONGITUD");
        String cadena1=new String("Hola Mundo");
        int longitud = cadena1.length();
        System.out.println("\t\tlongitud = " + longitud);

        System.out.println("\tREEMPLAZAR CARACTERES");
        String cadena2=new String(cadena1.replace('o','e'));
        System.out.println("\t\tcadena2 = " + cadena2);

        System.out.println("\tCONVERTIR A MAYUSCULAS");
        String cadena3=new String(cadena1.toUpperCase());
        System.out.println("\t\tcadena3 = " + cadena3);

        System.out.println("\tCONVERTIR A MINUSCULAS");
        String cadena4=new String(cadena1.toLowerCase());
        System.out.println("\t\tcadena4 = " + cadena4);

        System.out.println("\tELIMINAR ESPACIOS AL INICIO Y AL FINAL");
        String cadena5= "   Hola estas es otra cadena     ";
        System.out.println("\t\tcadena5 sin trim= $" + cadena5+"$");
        System.out.println("\t\tcadena5 con trim= $" + cadena5.trim()+"$");

        System.out.println("\tSUBCADENAS");
        String cadena6=new String(cadena1.substring(5));
        String cadena7=new String(cadena1.substring(1,7));
        System.out.println("\t\tcadena6 = " + cadena6);
        System.out.println("\t\tcadena7 = " + cadena7);

        System.out.println("\tBUSQUEDA DE SUBCADENAS");
        int cadena8=cadena1.indexOf("Mundo");// sino encuentra la subcadena se devuelve -1
        System.out.println("\t\tDonde empieza Mundo = " + cadena8);

        System.out.println("\tREEMPLAZAR SUBCADENAS");
        String cadena9=new String(cadena1.replace("Hola","Chao"));
        System.out.println("\t\tcadena9 = " + cadena9);

        System.out.println("\tCONCATENAR MÁS EFICIENTE PARA VARIOS HILOS");
        StringBuilder constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1).append(" ");
        constructorCadenas.append("y Chao") ;
        System.out.println("\t\tconstructorCadenas = " + constructorCadenas);

        System.out.println("\tCONCATENAR MÁS EFICIENTE PARA VARIOS PROCESOS EJECUTANDOSE A LA VEZ");
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(cadena1).append(" ");
        stringBuffer.append("y Chao otra vez") ;
        System.out.println("\t\tstringBuffer = " + stringBuffer);

        System.out.println("\tCONCATENAR CON JOIN");
        String cadena10 = new String(String.join("$$","Hola","Mundo","esto","es","un","join"));
        System.out.println("\t\tcadena10 = " + cadena10);
    }
}
