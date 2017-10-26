/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorEmpleado;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author diegoruiz
 */
public class PanelCrearUsuario extends JPanel implements ActionListener{
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
    JLabel label_alert;
    
    //JButtons
    JButton btn_cancelar;
    JButton btn_enviar;
    
    //Array Para alertas
    String[] alertas ={"Ingrese un número si caracteres especiales", 
                       "Debe Seleccionar una sede para el usuario", 
                       "Debe seleccionar un rol para el usuario", 
                       "Ingrese El nombre sin caracteres especiales",
                       "", 
                       "Ingrese el apellido sin caracteres especiales", 
                       "", 
                       "Ingrese una dirección correcta", 
                       "Digite un número de teléfono correcto", 
                       "Debe indicar una dirección de correo válida", 
                       "EL password debe contener al menos 5 caracteres", 
                       "Debe seleccionar un estado al para el usuario",
                       "Ya existe un usuario con esa identificación",
                       "No se pudo crear el usuario, verifique la base de datos"};
    
    //variables auxiliares
    String accion;
    private JDialog ventanaSecundaria;
    
    public PanelCrearUsuario(String accion){
        setLayout(null);
        this.setSize(420, 550);
        this.setBackground(Color.YELLOW);
        this.accion = accion;
        Border lowerEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder title = BorderFactory.createTitledBorder(lowerEtched, this.accion);
        Font titleFont = UIManager.getFont("TitledBorder.font");
        title.setTitleFont( titleFont.deriveFont(Font.ITALIC + Font.BOLD, 20) );
        this.setBorder(title);
       
        configurarEtiquetas();
        configurarCampos();
        configurarBotones();
    }
    
    //ConfigurarEtiquetas()
    public void configurarEtiquetas(){
        //Declaración de etiquetas
        label_id = new JLabel("* Identificación: ", SwingConstants.RIGHT);
        label_id_sede = new JLabel("* Id sede: ", SwingConstants.RIGHT);
        label_rol = new JLabel("* Cargo: ", SwingConstants.RIGHT);
        label_primer_nombre = new JLabel("* Primer nombre: ", SwingConstants.RIGHT);
        label_segundo_nombre = new JLabel("  Segundo nombre: ", SwingConstants.RIGHT);
        label_prime_apellido = new JLabel("* Primer apellido: ", SwingConstants.RIGHT);
        label_segundo_apellido = new JLabel("  Segundo apellido: ", SwingConstants.RIGHT);
        label_direccion = new JLabel("* Dirección: ", SwingConstants.RIGHT);
        label_telefono = new JLabel("* Teléfono: ", SwingConstants.RIGHT);
        label_email = new JLabel("* email: ", SwingConstants.RIGHT);
        label_password = new JLabel("* Password: ", SwingConstants.RIGHT);
        label_estado = new JLabel("* Estado: ", SwingConstants.RIGHT);
        label_alert = new JLabel("<html><font color='red'></font></html>", SwingConstants.CENTER);
        
        //Ubicación de etiquetas
        label_id.setBounds(5, 30, 150, 35);
        label_id_sede.setBounds(5, 67, 150, 35);
        label_rol.setBounds(5, 104, 150, 35);
        label_primer_nombre.setBounds(5, 141, 150, 35);
        label_segundo_nombre.setBounds(5, 178, 150, 35);
        label_prime_apellido.setBounds(5, 215, 150, 35);
        label_segundo_apellido.setBounds(5, 252, 150, 35);
        label_direccion.setBounds(5, 289, 150, 35);
        label_telefono.setBounds(5, 326, 150, 35);
        label_email.setBounds(5, 363, 150, 35);
        label_password.setBounds(5, 400, 150, 35);
        label_estado.setBounds(5, 437, 150, 35);
        label_alert.setBounds(10, 472, 400, 25);
        
        //label_alert.setOpaque(true);
        //label_alert.setBackground(Color.RED);
        
        //Add labels
        //this.add(label_panel_title);
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
        this.add(label_alert);
    }//Fin de configurar etiquetas
    
