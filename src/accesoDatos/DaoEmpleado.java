/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import logica.Empleado;

/**
 *
 * @author diegoruiz
 */
public class DaoEmpleado {
    FachadaBD fachada;
    
    public DaoEmpleado(){
        fachada = new FachadaBD();
    }
    public int guardarEmpleado(Empleado empleado){
        int filasGuardadas = 0;
        return filasGuardadas;
    }
    public Empleado consultarAsistente(String identificacion){
        Empleado empleado = null;
        return empleado;
    }
    public void modificarEmpleado(String identificacion){}
    public void listarEmpleado(){}
    public void borrarEmpleado(String identificacion){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
    
}
