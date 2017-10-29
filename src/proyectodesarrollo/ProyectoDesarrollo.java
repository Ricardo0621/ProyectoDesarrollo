/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodesarrollo;

import controladores.ControladorEmpleado;
import controladores.ControladorSede;
import gui.InterfazAdministrador;
import gui.RegistrarSedes;
import logica.Empleado;
import logica.Sede;

/**
 *
 * @author diegoruiz
 */
public class ProyectoDesarrollo {
    /**
     * @param args the command line arguments
     */
    public void testCrearUsuario(){
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        String id_empleado = "1130589899";
        InterfazAdministrador interfazAdministrador = new InterfazAdministrador(id_empleado);
        interfazAdministrador.setVisible(true);
    }//Fin de testCreaUsuario()
    
    public void testCrearSede()
    {
        RegistrarSedes registrarSedes = new RegistrarSedes();
        registrarSedes.setVisible(true);
    }
    public static void main(String[] args) {
        ProyectoDesarrollo proyectoDesarrollo = new ProyectoDesarrollo();
        //proyectoDesarrollo.testCrearSede(); 
        proyectoDesarrollo.testCrearUsuario();
        
    } 
}
