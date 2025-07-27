package package_general.package_08;

public class Clase08Persona {
    // ATRIBUTO ESTÁTICO (ASOCIADAS A LA CLASE)
    private static int contadorPersona=0;
    // ATRIBUTOS ENCAPSULADOS
    private String nombre;
    private String apellido;
    private int idPersona;
    // CONSTRUCTORES
    public Clase08Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        ++Clase08Persona.contadorPersona;
        this.idPersona=contadorPersona;
    }
    //MÉTODOS
    public String toString(){
        return ("ID: "+this.idPersona+" Nombre: "+this.nombre+" "+ " Apellido: "+this.apellido+ " Direccion: "+super.toString());
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

    public int getIdPersona() {
        return this.idPersona;
    }

    public static int getContadorPersona() {
        return Clase08Persona.contadorPersona;
    }
}
