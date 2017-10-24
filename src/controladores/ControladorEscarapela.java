/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoEscarapela;
import logica.Escarapela;
import logica.Pago;

/**
 *
 * @author diegoruiz
 */
public class ControladorEscarapela {
    DaoEscarapela daoEscarapela;
    
    public ControladorEscarapela(){
        daoEscarapela = new DaoEscarapela();
    }
    
    public int  insertarEscarapeola(String  identificacion, String pago_id, Pago pago){
        int result = 0;
        return result;
    }//end

    public Escarapela consultarEscarapela(String identificacion){
        Escarapela escarapela = new Escarapela();
        return escarapela;
    }

    public void listarEscarapelas(){}
    
    public void cerrarConexionBD(){
        daoEscarapela.cerrarConexionBD();
    }
}