    //configurarCampos()
    public void configurarCampos(){
        //Arreglos auxiliares
        String[] sedes_id = {"Seleccione","12345", "12346", "12347"};
        String[] roles = {"Seleccione","Administrador", "Gerente", "Operador"};
        String[] estados = {"Seleccione", "Activo", "Inactivo"};
        
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
        txt_id.setBounds(165, 30, 250, 35);
        comb_id_sede.setBounds(165, 67, 250, 35);
        comb_rol.setBounds(165, 104, 250, 35);
        txt_primer_nombre.setBounds(165, 141, 250, 35);
        txt_segundo_nombre.setBounds(165, 178, 250, 35);
        txt_primer_apellido.setBounds(165, 215, 250, 35);
        txt_segundo_appelido.setBounds(165, 252, 250, 35);
        txt_direccion.setBounds(165, 289, 250, 35);
        txt_telefono.setBounds(165, 326, 250, 35);
        txt_email.setBounds(165, 363, 250, 35);
        txt_password.setBounds(165, 400, 250, 35);
        comb_estado.setBounds(165, 437, 250, 35);
        
        //evntos
        ChangeListener changeListener = new ChangeListener();
        txt_id.addKeyListener(changeListener);
        comb_id_sede.addActionListener(this);
        comb_rol.addActionListener(this);
        txt_primer_nombre.addKeyListener(changeListener);
        txt_segundo_nombre.addKeyListener(changeListener);
        txt_primer_apellido.addKeyListener(changeListener);
        txt_segundo_appelido.addKeyListener(changeListener);
        txt_direccion.addKeyListener(changeListener);
        txt_telefono.addKeyListener(changeListener);
        txt_email.addKeyListener(changeListener);
        txt_password.addKeyListener(changeListener);
        comb_estado.addActionListener(this);
        
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
        
        btn_enviar.setBounds(165, 502, 120, 35);
        btn_cancelar.setBounds(295, 502, 120, 35);
        
        btn_enviar.addActionListener(this);
        btn_cancelar.addActionListener(this);
        
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
        int validar_campos = validarCampos();
        if(validar_campos == 0){
            setBordes(null, null);
            label_alert.setText("");
            int insertar_usurio;
            insertar_usurio = controladorEmpleado.insertarEmpleado(identificacion, id_sede, rol, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, direccion, telefono, email, password, estado);
            if(insertar_usurio >= 1){
                System.out.println("Insertado Correctamente");
                JOptionPane.showMessageDialog(null,"El Usuario "+primer_nombre+" ha sido creado correctamente");
            }else{
                setBordes(txt_id, null);
                label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[12]+"!!!</font></html>");
            }
        }else{
            switch (validar_campos){
                case 1: setBordes(txt_id, null);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[0]+"!!!</font></html>");
                        break;
                case 2: setBordes(null, comb_id_sede);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[1]+"!!!</font></html>");
                        break;
                case 3: setBordes(null, comb_rol);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[2]+"!!!</font></html>");
                        break;
                case 4: setBordes(txt_primer_nombre, null);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[3]+"!!!</font></html>");
                        break;
                case 5: setBordes(txt_segundo_nombre, null);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[4]+"!!!</font></html>");
                        break;
                case 6: setBordes(txt_primer_apellido, null);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[5]+"!!!</font></html>");
                        break;
                case 7: setBordes(txt_segundo_appelido, null);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[6]+"!!!</font></html>");
                        break;
                case 8: setBordes(txt_direccion, null);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[7]+"!!!</font></html>");
                        break;
                case 9: setBordes(txt_telefono, null);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[8]+"!!!</font></html>");
                        break;
                case 10: setBordes(txt_email, null);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[9]+"!!!</font></html>");
                         break;
                case 11: setBordes(txt_password, null);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[10]+"!!!</font></html>");
                         break;
                case 12: setBordes(null, comb_estado);
                        label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[11]+"!!!</font></html>");
                         break;
                default:
                         break;
                    
            }
        }
        
    }//Fin de crear usuario
    
    public int validarCampos(){
        String identificacion = txt_id.getText();
        int id_sede = comb_id_sede.getSelectedIndex();
        int  rol = comb_rol.getSelectedIndex();
        String primer_nombre = txt_primer_nombre.getText();
        String segundo_nombre = txt_segundo_nombre.getText();
        String primer_apellido = txt_primer_apellido.getText();
        String segundo_apellido = txt_segundo_appelido.getText();
        String direccion = txt_direccion.getText();
        String telefono = txt_telefono.getText();
        String email = txt_email.getText();
        String password = txt_password.getText();
        int estado = comb_estado.getSelectedIndex();
        if(identificacion.equals("") || !Pattern.matches("[0-9]+", identificacion)){
            return 1;
        }else if(id_sede == 0){
            return 2;
        }else if(rol == 0){
            return 3;
        }else if(primer_nombre.equals("") || !Pattern.matches("[a-zA-Z]+", primer_nombre)){
            System.err.println("acá");
            return 4;
        }else if(!Pattern.matches("[a-zA-Z]*", segundo_nombre)){
            return 5;
        }else if(!Pattern.matches("[a-zA-Z]+", primer_apellido)){
            return 6;
        }else if(!Pattern.matches("[a-zA-Z]*", segundo_apellido)){
            return 7;
        }else if(direccion.equals("") || direccion.contains("*") || direccion.contains("=") || direccion.toUpperCase().contains("SELECT") || 
                 direccion.toUpperCase().contains("INSERT") || direccion.toUpperCase().contains("DROP") || 
                 direccion.toUpperCase().contains("DELETE") ){
            return 8;
        
        }else if(telefono.equals("") || telefono.contains("*") || telefono.contains("=") || telefono.toUpperCase().contains("SELECT") || 
                 telefono.toUpperCase().contains("INSERT") || telefono.toUpperCase().contains("DROP") || 
                 telefono.toUpperCase().contains("DELETE")){
            return 9;
        }else if(!validarCaracteres(email, 10)){
            return  10;
        }else if(!validarCaracteres(password, 11)){
            return 11;
        }else if(estado == 0){
            return 12;
        }else{
            return 0;
        }
    }
    
    public void setBordes(JTextField campo, JComboBox select){
        label_alert.setText("");
        txt_id.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        comb_id_sede.setBorder(null);
        comb_rol.setBorder(null);
        txt_primer_nombre.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        txt_segundo_nombre.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        txt_primer_apellido.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        txt_segundo_appelido.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        txt_direccion.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        txt_telefono.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        txt_email.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        txt_password.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        comb_estado.setBorder(null);
        
        if(campo != null){
            campo.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }else if(select != null){
            select.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }
    
    public boolean validarCaracteres(String contenido_campo, int campo){
        if(campo == 10){
            String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            Pattern pattern = Pattern.compile(PATTERN_EMAIL);
            Matcher matcher = pattern.matcher(contenido_campo);
            return matcher.matches();
        }else if(campo == 11){
            String PATTERN_PASSWORD = "(^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*.{5,20})";
            Pattern pattern = Pattern.compile(PATTERN_PASSWORD);
            Matcher matcher = pattern.matcher(contenido_campo);
            return matcher.matches();
        }else{
            return false;
        }
    }

    //Metodos para manejar eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btn_cancelar)){
            this.setVisible(false);
        }else if(e.getSource().equals(btn_enviar)){
            crearUsuario();
        }else if(e.getSource().equals(txt_id) || e.getSource().equals(comb_id_sede) || e.getSource().equals(comb_rol) || e.getSource().equals(txt_primer_nombre)){
            setBordes(null, null);
        }
    }
    
    public class ChangeListener  implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            setBordes(null, null);
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
        
    }

      
}//Fin class TestPanelCreateUsuario
