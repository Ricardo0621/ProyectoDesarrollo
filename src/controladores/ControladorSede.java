/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoSede;
import logica.Sede;

/**
 *
 * @author diegoruiz
 */
public class ControladorSede {
    
    DaoSede daoSede; 
    
    public ControladorSede () {
        daoSede = new DaoSede(); 
    }
 
    public String datosVacios (String identificacion, String nombre, String direccion, String telefono)
    {
        Sede s= new Sede (identificacion, nombre, direccion, telefono);
        if (!(s.validarDatosVacios()))
            return "Todos los campos son obligatorios.";
        else return "";
    }
    public String datosIdentificacion (String identificacion, String nombre, String direccion, String telefono)
    {
        Sede s = new Sede (identificacion, nombre, direccion, telefono);
        if(!(s.validarCaracteresIdentificacion()))
            return "Identificación con uno o varios caracteres inválidos.";
        else return "";
    }
            
    public String datosNombre (String identificacion, String nombre, String direccion, String telefono)
    {
        Sede s = new Sede (identificacion, nombre, direccion, telefono);
        if(!(s.validarCaracteresNombre()))
            return "Nombre con uno o varios caracteres inválidos.";
        else return "";
    }
    
    public String datosDireccion (String identificacion, String nombre, String direccion, String telefono)
    {
        Sede s = new Sede (identificacion, nombre, direccion,telefono);
        if(!(s.validarCaracteresNombre()))
            return "Dirección con uno o varios caracteres inválidos.";
        else return "";
    }
    
    public String datosTelefono( String identificacion, String nombre, String direccion, String telefono)
    {
        Sede s = new Sede (identificacion, nombre, direccion, telefono);
        if(!(s.validarCaracteresTelefono()))
            return"Teléfono con uno o varios caracteres inválidos.";
        else return "";
    }
    
   
    public boolean validarDatosModif(String identificacion, String nombre, String direccion, String telefono)
    {
        Sede s = new Sede(identificacion, nombre, direccion, telefono);
        
        if (!s.validarDatosVacios() )
            return false; 
            //return "Todos los campos son obligatorios";
        else if (!(s.validarCaracteresDireccion()))
            return false;
          //  return "Dirección con uno o varios caracteres inválidos.";
        else if (!(s.validarCaracteresIdentificacion() ))
            return false;
         //   return "Identificación con uno o varios caracteres inválidos";
        else if (!(s.validarCaracteresTelefono()))
            return false;
         //   return "Teléfono con uno o varios caracteres inválidos.";
        else if (!(s.validarCaracteresNombre() ))
            return false;
         //   return "Nombre con uno o varios caracteres inválidos.";
        else //return ""; 
            return true;
    }
    public int  modificarSede(String identificacion, String nombre, String direccion, String telefono)
    {
        Sede s = new Sede(identificacion, nombre, direccion, telefono);
        System.out.println("se va a modificar una sede");
        
        
        
        int result = daoSede.modificarSede(s); 
        
       
        System.out.println("se modificó una sede");
        
        return result; 
        
    }
}
