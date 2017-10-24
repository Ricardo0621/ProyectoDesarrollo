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
    String id_sede;
    String direccion;
    String telefono;
    String correo;
    String password;
    String rol;
    String estado;

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
        estado = "";
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
    public String getIdSede(){
        return id_sede;
    }
    public String getDireccion(){
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
    public String getEstado(){
        return estado;
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
    public void setIdSede(String id_sede){
        this.id_sede=id_sede;
    }
    public void setDireccion(String direccion){
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
    public void setEstado(String estado){
        this.estado=estado;
    }
    /***** Fin Sets ****/
    
} //Fin class Empleado
