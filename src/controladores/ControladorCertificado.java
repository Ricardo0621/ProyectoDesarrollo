/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoCertificado;
import logica.Certificado;
import logica.Pago;

/**
 *
 * @author diegoruiz
 */
public class ControladorCertificado {
    DaoCertificado daoCertificado;
    
    public ControladorCertificado(){
        daoCertificado = new DaoCertificado();
    }
    
    public int  insertarCertificado(String  identificacion, String pago_id, Pago pago){
        int result = 0;
        return result;
    }//end

    public Certificado consultarCertificado(String identificacion){
        Certificado certificado = new Certificado();
        return certificado;
    }

    public void listarCertificados(){}
    
    public void cerrarConexionBD(){
        daoCertificado.cerrarConexionBD();
    }
}
