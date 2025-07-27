package package_general.package_07;

public class Clase07Persona {
    // ATRIBUTOS ENCAPSULADOS
    private String nombre;
    private String apellido;
    // CONSTRUCTORES
    public Clase07Persona(){
    }
    public Clase07Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    //MÉTODOS
    public String toString(){
        return ("Nombre: "+nombre+" "+ " Apellido: "+apellido+ " Direccion: "+super.toString());
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
