/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import logica.Evento;

/**
 *
 * @author diegoruiz
 */
public class DaoEvento {
    FachadaBD fachada;
    
    public DaoEvento(){
        fachada = new FachadaBD();
    }
    public int guardarEvento(Evento evento){
        int filasGuardadas = 0;
        return filasGuardadas;
    }
    public Evento consultarEvento(String identificacion){
        Evento evento = null;
        return evento;
    }
    public void modificarEvento(String identificacion){}
    public void listarEventos(){}
    public void borrarEvento(String identificacion){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
    
}
