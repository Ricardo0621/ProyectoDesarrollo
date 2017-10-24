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
    
    public int  insertarEmpleado(String identificacion, String id_sede, String rol, String  primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String direccion, String telefono, String correo, String password, String estado){
        Empleado e = new Empleado();
        e.setIdentificacion(identificacion);
        e.setIdSede(id_sede);
        e.setRol(rol);
        e.setPrimerNombre(primer_nombre);
        e.setSegundoNombre(segundo_nombre);
        e.setPrimerApellido(primer_apellido);
        e.setSegundoApellido(segundo_apellido);
        e.setDireccion(direccion);
        e.setTelefono(telefono);
        e.setCorreo(correo);
        e.setPassword(password);
        e.setEstado(estado);
        return daoEmpleado.guardarEmpleado(e);
    }//Fin de insertarEmpleado()
    
    public boolean consultarEmpleado(String identificacion){
        return daoEmpleado.consultarEmpleado(identificacion);
    }//Fin de consultarEmpleado()

    public Empleado extraerEmpleado(String identificacion){
        Empleado empleado = new Empleado();
        empleado = daoEmpleado.recuperarEmpleado(identificacion);
        return empleado;
    }//Fin de extraerEmpleado()
    
    public int editarEmpleado(Empleado e){
        return daoEmpleado.modificarEmpleado(e);
    }

    public void listarEmpleados(){
        
    }//Fin 
    
    public void cerrarConexionBD(){
        daoEmpleado.cerrarConexionBD();
    }
    
}
