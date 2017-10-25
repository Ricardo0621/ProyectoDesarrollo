/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorEmpleado;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author diegoruiz
 */
public class TestPanelCrearUsuario extends JPanel implements MouseListener{
    //Fields
    JTextField txt_id;
    JComboBox comb_id_sede;
    JComboBox comb_rol;
    JTextField txt_primer_nombre;
    JTextField txt_segundo_nombre;
    JTextField txt_primer_apellido;
    JTextField txt_segundo_appelido;
    JTextField txt_direccion;
    JTextField txt_telefono;
    JTextField txt_email;
    JTextField txt_password;
    JComboBox comb_estado;
    //Labels
    JLabel label_panel_title;
    JLabel label_id;
    JLabel label_id_sede;
    JLabel label_rol;
    JLabel label_primer_nombre;
    JLabel label_segundo_nombre;
    JLabel label_prime_apellido;
    JLabel label_segundo_apellido;
    JLabel label_direccion;
    JLabel label_telefono;
    JLabel label_email;
    JLabel label_password;
    JLabel label_estado;
    
    //JButtons
    JButton btn_cancelar;
    JButton btn_enviar;
    
    public TestPanelCrearUsuario(){
        setLayout(null);
        this.setSize(420, 450);
        this.setBackground(Color.YELLOW);
       
        configurarEtiquetas();
        configurarCampos();
        configurarBotones();
    }
    
    //ConfigurarEtiquetas()
    public void configurarEtiquetas(){
        //Declaración de etiquetas
        label_panel_title = new JLabel("Registrar Usuario");
        label_id = new JLabel("* Identificación: ");
        label_id_sede = new JLabel("* Id sede: ");
        label_rol = new JLabel("* Cargo: ");
        label_primer_nombre = new JLabel("* Primer nombre: ");
        label_segundo_nombre = new JLabel("  Segundo nombre: ");
        label_prime_apellido = new JLabel("* Primer apellido: ");
        label_segundo_apellido = new JLabel("  Segundo apellido: ");
        label_direccion = new JLabel("* Dirección: ");
        label_telefono = new JLabel("* Teléfono: ");
        label_email = new JLabel("* email: ");
        label_password = new JLabel("* Password: ");
        label_estado = new JLabel("* Estado: ");
        
        //Ubicación de etiquetas
        label_panel_title.setBounds(140, 5, 300, 25); label_panel_title.setFont(new Font("Serif", Font.PLAIN, 20));
        label_id.setBounds(5, 40, 150, 25);
        label_id_sede.setBounds(5, 70, 150, 25);
        label_rol.setBounds(5, 100, 150, 25);
        label_primer_nombre.setBounds(5, 130, 150, 25);
        label_segundo_nombre.setBounds(5, 160, 150, 25);
        label_prime_apellido.setBounds(5, 190, 150, 25);
        label_segundo_apellido.setBounds(5, 220, 150, 25);
        label_direccion.setBounds(5, 250, 150, 25);
        label_telefono.setBounds(5, 280, 150, 25);
        label_email.setBounds(5, 310, 150, 25);
        label_password.setBounds(5, 340, 150, 25);
        label_estado.setBounds(5, 370, 150, 25);
        
        //Add labels
        this.add(label_panel_title);
        this.add(label_id);
        this.add(label_id_sede);
        this.add(label_rol);
        this.add(label_primer_nombre);
        this.add(label_segundo_nombre);
        this.add(label_prime_apellido);
        this.add(label_segundo_apellido);
        this.add(label_direccion);
        this.add(label_telefono);
        this.add(label_email);
        this.add(label_password);
        this.add(label_estado);
    }//Fin de configurar etiquetas
    
    //configurarCampos()
    public void configurarCampos(){
        //Arreglos auxiliares
        String[] sedes_id = {"Seleccione","12345", "12346", "12347"};
        String[] roles = {"Administrador", "Gerente", "Operador"};
        String[] estados = {"Activo", "Inactivo"};
        
        //Inicializar campos
        txt_id = new JTextField();
        comb_id_sede = new JComboBox(sedes_id);
        comb_rol = new JComboBox(roles);
        txt_primer_nombre = new JTextField();
        txt_segundo_nombre = new JTextField();
        txt_primer_apellido = new JTextField();
        txt_segundo_appelido = new JTextField();
        txt_direccion = new JTextField();
        txt_telefono = new JTextField();
        txt_email = new JTextField();
        txt_password = new JTextField();
        comb_estado = new JComboBox(estados);
        
        //Posicionar Campos
        txt_id.setBounds(165, 40, 250, 25);
        comb_id_sede.setBounds(165, 70, 250, 25);
        comb_rol.setBounds(165, 100, 250, 25);
        txt_primer_nombre.setBounds(165, 130, 250, 25);
        txt_segundo_nombre.setBounds(165, 160, 250, 25);
        txt_primer_apellido.setBounds(165, 190, 250, 25);
        txt_segundo_appelido.setBounds(165, 220, 250, 25);
        txt_direccion.setBounds(165, 250, 250, 25);
        txt_telefono.setBounds(165, 280, 250, 25);
        txt_email.setBounds(165, 310, 250, 25);
        txt_password.setBounds(165, 340, 250, 25);
        comb_estado.setBounds(165, 370, 250, 25);
        
        //Add Campos
        this.add(txt_id);
        this.add(comb_id_sede);
        this.add(comb_rol);
        this.add(txt_primer_nombre);
        this.add(txt_segundo_nombre);
        this.add(txt_primer_apellido);
        this.add(txt_segundo_appelido);
        this.add(txt_direccion);
        this.add(txt_telefono);
        this.add(txt_email);
        this.add(txt_password);
        this.add(comb_estado);
    }//Fin de configurar campos
    
    //Configurar botones
    public void configurarBotones(){
        btn_enviar = new JButton("Enviar");
        btn_cancelar = new JButton("Cancelar");
        
        btn_enviar.setBounds(165, 405, 120, 40);
        btn_cancelar.setBounds(295, 405, 120, 40);
        
        btn_enviar.addMouseListener(this);
        btn_cancelar.addMouseListener(this);
        
        this.add(btn_enviar);
        this.add(btn_cancelar);
    }//fin de configurar botones
    
    //crear usuario
    public void crearUsuario(){
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        String identificacion = txt_id.getText();
        String id_sede = comb_id_sede.getSelectedItem().toString();
        String rol = comb_rol.getSelectedItem().toString();
        String primer_nombre = txt_primer_nombre.getText();
        String segundo_nombre = txt_segundo_nombre.getText();
        String primer_apellido = txt_primer_apellido.getText();
        String segundo_apellido = txt_segundo_appelido.getText();
        String direccion = txt_direccion.getText();
        String telefono = txt_telefono.getText();
        String email = txt_email.getText();
        String password = txt_password.getText();
        String estado = comb_estado.getSelectedItem().toString();
        
        int insertar_usurio;
        insertar_usurio = controladorEmpleado.insertarEmpleado(identificacion, id_sede, rol, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, direccion, telefono, email, password, estado);
        if(insertar_usurio >= 1){
            System.out.println("Insertado Correctamente");
        }else{
            System.out.println("NO Insertado Correctamente");
        }
    }//Fin de crear usuario

    //Metodos para el evento del mouse
    @Override
    public void mouseClicked(MouseEvent e) {
        crearUsuario();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    public class VentanaOpciones extends JDialog {
        
    }

      
}//Fin class TestPanelCreateUsuario
