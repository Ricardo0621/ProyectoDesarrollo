/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoEvento;
import logica.Evento;

/**
 *
 * @author diegoruiz
 */
public class ControladorEvento {
    DaoEvento daoEvento;
    
    public ControladorEvento(){
        daoEvento = new DaoEvento();
    }
    
    public int  insertarEvento(String  identificacion, String nombre, String descripcion, String lugar, String fecha_creacion, String fecha_inicio, String fecha_fin, int valor){
        int result = 0;
        return result;
    }//end

    public Evento consultarEvento(String identificacion){
        Evento evento = new Evento();
        return evento;
    }

    public void listarEventos(){}
    
    public void cerrarConexionBD(){
        daoEvento.cerrarConexionBD();
    }
}
