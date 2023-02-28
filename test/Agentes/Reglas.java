/*
 * NOMBRE: Fisher
 * FECHA: 21/11/22
 * PROYECTO: SIMULACION
 */
package Agentes;

/**
 * Clase que controla las reglas de los agentes.
 *
 * @author Fisherk2
 */
public class Reglas {

    private Agent alarma, aspersor, camara, cell, ldr, led, pushB, sHumo, sMov1, sMov2, sProx;
    public final Agent[] AGENTES;

    public Reglas() {
        alarma = new Agent("Alarma");
        aspersor = new Agent("Aspersor");
        camara = new Agent("Camara");
        cell = new Agent("Celular");
        ldr = new Agent("LDR");
        led = new Agent("LED");
        pushB = new Agent("PushB");
        sHumo = new Agent("S.Humo");
        sProx = new Agent("S.Prox");
        sMov1 = new Agent("S.Mov");
        sMov2 = new Agent("S.Mov");
        //Guardamos todos los agentes en un arreglo
        AGENTES = new Agent[]{
            alarma,
            aspersor,
            camara,
            cell,
            ldr,
            led,
            pushB,
            sHumo,
            sProx,
            sMov1,
            sMov2};

    }

    /**
     * Metodo que invierte el estado de un agente.
     *
     * @param nombre Nombre del agente visualizado en el boton.
     */
    public void swap(String nombre) {
        for (Agent agente : AGENTES) { //Escanea todo el arreglo de los agentes
            if (nombre.equals(agente.NOMBRE)) {
                agente.invertirEstado();
            }
        }
    }

    /**
     * Metodo que reinicia los estado de los agentes a FALSE.
     */
    public void restart() {
        for (Agent agente : AGENTES) {
            agente.setEstado(false);
        }
    }

    /**
     * Metodo que obtiene un agente dentro del arreglo de agentes.
     *
     * @param agenteBuscado Nombre que aparece en la interfaz del agente que se
     * quiere obtener
     * @return Agente
     */
    public Agent obtenerAgente(String agenteBuscado) {
        for (Agent agente : AGENTES) {
            if (agenteBuscado.equals(agente.NOMBRE)) {
                return agente;
            }
        }
        System.err.println("ERROR, NO SE ENCONTRO EL AGENTE QUE SE DESEA BUSCAR EN EL ARREGLO");
        return null;
    }

    /**
     * Cambia el estado de un agente que esta dentro del arreglo de agentes.
     *
     * @param nombre Nombre del agente que aparece en el boton
     * @param estado Estado del agente que quieres cambiar
     */
    public void cambiarEstado(String nombre, boolean estado) {
        for (Agent agente : AGENTES) {          //Busca el agente y cambia su estado
            if (nombre.equals(agente.NOMBRE)) {
                agente.setEstado(estado);
            }
        }
    }

    /**
     * Metodo que actualiza los estados de los agentes dependiendo de sus
     * reglas.
     *
     */
    public void aplicarReglas() {
        boolean a10 = obtenerAgente("S.Humo").isActivated();
        boolean a9 = obtenerAgente("Aspersor").isActivated();
        boolean a2 = obtenerAgente("PushB").isActivated();
        boolean a8 = obtenerAgente("S.Mov").isActivated();
        boolean a6 = obtenerAgente("S.Mov").isActivated();
        boolean a1 = obtenerAgente("S.Prox").isActivated();
        boolean a3 = obtenerAgente("LDR").isActivated();

        //El aspersor se activa si lo hace el sensor
        cambiarEstado("Aspersor", a10);

        //Agentes que pueden activar la alarma
        if (a2 || a6 || a8 || a9) {
            cambiarEstado("Alarma", true);
        } else {
            cambiarEstado("Alarma", false);
        }
        //Agentes que activan la camara
        if (a1 || a2) {
            cambiarEstado("Camara", true);
        } else {
            cambiarEstado("Camara", false);
        }
        boolean a7 = obtenerAgente("Alarma").isActivated();
        boolean a5 = obtenerAgente("Camara").isActivated();

        //Agentes que pueden activar el celular
        if (a7 || a5) {
            cambiarEstado("Celular", true);
        } else {
            cambiarEstado("Celular", false);
        }
        //Agentes que activan el LED
        if (a3 || a6 || a8) {
            cambiarEstado("LED", true);
        } else {
            cambiarEstado("LED", false);
        }
    }

}
