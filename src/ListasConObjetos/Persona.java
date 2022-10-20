package ListasConObjetos;


/**
 *CLASE DE EJEMPLO PARA MANIPULACION DE OBJETOS
 * @author Fisher
 */
public class Persona {

    private String nombre, nacionalidad;
    private int edad;

    public Persona(String nombre, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        
    }

    public void setNacionalidad(String nacionalidad) {
        
    }

    public void setEdad(int edad) {
        
    }

    @Override
    public String toString() {//Sirve para declarar que valor se va mostrar en la lista representando el objeto agregado
        return this.nombre;
    }

}
