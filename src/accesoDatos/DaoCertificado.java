/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import logica.Certificado;

/**
 *
 * @author diegoruiz
 */
public class DaoCertificado {
    FachadaBD fachada;
    
    public DaoCertificado(){
        fachada = new FachadaBD();
    }
    public int guardarCertificado(Certificado certificado){
        int filasGuardadas = 0;
        return filasGuardadas;
    }
    public Certificado consultarCertificado(String identificacion){
        Certificado certificado = null;
        return certificado;
    }
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
}
