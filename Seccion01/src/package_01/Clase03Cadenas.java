package package_01;

public class Clase03Cadenas {
    public static void main(String[] args) {
        System.out.println("*** MANEJO DE CADENAS ***");

        System.out.println("\tCONCATENAR");
        String cadena1=new String("Mundo");
        String cadena2=new String("Mundo");
        String cadena3= new String(cadena1+" "+cadena2);
        System.out.println("\t\t"+cadena3);

        System.out.println("\n\tCADENA DE MULTIPLES LINEAS");
        String multiplesLineas =new String("""
\t\tLorem ipsum dolor sit amet 
\t\tconsectetur adipiscing elit 
\t\tlitora integer mattis sodales 
               """);
        System.out.println(multiplesLineas);


        System.out.println("\n\tRECUPERAR CARACTERES");
        char caracter = cadena3.charAt(0);
        System.out.println("\t\tPrimer Caracter= "+caracter);
        caracter=cadena3.charAt(9);
        System.out.println("\t\tÚltimo Caracter= "+caracter);


        System.out.println("\n\tCOMPARAR REFERENCIAS");
        var cadenaA = "Java"; // La cadena A y B apuntan a la misma dirección
        var cadenaB = "Java";
        String cadenaC = new String("Java");
        System.out.println("\t\tEs la misma referencia para las cadenas A Y B? :" + (cadenaA==cadenaB));
        System.out.println("\t\tEs la misma referencia para las cadenas A Y C? :" + (cadenaA==cadenaC));

        System.out.println("\n\tCOMPARAR CONTENIDO");
        System.out.println("\t\tEs el mismo contenido de las cadenas A y C? "+cadenaA.equals(cadenaC));
    }
}
