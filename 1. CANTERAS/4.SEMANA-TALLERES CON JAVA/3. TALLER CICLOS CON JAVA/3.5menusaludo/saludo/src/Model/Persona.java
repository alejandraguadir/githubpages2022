package Model;

public class Persona {
    String nombre;
    String apellido;
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        String info = "\n-----------------------------------------------------\n";
        info += "¡Hola! " + nombre+" "+apellido;
        info += "\nBienvenido al menú de usuario";
        info += "\n-----------------------------------------------------------\n";
        return info;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    

}