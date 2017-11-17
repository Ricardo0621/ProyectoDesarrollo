/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoAsistente;
import logica.Asistente;

/**
 *
 * @author diegoruiz
 */
public class ControladorAsistente {
    DaoAsistente daoAsistente;
    
    public ControladorAsistente(){
        daoAsistente = new DaoAsistente();
    }
    
    public int  insertarAsistente(String identificacion, String  primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String direccion, String telefono, String correo){
        Asistente a = new Asistente();
        a.setIdentificacion(identificacion);
        a.setPrimerNombre(primer_nombre);
        a.setSegundoNombre(segundo_nombre);
        a.setPrimerApellido(primer_apellido);
        a.setSegundoApellido(segundo_apellido);
        a.setDireccion(direccion);
        a.setTelefono(telefono);
        a.setCorreo(correo);
        return daoAsistente.guardarAsistente(a);
    }//Fin de insertarAsistente()

    public boolean consultarAsistente(String identificacion){
        return daoAsistente.consultarAsistente(identificacion);
    }//Fin de consultarAsistente()

    public String[] extraerAsistente(String identificacion){
        String[] datos_asistente = new String[8];
        Asistente asistente = new Asistente();
        asistente = daoAsistente.recuperarAsistente(identificacion);
        datos_asistente[0] = asistente.getIdentificacion();
        datos_asistente[1] = asistente.getPrimerNombre();
        datos_asistente[2] = asistente.getSegundoNombre();
        datos_asistente[3] = asistente.getPrimerApellido();
        datos_asistente[4] = asistente.getSegundoApellido();
        datos_asistente[5] = asistente.getDireccion();
        datos_asistente[6] = asistente.getTelefono();
        datos_asistente[7] = asistente.getCorreo();
        return datos_asistente;
    }//Fin de extraerAsistente()
    
    public int editarAsistente(String identificacion, String  primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String direccion, String telefono, String correo){
        Asistente a = new Asistente();
        a.setIdentificacion(identificacion);
        a.setPrimerNombre(primer_nombre);
        a.setSegundoNombre(segundo_nombre);
        a.setPrimerApellido(primer_apellido);
        a.setSegundoApellido(segundo_apellido);
        a.setDireccion(direccion);
        a.setTelefono(telefono);
        a.setCorreo(correo);
        return daoAsistente.modificarAsistente(a);
    }//Fin de editarAsistente()
    
    public String[] listarAsistentes( String[] ids){
        String[] asistentes;
        Asistente[] obj_empleados = daoAsistente.listarAsistentes(ids);
        asistentes = new String[obj_empleados.length];
        for(int i=0; i<asistentes.length; i++){
            asistentes[i] = obj_empleados[i].getIdentificacion()+";;;"+obj_empleados[i].getPrimerNombre()+";;;"+
                            obj_empleados[i].getSegundoNombre()+";;;"+obj_empleados[i].getPrimerApellido()+";;;"+
                            obj_empleados[i].getSegundoApellido()+";;;"+obj_empleados[i].getDireccion()+";;;"+
                            obj_empleados[i].getTelefono()+";;;"+obj_empleados[i].getCorreo();
        }
        return asistentes;
    }//Fin de listarAsistentes que asistieron a un evento
    
    public void cerrarConexionBD(){
        daoAsistente.cerrarConexionBD();
    }
    
}
