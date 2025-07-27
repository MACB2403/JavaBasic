package package_general.package_03;

public class Clase03Persona {
    // ATRIBUTOS ENCAPSULADOS
    private String nombre;
    private String apellido;
    // CONSTRUCTORES
    public Clase03Persona(){
    }
    public Clase03Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    //MÉTODOS
    public void mostrarInformacion(){
        System.out.println("\tInformación Personal");
        System.out.println("\t\tNombre = " + this.nombre);
        System.out.println("\t\tApellido = " + this.apellido);
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
