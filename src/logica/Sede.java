/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.regex.Pattern;

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
    String director;
    
    /***** Constructor *****/
     public Sede() {
         identificacion = "";
         nombre = "";
         direccion = "";
         telefono = "";
         director = "";
    }
    /***** Fin Constructor ****/
     
     public Sede (String id, String nombre, String dir, String tel, String director)
     {
         this.identificacion = id; 
         this.nombre = nombre; 
         this.direccion = dir; 
         this.telefono = tel; 
         if(director == "") 
             this.director = "";
         else this.director = director;
     }
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
    public String getDirector(){
        return director;
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
    public void setDirector (String director){
        this.director = director; 
    }
    /***** Fin Sets ****/   
    
    /*validaciones*/ 
    
    public boolean validarDatosVacios ()
    {
        if (identificacion.equals("") || telefono.equals("") || nombre.equals("") || direccion.equals("") || director.equals("")) {
            return false;
        }
        else {
            return true; 
        }
    }
    public boolean validarCaracteresNombre(){
       // System.out.println("nombre ");
        if(nombre.contains("=") || nombre.contains("*") || !(auxiliarValidarNombre() ))
        {
            return false;
        }
        else return true;
    }
    public boolean auxiliarValidarNombre()
    {
        if( Pattern.matches("[a-zA-Z]+", nombre)) 
                return true; 
        else return false;
    }
      public boolean validarCaracteresDireccion (){
        
        if(direccion.contains("=") || direccion.contains("*"))
        {
            return false;
        }
        else return true;
    }
      
      public boolean validarCaracteresTelefono(){
        
        if(telefono.contains("=") || telefono.contains("*") || !(auxiliarValidarTelefono()) )
        {
            return false;
        }
        else return true;
    }
      
      public boolean auxiliarValidarTelefono()
      {
          if(Pattern.matches("[0-9]+", telefono)   && telefono.length() > 0)
             return true;
          else return false; 
      }
     public boolean validarCaracteresIdentificacion(){
        
        if(identificacion.contains("=") || identificacion.contains("*"))
          {
               return false;
           }
           else return true;
    }
     
    public boolean validarCaracteres()
    {
        if(validarCaracteresIdentificacion() && validarCaracteresNombre() 
                && validarCaracteresDireccion() &&validarCaracteresTelefono())
            return true;
        else return false; 
            
    }
     
     
     
           

} //Fin class Sede
