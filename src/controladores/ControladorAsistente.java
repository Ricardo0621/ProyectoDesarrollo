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
    
    public int  insertarAsistente(String  primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String identificacion, String direccion, String telefono, String correo){
        int result = 0;
        return result;
    }//end

    public Asistente consultarAsistente(String identificacion){
        Asistente asistente = new Asistente();
        return asistente;
    }

    public void listarAsistentes(){}
    
    public void cerrarConexionBD(){
        daoAsistente.cerrarConexionBD();
    }
    
}
