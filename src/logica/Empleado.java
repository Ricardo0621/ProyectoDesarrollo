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
public class Empleado {
    /***** Atributos *****/
    String primer_nombre;
    String segundo_nombre;
    String primer_apellido;
    String segundo_apellido;
    String identificacion;
    String direccion;
    String telefono;
    String correo;
    String password;
    String rol;

    /***** Constructor *****/
    public Empleado() {
        primer_nombre = "";
        segundo_nombre = "";
        primer_apellido = "";
        segundo_apellido = "";
        identificacion = "";
        direccion = "";
        telefono = "";
        correo = "";
        password = "";
        rol = "";
    }
    /***** Fin Constructor ****/
    
    /***** Gets ******/
    public String getPrimerNombre(){
        return primer_nombre;
    }
    public String getSegundoNombre(){
        return segundo_nombre;
    }
    public String getPrimerApellido(){
        return primer_apellido;
    }
    public String getSegundoApellido(){
        return segundo_apellido;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public String getDirecion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getCorreo(){
        return correo;
    }
    public String getPassword(){
        return password;
    }
    public String getRol(){
        return rol;
    }
    /***** Fin Gets****/
    
    /***** Sets *****/
    public void setPrimerNombre(String primer_nombre){
        this.primer_nombre = primer_nombre;
    }
    public void setSegundoNombre(String segundo_nombre){
        this.segundo_nombre=segundo_nombre;
    }
    public void setPrimerApellido(String primer_apellido){
        this.primer_apellido=primer_apellido;
    }
    public void setSegundoApellido(String segundo_apellido){
        this.segundo_apellido=segundo_apellido;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setDirecion(String direccion){
        this.direccion=direccion;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setRol(String rol){
        this.rol=rol;
    }
    /***** Fin Sets ****/
    
} //Fin class Empleado
