/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorEvento;
import controladores.ControladorSede;

/**
 *
 * @author diegoruiz
 */
public class Reportes {
    ControladorSede controladorSede;
    ControladorEvento controladorEvento;
    
    public Reportes(){
        controladorEvento = new ControladorEvento();
        controladorSede = new ControladorSede();
    }
    
}
