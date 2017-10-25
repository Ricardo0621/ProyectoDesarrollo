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
    String id_empleado;
    String nombre;
    String direccion;
    String telefono;
    String fecha_creacion;
    
    /***** Constructor *****/
     public Sede() {
         identificacion = "";
         id_empleado = "";
         nombre = "";
         direccion = "";
         telefono = "";
         fecha_creacion = "";
    }
    /***** Fin Constructor ****/
     
     public Sede (String identificacion, String id_empleado,  String nombre, String direccion, String telefono, String fecha_creacion)
     {
         this.identificacion = identificacion; 
         this.id_empleado = id_empleado;
         this.nombre = nombre; 
         this.direccion = direccion; 
         this.telefono = telefono;
         this.fecha_creacion = fecha_creacion;
     }
     /***** Gets ******/
    public String getIdentificacion(){
        return identificacion;
    }
    public String getIdEmpleado()
    {
        return id_empleado;
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
    public String getFechaCreacion(){
        return fecha_creacion;
    }
    /***** Fin Gets****/
    
    /***** Sets *****/
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    
    public void setIdEmpleado(String id_empleado)
    {
        this.id_empleado = id_empleado;
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
    public void setFechaCreacion (String fecha_creacion){
        this.fecha_creacion = fecha_creacion; 
    }
    /***** Fin Sets ****/   
    
    /*validaciones*/ 
    
    public boolean validarDatosVacios ()
    {
        if (identificacion.equals("") || id_empleado.equals("") || telefono.equals("") || nombre.equals("") || direccion.equals("") || fecha_creacion.equals("")) {
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
