package package_general.package_09;

public class Main09 {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE VENTAS ***");
        Clase09Productos producto1= new Clase09Productos("Chocolate",1.5);
        Clase09Productos producto2= new Clase09Productos("Agua",0.5);
        Clase09Productos producto3= new Clase09Productos("Pan",0.15);
        Clase09Orden orden= new Clase09Orden();
        System.out.println(orden.agregarProducto(producto2));
        System.out.println(orden.agregarProducto(producto3));
        System.out.println(orden.agregarProducto(producto1));
        System.out.println(orden.agregarProducto(producto2));
        System.out.println(orden.agregarProducto(producto3));
        System.out.println(orden.agregarProducto(producto1));
        System.out.println("ORDEN:\n"+orden.mostrarOrden());

    }
}
