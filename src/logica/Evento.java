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
    String id_empleado;
    String nombre;
    String descripcion;
    String fecha_creacion;
    String fecha_inicio;
    String fecha_fin;
    String horario;
    int horas; //Duración del evento, ejemplo: 30 horas
    int valor;
    String lugar;
    int cupos;
    String estado;
    

    /***** Constructor *****/
    public Evento() {
        identificacion = "";
        id_empleado = "";
        nombre = "";
        descripcion = "";
        fecha_creacion = "";
        fecha_inicio = "";
        fecha_fin = "";
        horario = "";
        horas = 0;
        valor = 0;
        lugar = "";
        cupos = 0;
        estado = "";
    }
    /***** Fin Constructor ****/
    
    /***** Gets ******/
    public String getIdentificacion(){
        return identificacion;
    }
    public String getIdEmpleado(){
        return id_empleado;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
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
    public String getHorario(){
        return horario;
    }
    public int getHoras(){
        return horas;
    }
    public int getValor(){
        return valor;
    }
    public String getLugar(){
        return lugar;
    }
    public int getCupos(){
        return cupos;
    }
    public String getEstado(){
        return estado;
    }
    /***** Fin Gets****/
    
    /***** Sets *****/
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setIdEmpleado(String id_empleado){
        this.id_empleado=id_empleado;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescipcion(String descripcion){
        this.descripcion=descripcion;
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
    public void setHorario(String horario){
        this.horario=horario;
    }
    public void setHoras(int horas){
        this.horas=horas;
    }
    public void setValor(int valor){
        this.valor=valor;
    }
    public void setLugar(String lugar){
        this.lugar=lugar;
    }
    public void setCupos(int cupos){
        this.cupos=cupos;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    /***** Fin Sets ****/
    
}//Fin class Evento
