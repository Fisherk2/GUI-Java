/*
 * NOMBRE: Fisher
 * FECHA: 23/11/22
 * PROYECTO: SIMULACION
 */
package Agentes;

/**
 * Clase que almacena las propiedades de los agentes, por defecto vienen
 * apagados (FALSE).
 *
 * @author Fisherk2
 */
public class Agent {

    private boolean estado;
    final String NOMBRE;

    public Agent(String nombre) {
        estado = false;
        NOMBRE = nombre;
    }

    /**
     * Verifica en que estado esta el agente.
     *
     * @return El estado del agente
     */
    public boolean isActivated() {
        return estado;
    }

    public void invertirEstado() {
        this.estado = !estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return NOMBRE + " - Estado: " + estado;
    }

}
