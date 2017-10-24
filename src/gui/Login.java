/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorAsistente;
import controladores.ControladorEmpleado;

/**
 *
 * @author diegoruiz
 */
public class Login {
    String usuario;
    String password;
    ControladorEmpleado controladorEmpleado;
    UserPanel userPanel;
    public Login(){
        usuario = "";
        password = "";
        controladorEmpleado = new ControladorEmpleado();
        userPanel = new UserPanel();
    }
    
    boolean verificarLogin(){
        return true;
    }
    
    
}
