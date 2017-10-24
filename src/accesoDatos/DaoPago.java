/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import logica.Pago;

/**
 *
 * @author diegoruiz
 */
public class DaoPago {
    FachadaBD fachada;
    
    public DaoPago(){
        fachada = new FachadaBD();
    }
    public int guardarPago(Pago pago){
        int filasGuardadas = 0;
        return filasGuardadas;
    }
    public Pago consultarPago(String identificacion){
        Pago pago = null;
        return pago;
    }
    public void modificarPago(String identificacion){}
    public void listarPagos(){}
    public void borrarPagos(String identificacion){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
}
