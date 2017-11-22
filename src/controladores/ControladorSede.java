/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoSede;
import java.util.Arrays;
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
 
    public int registrarSede(String identificacion, String id_empleado,  String nombre, String direccion, String telefono, String fecha_creacion)
    {
        Sede sede;
        sede = new Sede();
        sede.setIdentificacion(identificacion);
        sede.setIdEmpleado(id_empleado);
        sede.setNombre(nombre);
        sede.setDirecion(direccion);
        sede.setTelefono(telefono);
        sede.setFechaCreacion(fecha_creacion);
        return daoSede.registarSede(sede);
    }
    
    public boolean consultarSede(String identificacion){
        return daoSede.consultarSede(identificacion);
    }//Fin de consultarEmpleado()
    
    public String[] extraerSede(String identificacion){
        String[] datos_sedes = new String[6];
        Sede sede = new Sede();
        sede = daoSede.recuperarSede(identificacion);
        datos_sedes[0] = sede.getIdentificacion();
        datos_sedes[1] = sede.getIdEmpleado();
        datos_sedes[2] = sede.getNombre();
        datos_sedes[3] = sede.getDirecion();
        datos_sedes[4] = sede.getTelefono();
        datos_sedes[5] = sede.getFechaCreacion();
        return datos_sedes;
    }//Fin de extraerSedes()
    
    public int editarSede(String identificacion, String id_empleado,  String nombre, String direccion, String telefono, String fecha_creacion){
        Sede sede = new Sede();
        sede.setIdentificacion(identificacion);
        sede.setIdEmpleado(id_empleado);
        sede.setNombre(nombre);
        sede.setDirecion(direccion);
        sede.setTelefono(telefono);
        sede.setFechaCreacion(fecha_creacion);
        return daoSede.modificarSedes(sede);
    }//Fin de editarSede()
    
    public String[] listarIdNombreSedes(){
        String[] nombres_ids_sedes;
        Sede[] sedes = daoSede.listarSedes();
        nombres_ids_sedes = new String[sedes.length];
        for(int i=0; i<sedes.length; i++){
            nombres_ids_sedes[i] = sedes[i].getIdentificacion()+";;;"
                    +sedes[i].getIdEmpleado()+";;;"
                    +sedes[i].getNombre() +";;;"
                    +sedes[i].getDirecion()+";;;"
                    +sedes[i].getTelefono()+";;;"
                    +sedes[i].getFechaCreacion();
        }
        return nombres_ids_sedes;
    }
}
