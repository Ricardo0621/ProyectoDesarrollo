/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import logica.Escarapela;

/**
 *
 * @author diegoruiz
 */
public class DaoEscarapela {
    FachadaBD fachada;
    
    public DaoEscarapela(){
        fachada = new FachadaBD();
    }
    public int guardarEscarapela(Escarapela escarapela){
        int filasGuardadas = 0;
        return filasGuardadas;
    }
    public Escarapela consultarEscarapela(String identificacion){
        Escarapela escarapela = null;
        return escarapela;
    }
    public void listarEscarapela(){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
    
}
