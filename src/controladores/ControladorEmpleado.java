/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoEmpleado;
import java.util.Arrays;
import logica.Empleado;

/**
 *
 * @author diegoruiz
 */
public class ControladorEmpleado {
    DaoEmpleado daoEmpleado;
    
    public ControladorEmpleado(){
        daoEmpleado = new DaoEmpleado();
    }
    
    public int  insertarEmpleado(String identificacion, String id_sede, String rol, String  primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String direccion, String telefono, String correo, String password, String estado){
        Empleado e = new Empleado();
        e.setIdentificacion(identificacion);
        e.setIdSede(id_sede);
        e.setRol(rol);
        e.setPrimerNombre(primer_nombre);
        e.setSegundoNombre(segundo_nombre);
        e.setPrimerApellido(primer_apellido);
        e.setSegundoApellido(segundo_apellido);
        e.setDireccion(direccion);
        e.setTelefono(telefono);
        e.setCorreo(correo);
        e.setPassword(password);
        e.setEstado(estado);
        return daoEmpleado.guardarEmpleado(e);
    }//Fin de insertarEmpleado()
    
    public boolean consultarEmpleado(String identificacion){
        return daoEmpleado.consultarEmpleado(identificacion);
    }//Fin de consultarEmpleado()
    
    public String[] extraerEmpleado(String identificacion){
        String[] datos_empleado = new String[12];
        Empleado empleado = new Empleado();
        empleado = daoEmpleado.recuperarEmpleado(identificacion);
        datos_empleado[0] = empleado.getIdentificacion();
        datos_empleado[1] = empleado.getIdSede();
        datos_empleado[2] = empleado.getRol();
        datos_empleado[3] = empleado.getPrimerNombre();
        datos_empleado[4] = empleado.getSegundoNombre();
        datos_empleado[5] = empleado.getPrimerApellido();
        datos_empleado[6] = empleado.getSegundoApellido();
        datos_empleado[7] = empleado.getDireccion();
        datos_empleado[8] = empleado.getTelefono();
        datos_empleado[9] = empleado.getCorreo();
        datos_empleado[10] = empleado.getPassword();
        datos_empleado[11] = empleado.getEstado();
        return datos_empleado;
    }//Fin de extraerEmpleado()
    
    public int editarEmpleado(String identificacion, String id_sede, String rol, String  primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String direccion, String telefono, String correo, String password, String estado){
        Empleado e = new Empleado();
        e.setIdentificacion(identificacion);
        e.setIdSede(id_sede);
        e.setRol(rol);
        e.setPrimerNombre(primer_nombre);
        e.setSegundoNombre(segundo_nombre);
        e.setPrimerApellido(primer_apellido);
        e.setSegundoApellido(segundo_apellido);
        e.setDireccion(direccion);
        e.setTelefono(telefono);
        e.setCorreo(correo);
        e.setPassword(password);
        e.setEstado(estado);
        return daoEmpleado.modificarEmpleado(e);
    }
    
    public String[] listarEmpleados( String id_sede, String rol, String estado){
        String[] empleados;
        Empleado[] obj_empleados = daoEmpleado.listarEmpleados(id_sede, rol, estado);
        empleados = new String[obj_empleados.length];
        for(int i=0; i<empleados.length; i++){
            empleados[i] = obj_empleados[i].getIdentificacion()+";;;"+obj_empleados[i].getIdSede()+";;;"+obj_empleados[i].getRol()+";;;"+
                           obj_empleados[i].getPrimerNombre()+";;;"+obj_empleados[i].getSegundoNombre()+";;;"+obj_empleados[i].getPrimerApellido()+";;;"+
                           obj_empleados[i].getSegundoApellido()+";;;"+obj_empleados[i].getDireccion()+";;;"+obj_empleados[i].getTelefono()+";;;"+
                           obj_empleados[i].getCorreo()+";;;"+obj_empleados[i].getPassword()+";;;"+obj_empleados[i].getEstado();
        }
        return empleados;
    }
    
    public void cerrarConexionBD(){
        daoEmpleado.cerrarConexionBD();
    }
    
}
