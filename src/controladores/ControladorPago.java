/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoPago;
import logica.Pago;

/**
 *
 * @author diegoruiz
 */
public class ControladorPago {
    DaoPago daoPago;
    
    public ControladorPago(){
        daoPago = new DaoPago();
    }
    
    public int  insertarPago(String  identificacion, String evento_id, String empleado_id, String asistente_id, String metodo_pago, String fecha, String estado){
        int result = 0;
        return result;
    }//end

    public Pago consultarAsistente(String identificacion){
        Pago pago = new Pago();
        return pago;
    }

    public void listarPagos(){}
    
    public void cerrarConexionBD(){
        daoPago.cerrarConexionBD();
    }
}
