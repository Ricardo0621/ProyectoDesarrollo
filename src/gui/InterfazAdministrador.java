/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author diegoruiz
 */
public class InterfazAdministrador extends JFrame{
    Reportes reportes;
    PanelCrearUsuario testPanelCrearUsuario;
    public InterfazAdministrador(String id_empleado){
        super();
        reportes = new Reportes();
        configurarUserPanel();                                               // configuramos la ventana
        testPanelCrearUsuario = new PanelCrearUsuario("Registrar Usuario");
        testPanelCrearUsuario.setBounds(370, 10, 420, 550);
        this.add(testPanelCrearUsuario);
    }
    
    private void configurarUserPanel() {
        this.setTitle("Panel de usuario");                      // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
}//Fin clase 
