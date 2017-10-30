/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodesarrollo;

import gui.InterfazAdministrador;
import gui.RegistrarSedes;

/**
 *
 * @author diegoruiz
 */
public class ProyectoDesarrollo {
    /**
     * @param args the command line arguments
     */
    public void testCrearUsuario(){
        InterfazAdministrador interfazAdministrador = new InterfazAdministrador("1130589899");
        interfazAdministrador.setVisible(true);
    }//Fin de testCreaUsuario()
    
    public void testCrearSede()
    {
        RegistrarSedes registrarSedes = new RegistrarSedes();
        registrarSedes.setVisible(true);
    }
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProyectoDesarrollo proyectoDesarrollo = new ProyectoDesarrollo();
                //proyectoDesarrollo.testCrearSede(); 
                //proyectoDesarrollo.testCrearUsuario();
            }
        });
    } 
}
