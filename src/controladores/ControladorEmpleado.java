/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoEmpleado;
import logica.Empleado;

/**
 *
 * @author diegoruiz
 */
public class ControladorEmpleado {
    DaoEmpleado daoEmpleado;
    
    public ControladorEmpleado(){
        daoEmpleado = new DaoEmpleado();
    }
    
    public int  insertarEmpleado(String  primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String identificacion, String direccion, String telefono, String correo, String password, String rol){
        int result = 0;
        return result;
    }//end

    public Empleado consultarEmpleado(String identificacion){
        Empleado empleado = new Empleado();
        return empleado;
    }

    public void listarEmpleados(){}
    
    public void cerrarConexionBD(){
        daoEmpleado.cerrarConexionBD();
    }
    
}
