/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import logica.Sede;

/**
 *
 * @author diegoruiz
 */
public class DaoSede {
    FachadaBD fachada;
    
    public DaoSede(){
        fachada = new FachadaBD();
    }
    public int guardarSede(Sede sede){
        int filasGuardadas = 0;
        return filasGuardadas;
    }
    public Sede consultarAsistente(String identificacion){
        Sede sede = null;
        return sede;
    }
    public void modificarSede(String identificacion){}
    public void listarSedes(){}
    public void borrarSede(String identificacion){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
    
}
