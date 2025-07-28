package package_general.package_09;

public class Clase09Productos {
    // ATRIBUTOS ESTÁTICOS (ASOCIADOS A LA CLASE)
    private static int contadorProductos=0;
    // ATRIBUTOS DINÁMICOS (ASOCIADO AL OBJETO)
    private String nombre;
    private Double precio;
    private int idProducto;
    // CONSTRUCTORES
    public Clase09Productos(String nombre, Double precio){
        ++Clase09Productos.contadorProductos;
        this.nombre=nombre;
        this.precio=precio;
        this.idProducto=Clase09Productos.contadorProductos;
    }
    // MÉTODOS
    public static int getContadorProductos() {
        return Clase09Productos.contadorProductos;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return this.precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", idProducto=" + idProducto +
                '}';
    }
}

class Clase09Orden {
    // ATRIBUTOS ESTÁTICOS (ASOCIADOS A LA CLASE)
    private static int contadorOrden = 0;
    // ATRIBUTOS DINÁMICOS (ASOCIADO AL OBJETO)
    private static final int MAXIMO_PEDIDO = 5;
    private int numeroOrden;
    private int contadorProductos;
    Clase09Productos[] orden;

    // CONSTRUCTORES
    public Clase09Orden() {
        this.numeroOrden=++contadorOrden;
        this.orden= new Clase09Productos[Clase09Orden.MAXIMO_PEDIDO];
    }

    // MÉTODOS
    public String agregarProducto(Clase09Productos producto) {
        if(this.contadorProductos<Clase09Orden.MAXIMO_PEDIDO){
            this.orden[this.contadorProductos++]=producto;
            return "Producto " + producto.getNombre() + " agregado";
        }else{
            return "No se pudo agregar el Producto ";
        }
    }
    public double calcularTotal(){
        double total=0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total=total + this.orden[i].getPrecio();
        }
        return total;
    }
    public String mostrarOrden(){
        String mensaje="";
        for (int i = 0; i < this.contadorProductos; i++) {
            mensaje+=this.orden[i].toString()+"\n";
        }
        return mensaje+"TOTAL: $"+this.calcularTotal();
    }

}