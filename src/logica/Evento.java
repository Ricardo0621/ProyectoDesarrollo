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
public class Evento {
    /***** Atributos *****/
    String identificacion;
    String nombre;
    String descripcion;
    String lugar;
    String fecha_creacion;
    String fecha_inicio;
    String fecha_fin;
    int valor;

    /***** Constructor *****/
    public Evento() {
        identificacion = "";
        nombre = "";
        descripcion = "";
        lugar = "";
        fecha_creacion = "";
        fecha_inicio = "";
        fecha_fin = "";
        valor = 0;
    }
    /***** Fin Constructor ****/
    
    /***** Gets ******/
    public String getIdentificacion(){
        return identificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getLugar(){
        return lugar;
    }
    public String getFechaCreacion(){
        return fecha_creacion;
    }
    public String getFechaInicio(){
        return fecha_inicio;
    }
    
    public String getFechaFin(){
        return fecha_fin;
    }
    public int getValor(){
        return valor;
    }
    /***** Fin Gets****/
    
    /***** Sets *****/
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescipcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setLugar(String lugar){
        this.lugar=lugar;
    }
    public void setFechaCreacion(String fecha_creacion){
        this.fecha_creacion=fecha_creacion;
    }
    public void setFechaInicio(String fecha_inicio){
        this.fecha_inicio=fecha_inicio;
    }
    public void setFechaFin(String fecha_fin){
        this.fecha_fin=fecha_fin;
    }
    public void setCorreo(int valor){
        this.valor=valor;
    }
    /***** Fin Sets ****/
    
}//Fin class Evento
