package package_01;

public class Clase11Switch {
    public static void main(String[] args) {
        System.out.println("***SWITCH***");
        int opcion=2;
        System.out.println("\tMÉTODO 01 ");
        switch (opcion){
            case 1:
                System.out.println("\t\tEligio la opción 1");
                break;
            case 2:
                System.out.println("\t\tEligio la opción 2");
                break;
            case 3:
                System.out.println("\t\tEligio la opción 3");
                break;
            default:
                System.out.println("\t\tOpción inválida");

        }
        System.out.println("\tMÉTODO 02 (DESDE JAVA 12) ");

        String resultado= new String();
        resultado=switch (opcion){
            case 1 ->"Eligio la opción 1";
            case 2 ->"Eligio la opción 2";
            case 3 ->"Eligio la opción 3";
            default -> "Opción inválida";
        };
        System.out.println("\t\t"+resultado);
    }
}
