package package_01;

public class Clase18POO {
    String nombre ; //Atributo nombre
    String apeliido ;//Atributo apellido

    void mostrarPersona(){ // Método
        System.out.println("nombre = " + nombre);
        System.out.println("apeliido = " + apeliido);
    }

    public static void main(String[] args) {
        System.out.println("*** ATRIBUTOS, CLASES Y MÉTODOS ***");
        Clase18POO persona1 = new Clase18POO();// Crea el objeto persona1
        persona1.nombre="Mario"; // Asigna el valor del atributo nombre
        persona1.apeliido="Cesen"; // Asigna el valor del atributo apellido
        persona1.mostrarPersona(); // Llama el método del objeto

        Clase18POO persona2 = new Clase18POO();// Crea el objeto persona2
        persona2.nombre="Carlos"; // Asigna el valor del atributo nombre
        persona2.apeliido="Ruiz"; // Asigna el valor del atributo apellido
        persona2.mostrarPersona(); // Llama el método del objeto
    }
}
