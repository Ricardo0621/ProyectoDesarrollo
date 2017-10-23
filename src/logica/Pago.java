/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import controladores.ControladorAsistente;
import controladores.ControladorEmpleado;
import controladores.ControladorEvento;

/**
 *
 * @author diegoruiz
 */
public class Pago {
    /***** Atributos *****/
    String identificacion;
    String metodo_pago;
    String fecha;
    String estado;
    String evento_id;
    String empleado_id;
    String asistente_id;
    ControladorAsistente controladorAsistente;
    ControladorEmpleado controladorEmpleado;
    ControladorEvento controladorEvento;
    
    /***** Constructor *****/
     public Pago() {
         identificacion = "";
         metodo_pago = "";
         fecha = "";
         estado = "";
         controladorAsistente = new ControladorAsistente();
         controladorEmpleado = new ControladorEmpleado();
         controladorEvento = new ControladorEvento();
    }
    /***** Fin Constructor ****/
     
     /***** Gets ******/
    public String getIdentificacion(){
        return identificacion;
    }
    public String getMetodoPago(){
        return metodo_pago;
    }
    public String getFecha(){
        return fecha;
    }
    public String getEstado(){
        return estado;
    }
    public String getEmpleadoId(){
        return empleado_id;
    }
    public String getAsistenteId(){
        return asistente_id;
    }
    public String getEventoId(){
        return evento_id;
    }
    /***** Fin Gets****/
    
    /***** Sets *****/
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setMetodoPago(String metodo_pago){
        this.metodo_pago=metodo_pago;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public void setEmpleadoId(String empleado_id){
        this.empleado_id=empleado_id;
    }
    public void setAsistenteId(String asistente_id){
        this.asistente_id=asistente_id;
    }
    public void setEventoId(String evento_id){
        this.evento_id=evento_id;
    }
    /***** Fin Sets ****/ 
    
}
