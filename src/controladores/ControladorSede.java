/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoSede;
import logica.Sede;

/**
 *
 * @author diegoruiz
 */
public class ControladorSede {
    DaoSede daoSede;
    
    public ControladorSede(){
        daoSede = new DaoSede();
    }
    
    public int  insertarSede(String  identificacion, String nombre, String direccion, String telefono){
        int result = 0;
        return result;
    }//end

    public Sede consultarAsistente(String identificacion){
        Sede sede = new Sede();
        return sede;
    }

    public void listarSedes(){}
    
    public void cerrarConexionBD(){
        daoSede.cerrarConexionBD();
    } 
}
