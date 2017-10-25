/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import logica.Asistente;

/**
 *
 * @author diegoruiz
 */
public class DaoAsistente {
    FachadaBD fachada;
    
    public DaoAsistente(){
        fachada = new FachadaBD();
    }
    public int guardarAsistente(Asistente asistente){
        int filasGuardadas = 0;
        return filasGuardadas;
    }
    public Asistente consultarAsistente(String identificacion){
        Asistente asistente = null;
        return asistente;
    }
    public void modificarAsistente(String identificacion){}
    public void listarAsistentes(){}
    public void borrarAsistente(String identificacion){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }  
}//Fin class DaoAsistente
