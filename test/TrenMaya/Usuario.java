package TrenMaya;

/** Clase que guarda los datos del titular de la reservacion para el viaje del Tren.
 *@author Fisher
 * 
 */
public class Usuario {
    private String nombre, telefono, correo, tarjetaBancaria;
    private int sexo;

    public Usuario(String nombre, String telefono, String correo, String tarjetaBancaria, int sexo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.tarjetaBancaria = tarjetaBancaria;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTarjetaBancaria() {
        return tarjetaBancaria;
    }

    public String getSexo() {
        String strSexo="NO DEFINIDO";
        if(sexo==0){
            strSexo = "Masculino";
        }if(sexo==1){
            strSexo="Femenino";
        }
        return strSexo;
    }
    
    
}
