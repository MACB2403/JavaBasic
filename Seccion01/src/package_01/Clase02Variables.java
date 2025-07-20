package package_01;

public class Clase02Variables {

    public static void main(String[] args) {
        System.out.println("*** MANEJO DE VARIABLES Y CONSTANTES ***");
        //Variables
        String nombreProducto = new String("Smart Watch");
        double precio = 45.75;
        int stock = 10;
        boolean disponible = true;
        //Constantes
        final int DIAS_LABORABLES = 5;
        final double IVA=15;
        final String EMPRESA=new String("Lorem Impsum");
        // Imprimir detalle
        System.out.println("\tDetalle Empresa");
        System.out.println("\t\tDias Laborables = " + DIAS_LABORABLES);
        System.out.println("\t\tIVA = " + IVA + "%");
        System.out.println("\t\tEmpresa = " + EMPRESA);

        System.out.println("\tLista de Productos");
        System.out.println("\t\tProducto = " + nombreProducto);
        System.out.println("\t\tPrecio = " + precio);
        System.out.println("\t\tStock = " + stock);
        System.out.println("\t\tDisponible = " + disponible);
    }
}
