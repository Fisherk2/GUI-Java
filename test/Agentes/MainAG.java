/*
 * NOMBRE: Fisher
 * FECHA: 21/11/22
 * PROYECTO: SIMULACION
 */
package Agentes;

/**
 * Clase principal que prueba la ventana de los agentes.
 *
 * @author Fisherk2
 */
public class MainAG {

    public static void main(String[] args) {
        new Screen().setVisible(true);
//        new MainAG().probarReglas();
    }

    public void probarReglas() {
        Reglas rules = new Reglas();
        Agent[] agentes = rules.AGENTES;
        for (Agent agente : agentes) {
            System.out.println(agente);
        }
        System.out.println("____________________________");
        System.out.println("PROBANDO CAMBIAR ESTADO: \n");
        rules.cambiarEstado("Alarma", true);
        rules.cambiarEstado("Aspersor", true);
        rules.cambiarEstado("S.Mov", true);
        rules.cambiarEstado("S.Humo", true);
        for (Agent agente : agentes) {
            System.out.println(agente);
        }
        System.out.println("____________________________");
        System.out.println("PROBANDO INVERTIR ESTADO: \n");
        rules.swap("S.Mov");
        rules.swap("Alarma");
        for (Agent agente : agentes) {
            System.out.println(agente);
        }
        System.out.println("____________________________");
        System.out.println("PROBANDO RESETEO DE ESTADO: \n");
        rules.restart();
        for (Agent agente : agentes) {
            System.out.println(agente);
        }
        System.out.println("____________________________");
        System.out.println("PROBANDO OBTENCION DE AGENTE: \n");
        System.out.println(rules.obtenerAgente("Celular"));
        System.out.println("____________________________");
        System.out.println("PROBAR REGLAS DE LOS AGENTES: \n");
        rules.cambiarEstado("LDR", true); //Si se activa el sensor de movimiento
        rules.aplicarReglas();
        for (Agent agente : agentes) {
            System.out.println(agente);
        }
    }

}
