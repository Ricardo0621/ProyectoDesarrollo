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
public class Sede {
    /***** Atributos *****/
    String identificacion;
    String nombre;
    String direccion;
    String telefono;
    
    /***** Constructor *****/
     public Sede() {
         identificacion = "";
         nombre = "";
         direccion = "";
         telefono = "";
    }
    /***** Fin Constructor ****/
     
     /***** Gets ******/
    public String getIdentificacion(){
        return identificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDirecion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    /***** Fin Gets****/
    
    /***** Sets *****/
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDirecion(String direccion){
        this.direccion=direccion;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    /***** Fin Sets ****/   
} //Fin class Sede
