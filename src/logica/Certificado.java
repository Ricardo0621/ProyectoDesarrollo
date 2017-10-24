/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author diegoruiz
 */
public class Certificado {
    /***** Atributos *****/
    String identificacion;
    String pago_id;
    Pago pago;
    
    /***** Constructor *****/
    public Certificado(){
        pago = new Pago();
        pago_id = "";
        identificacion = "";
        
    }
    /***** Fin Constructor ****/
     
     /***** Gets ******/
    public String getIdentificacion(){
        return identificacion;
    }
    public String getPagoId(){
        return pago_id;
    }
    /***** Fin Gets****/
    
    /***** Sets *****/
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setPagoId(){
        this.pago_id=pago.getIdentificacion();
    }
    /***** Fin Sets ****/ 
}
