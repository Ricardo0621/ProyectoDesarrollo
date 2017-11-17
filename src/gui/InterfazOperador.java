/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorAsistente;
import controladores.ControladorEvento;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diegoruiz
 */
public class InterfazOperador extends JFrame implements ActionListener{
    PanelBienvenido panelBienvenido;
    PanelCrearAsistente panelCrearAsistente;
    PanelListarAsistentes panelListarAsistentes;
    PanelBuscarFiltrarPagarRegistrar panelBuscarFiltrarPagarRegistrar;
    JButton btn_crear_asistente;
    JButton btn_modificar_asistente;
    JButton btn_listar_asistentes;
    JButton btn_registrar_asistente_evento;
    JButton btn_registrar_pago;
    JButton btn_listar_eventos;
    JButton btn_salir;
    
    public InterfazOperador(){
        panelCrearAsistente = new PanelCrearAsistente("none", null);
        panelListarAsistentes = new PanelListarAsistentes();
        panelBuscarFiltrarPagarRegistrar = new PanelBuscarFiltrarPagarRegistrar("");
        configurarUserPanel();
        configurarBotones();
        configurarPanelBienvenida();
    }
    
    private void configurarUserPanel() {
        this.setTitle("Panel de usuario");                      // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
    
    public void configurarBotones(){
        btn_crear_asistente = new JButton("Crear Asistente");
        btn_modificar_asistente = new JButton("Modificar Asistente");
        btn_listar_asistentes = new JButton("Listar Asistentes");
        btn_registrar_asistente_evento = new JButton("Asistente a evento");
        btn_registrar_pago = new JButton("Registrar Pago");
        btn_listar_eventos = new JButton("Listar Eventos");
        btn_salir = new JButton("Salir");
        
        btn_crear_asistente.setBounds(25, 20, 150, 60);
        btn_modificar_asistente.setBounds(25, 85, 150, 60);
        btn_listar_asistentes.setBounds(25, 150, 150, 60);
        btn_registrar_asistente_evento.setBounds(25, 215, 150, 60);
        btn_registrar_pago.setBounds(25, 280, 150, 60);
        btn_listar_eventos.setBounds(25, 345, 150, 60);
        btn_salir.setBounds(25, 410, 150, 60);
        
        btn_crear_asistente.addActionListener(this);
        btn_listar_asistentes.addActionListener(this);
        btn_modificar_asistente.addActionListener(this);
        btn_registrar_asistente_evento.addActionListener(this);
        btn_registrar_pago.addActionListener(this);
        btn_listar_eventos.addActionListener(this);
        btn_salir.addActionListener(this);
        
        this.add(btn_crear_asistente);
        this.add(btn_modificar_asistente);
        this.add(btn_listar_asistentes);
        this.add(btn_registrar_asistente_evento);
        this.add(btn_registrar_pago);
        this.add(btn_listar_eventos);
        this.add(btn_salir);
    }
    
    private void configurarPanelBienvenida(){
        panelBienvenido = new PanelBienvenido();
        panelBienvenido.setBounds(200, 10, 560, 550);
        this.add(panelBienvenido);
    }
    public void mostrarPanelAsistente(String accion, String[] datos_empleado, boolean visible){
        panelCrearAsistente = new PanelCrearAsistente(accion, datos_empleado);
        panelCrearAsistente.setBounds(200, 10, 560, 550);
        this.add(panelCrearAsistente);
        panelCrearAsistente.setVisible(visible);
    }
    public void mostrarPanelBuscarListar(String accion, boolean visible){
        panelBuscarFiltrarPagarRegistrar = new PanelBuscarFiltrarPagarRegistrar(accion);
        panelBuscarFiltrarPagarRegistrar.setBounds(200, 10, 560, 550);
        this.add(panelBuscarFiltrarPagarRegistrar);
        panelBuscarFiltrarPagarRegistrar.setVisible(visible);
    }
    public void mostrarPanelListar(int evento_id){
        panelListarAsistentes = new PanelListarAsistentes(evento_id);
        panelListarAsistentes.setBounds(200, 10, 560, 550);
        this.add(panelListarAsistentes);
        panelListarAsistentes.setVisible(true);
    }
    public void removerPaneles(){
        if(panelCrearAsistente != null){
            this.remove(panelCrearAsistente);
        }
        if(panelBienvenido != null){
            this.remove(panelBienvenido);
        }
        if(panelBuscarFiltrarPagarRegistrar != null){
            this.remove(panelBuscarFiltrarPagarRegistrar);
        }
        if(panelListarAsistentes != null){
            this.remove(panelListarAsistentes);
        }
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btn_crear_asistente)){
            removerPaneles();
            mostrarPanelAsistente("Crear Asistente", null, true);
            this.repaint();
        }else if(e.getSource().equals(btn_modificar_asistente)){
            removerPaneles();
            mostrarPanelBuscarListar("Modificar Asistente", true);
            this.repaint();
        }else if(e.getSource().equals(btn_listar_asistentes)){
            removerPaneles();
            mostrarPanelBuscarListar("Listar Asistentes", true);
            panelBuscarFiltrarPagarRegistrar.setComboBox();
            this.repaint();
        }else if(e.getSource().equals(btn_registrar_asistente_evento)){
            removerPaneles();
            mostrarPanelBuscarListar("Asistente a Evento", true);
            this.repaint();
        }else if(e.getSource().equals(btn_registrar_pago)){
            removerPaneles();
            mostrarPanelBuscarListar("Pago a Evento", true);
            this.repaint();
        }else if(e.getSource().equals(btn_listar_eventos)){
            removerPaneles();
            
            this.repaint();
        }
    }
    
    /**
     * InnerClase que contiene el panel de bienvenida para el usuario
     */
    private class PanelBienvenido extends JPanel{
        public PanelBienvenido(){
            setTitle("Bienvenido");                        // colocamos titulo a la ventana
            setSize(420, 550);                                 // colocamos tamanio a la ventana (ancho, alto)
            setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
            setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
            setResizable(false);                               // hacemos que la ventana no sea redimiensionable
            Border lowerEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            TitledBorder title = BorderFactory.createTitledBorder(lowerEtched, "Bienvenido");
            Font titleFont = UIManager.getFont("TitledBorder.font");
            title.setTitleFont( titleFont.deriveFont(Font.ITALIC + Font.BOLD, 20) );
            setBorder(title);
        }
        
    }
    
    /**
     * InnerClase que contiene un formulario para crear, visualizar y editar un usuario.
     */
    private class PanelCrearAsistente extends JPanel {
        //Fields
        JTextField txt_id;
        JTextField txt_primer_nombre;
        JTextField txt_segundo_nombre;
        JTextField txt_primer_apellido;
        JTextField txt_segundo_appelido;
        JTextField txt_direccion;
        JTextField txt_telefono;
        JTextField txt_email;

        //Labels
        JLabel label_id;
        JLabel label_primer_nombre;
        JLabel label_segundo_nombre;
        JLabel label_prime_apellido;
        JLabel label_segundo_apellido;
        JLabel label_direccion;
        JLabel label_telefono;
        JLabel label_email;
        JLabel label_alert;

        //JButtons
        JButton btn_cancelar;
        JButton btn_enviar;

        ChangeListener changeListener;
        Actionlistenr actionlistener;

        //Array Para alertas
        String[] alertas ={"Ingrese un número si caracteres especiales",  
                           "Ingrese El nombre sin caracteres especiales",
                           "No ingrese palabras reservas ni espacios", 
                           "Ingrese el apellido sin caracteres especiales", 
                           "", 
                           "Ingrese una dirección correcta", 
                           "Digite un número de teléfono correcto", 
                           "Debe indicar una dirección de correo válida",  
                           "Ya existe un usuario con esa identificación",
                           "No se pudo crear el usuario, verifique la base de datos"};

        //variables auxiliares
        String accion;
        String[] sedes_id;
        String[] sedes_idonly;

        public PanelCrearAsistente(String accion, String[] datos_usuario){
            setLayout(null);
            this.setSize(420, 550);
            this.accion = accion;
            Border lowerEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            TitledBorder title = BorderFactory.createTitledBorder(lowerEtched, this.accion);
            Font titleFont = UIManager.getFont("TitledBorder.font");
            title.setTitleFont( titleFont.deriveFont(Font.ITALIC + Font.BOLD, 20) );
            this.setBorder(title);
            changeListener = new ChangeListener();
            actionlistener = new Actionlistenr();
            configurarEtiquetas();
            configurarCampos();
            configurarBotones();
            if(datos_usuario == null){
            }else{
                completarCampos(datos_usuario);
            }
        }

        //ConfigurarEtiquetas()
        public void configurarEtiquetas(){
            //Declaración de etiquetas
            label_id = new JLabel("* Identificación: ", SwingConstants.RIGHT);
            label_primer_nombre = new JLabel("* Primer nombre: ", SwingConstants.RIGHT);
            label_segundo_nombre = new JLabel("  Segundo nombre: ", SwingConstants.RIGHT);
            label_prime_apellido = new JLabel("* Primer apellido: ", SwingConstants.RIGHT);
            label_segundo_apellido = new JLabel("  Segundo apellido: ", SwingConstants.RIGHT);
            label_direccion = new JLabel("* Dirección: ", SwingConstants.RIGHT);
            label_telefono = new JLabel("* Teléfono: ", SwingConstants.RIGHT);
            label_email = new JLabel("* email: ", SwingConstants.RIGHT);
            label_alert = new JLabel("<html><font color='red'></font></html>", SwingConstants.CENTER);

            //Ubicación de etiquetas
            label_id.setBounds(5, 70, 150, 35);
            label_primer_nombre.setBounds(5, 107, 150, 35);
            label_segundo_nombre.setBounds(5, 142, 150, 35);
            label_prime_apellido.setBounds(5, 179, 150, 35);
            label_segundo_apellido.setBounds(5, 216, 150, 35);
            label_direccion.setBounds(5, 253, 150, 35);
            label_telefono.setBounds(5, 290, 150, 35);
            label_email.setBounds(5, 327, 150, 35);
            label_alert.setBounds(10, 364, 450, 25);

            //Add labels
            add(label_id);
            add(label_primer_nombre);
            add(label_segundo_nombre);
            add(label_prime_apellido);
            add(label_segundo_apellido);
            add(label_direccion);
            add(label_telefono);
            add(label_email);
            add(label_alert);
        }//Fin de configurar etiquetas

        //configurarCampos()
        public void configurarCampos(){
            //Inicializar campos
            txt_id = new JTextField();
            txt_primer_nombre = new JTextField();
            txt_segundo_nombre = new JTextField();
            txt_primer_apellido = new JTextField();
            txt_segundo_appelido = new JTextField();
            txt_direccion = new JTextField();
            txt_telefono = new JTextField();
            txt_email = new JTextField();

            //Posicionar Campos
            txt_id.setBounds(165, 70, 300, 35);
            txt_primer_nombre.setBounds(165, 107, 300, 35);
            txt_segundo_nombre.setBounds(165, 142, 300, 35);
            txt_primer_apellido.setBounds(165, 179, 300, 35);
            txt_segundo_appelido.setBounds(165, 216, 300, 35);
            txt_direccion.setBounds(165, 253, 300, 35);
            txt_telefono.setBounds(165, 290, 300, 35);
            txt_email.setBounds(165, 327, 300, 35);

            //evntos
            txt_id.addKeyListener(changeListener);
            txt_primer_nombre.addKeyListener(changeListener);
            txt_segundo_nombre.addKeyListener(changeListener);
            txt_primer_apellido.addKeyListener(changeListener);
            txt_segundo_appelido.addKeyListener(changeListener);
            txt_direccion.addKeyListener(changeListener);
            txt_telefono.addKeyListener(changeListener);
            txt_email.addKeyListener(changeListener);

            //Add Campos
            add(txt_id);
            add(txt_primer_nombre);
            add(txt_segundo_nombre);
            add(txt_primer_apellido);
            add(txt_segundo_appelido);
            add(txt_direccion);
            add(txt_telefono);
            add(txt_email);
        }//Fin de configurar campos

        //Configurar botones
        public void configurarBotones(){
            btn_enviar = new JButton("Enviar");
            btn_cancelar = new JButton("Cancelar");

            btn_enviar.setBounds(165, 400, 145, 35);
            btn_cancelar.setBounds(320, 400, 145, 35);

            btn_enviar.addActionListener(actionlistener);
            btn_cancelar.addActionListener(actionlistener);

            this.add(btn_enviar);
            this.add(btn_cancelar);
        }//fin de configurar botones

        /**
         * Método para llenar el formulario para la modificación de un empleado.
         * @param datos_asistente 
         */
        public void completarCampos(String[] datos_asistente){
            txt_id.setText(datos_asistente[0]);
            txt_id.setEditable(false);
            txt_id.setEnabled(false);
            txt_primer_nombre.setText(datos_asistente[1]);
            txt_segundo_nombre.setText(datos_asistente[2]);
            txt_primer_apellido.setText(datos_asistente[3]);
            txt_segundo_appelido.setText(datos_asistente[4]);
            txt_direccion.setText(datos_asistente[5]);
            txt_telefono.setText(datos_asistente[6]);
            txt_email.setText(datos_asistente[7]);
        }

        //crear usuario
        public void crearAsistente(){
            ControladorAsistente controladorAsistente = new ControladorAsistente();
            String identificacion = txt_id.getText();
            String primer_nombre = txt_primer_nombre.getText();
            String segundo_nombre = txt_segundo_nombre.getText();
            String primer_apellido = txt_primer_apellido.getText();
            String segundo_apellido = txt_segundo_appelido.getText();
            String direccion = txt_direccion.getText();
            String telefono = txt_telefono.getText();
            String email = txt_email.getText();
            int validar_campos = validarCampos();
            if(validar_campos == 0){
                setBordes(null, null);
                label_alert.setText("");
                int insertar_modificar_asistente;
                String msg_confirmacion;
                if(accion.equals("Crear Asistente")){
                  insertar_modificar_asistente = controladorAsistente.insertarAsistente(identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, direccion, telefono, email);              
                  msg_confirmacion = "El Asistente "+primer_nombre+" ha sido creado correctamente";
                }else{
                   insertar_modificar_asistente = controladorAsistente.editarAsistente(identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, direccion, telefono, email);                             
                   msg_confirmacion = "El Asistente "+primer_nombre+" ha sido Actualizado correctamente";
                }
                if(insertar_modificar_asistente >= 1){
                    int res = JOptionPane.showOptionDialog(null, msg_confirmacion, "Test", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    if( res == 0 || res == -1){
                        this.setVisible(false);
                        removerPaneles();
                        configurarPanelBienvenida();
                    }
                }else{
                    setBordes(txt_id, null);
                    label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[12]+"!!!</font></html>");
                }
            }else{
                switch (validar_campos){
                    case 1: setBordes(txt_id, null);
                            label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[0]+"!!!</font></html>");
                            break;
                    case 2: setBordes(txt_primer_nombre, null);
                            label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[1]+"!!!</font></html>");
                            break;
                    case 3: setBordes(txt_segundo_nombre, null);
                            label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[2]+"!!!</font></html>");
                            break;
                    case 4: setBordes(txt_primer_apellido, null);
                            label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[3]+"!!!</font></html>");
                            break;
                    case 5: setBordes(txt_segundo_appelido, null);
                            label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[4]+"!!!</font></html>");
                            break;
                    case 6: setBordes(txt_direccion, null);
                            label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[5]+"!!!</font></html>");
                            break;
                    case 7: setBordes(txt_telefono, null);
                            label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[6]+"!!!</font></html>");
                            break;
                    case 8: setBordes(txt_email, null);
                            label_alert.setText("<html><font color='red' size='4'>!!!"+alertas[7]+"!!!</font></html>");
                             break;
                    default:
                             break;
                }
            }

        }//Fin de crear usuario

        public int validarCampos(){
            String identificacion = txt_id.getText();
            String primer_nombre = txt_primer_nombre.getText();
            String segundo_nombre = txt_segundo_nombre.getText();
            String primer_apellido = txt_primer_apellido.getText();
            String segundo_apellido = txt_segundo_appelido.getText();
            String direccion = txt_direccion.getText();
            String telefono = txt_telefono.getText();
            String email = txt_email.getText();
            if(identificacion.equals("") || !Pattern.matches("[0-9]+", identificacion)){
                return 1;
            }else if(primer_nombre.equals("") || !Pattern.matches("[a-zA-Z]+", primer_nombre)){
                return 2;
            }else if(!Pattern.matches("[a-zA-Z]*", segundo_nombre)){
                return 3;
            }else if(!Pattern.matches("[a-zA-Z]+", primer_apellido)){
                return 4;
            }else if(!Pattern.matches("[a-zA-Z]*", segundo_apellido)){
                return 5;
            }else if(direccion.equals("") || direccion.contains("*") || direccion.contains("=") || direccion.toUpperCase().contains("SELECT") || 
                     direccion.toUpperCase().contains("INSERT") || direccion.toUpperCase().contains("DROP") || 
                     direccion.toUpperCase().contains("DELETE") ){
                return 6;

            }else if(telefono.equals("") || telefono.contains("*") || telefono.contains("=") || telefono.toUpperCase().contains("SELECT") || 
                     telefono.toUpperCase().contains("INSERT") || telefono.toUpperCase().contains("DROP") || 
                     telefono.toUpperCase().contains("DELETE")){
                return 7;
            }else if(!validarCaracteres(email, 8)){
                return  8;
            }else{
                return 0;
            }
        }

        public void setBordes(JTextField campo, JComboBox select){
            label_alert.setText("");
            txt_id.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            txt_primer_nombre.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            txt_segundo_nombre.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            txt_primer_apellido.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            txt_segundo_appelido.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            txt_direccion.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            txt_telefono.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            txt_email.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

            if(campo != null){
                campo.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                campo.requestFocus();
            }else if(select != null){
                select.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            }
        }

        public boolean validarCaracteres(String contenido_campo, int campo){
            if(campo == 8){
                String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                Pattern pattern = Pattern.compile(PATTERN_EMAIL);
                Matcher matcher = pattern.matcher(contenido_campo);
                return matcher.matches();
            }else{
                return false;
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
        public class Actionlistenr implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource().equals(btn_cancelar)){
                    setVisible(false);
                    removerPaneles();
                    configurarPanelBienvenida();
                    }else if(e.getSource().equals(btn_enviar)){
                        crearAsistente();
                    }
                }  
        }
    }//Fin class TestPanelCreateUsuario 
    
    /**
     * InnerClase que contiene el panel con el formulario para buscar un asistente
     */
    private class PanelBuscarFiltrarPagarRegistrar extends JPanel{
        JLabel label_buscar;
        JLabel label_alerta;
        JTextField txt_buscar;
        JButton btn_buscar;
        JButton btn_cancelar;
        String id_asistente;
        Keylistener keylistener; //Objeto para menjar evento de teclado en este panel
        Actionlistener actionlistener; //Objeto para menjar evento de mouse en este panel
        String accion;
        
        /*
            Para filtrar listado de usurios 
        */
        JLabel label_eventos_id;
        JComboBox comb_eventos_id;

        public PanelBuscarFiltrarPagarRegistrar(String accion) {
            setTitle(accion);                        // colocamos titulo a la ventana
            setSize(420, 550);                                 // colocamos tamanio a la ventana (ancho, alto)
            setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
            setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
            setResizable(false);                               // hacemos que la ventana no sea redimiensionable
            Border lowerEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            TitledBorder title = BorderFactory.createTitledBorder(lowerEtched, accion);
            Font titleFont = UIManager.getFont("TitledBorder.font");
            title.setTitleFont( titleFont.deriveFont(Font.ITALIC + Font.BOLD, 20) );
            setBorder(title);
            this.accion = accion;
            if(accion.equals("Listar Asistentes")){
                configurarComponentesFiltrar();
            }else if(accion.equals("Modificar Asistente")){
                configurarComponentesModificar();
            }else if(accion.equals("Asistente a Evento")){
                configurarComponentesAsistenteEvento();
            }else if(accion.equals("Pago a Evento")){
                
            }
        }
        
        public void configurarComponentesModificar(){
            label_alerta = new JLabel("<html><font color='red'></font></html>", SwingConstants.CENTER);
            label_buscar = new JLabel("Identificación: ");
            txt_buscar = new JTextField();
            btn_buscar = new JButton("Buscar");
            btn_cancelar = new JButton("Cancelar");
            keylistener = new Keylistener();
            actionlistener = new Actionlistener();
            
            label_buscar.setBounds(10, 50, 100, 35);
            txt_buscar.setBounds(125, 50, 300, 35);
            btn_buscar.setBounds(125, 90, 145, 35);
            btn_cancelar.setBounds(280, 90, 145, 35);
            label_alerta.setBounds(10, 130, 400, 32);
            txt_buscar.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            
            btn_buscar.addActionListener(actionlistener);
            btn_cancelar.addActionListener(actionlistener);
            txt_buscar.addKeyListener(keylistener);
            
            add(label_buscar);
            add(label_alerta);
            add(txt_buscar);
            add(btn_buscar);
            add(btn_cancelar);
        }
        
        public void configurarComponentesFiltrar(){
            label_alerta = new JLabel("<html><font color='red'></font></html>", SwingConstants.CENTER);
            label_eventos_id = new JLabel("Evento: ", SwingConstants.RIGHT);
            comb_eventos_id = new JComboBox();
            btn_buscar = new JButton("Buscar");
            btn_cancelar = new JButton("Cancelar");
            keylistener = new Keylistener();
            actionlistener = new Actionlistener();
            
            label_eventos_id.setBounds(10, 50, 100, 35);
            comb_eventos_id.setBounds(125, 50, 300, 35);
            btn_buscar.setBounds(125, 87, 145, 35);
            btn_cancelar.setBounds(280, 87, 145, 35);
            label_alerta.setBounds(10, 135, 400, 32);
            
            comb_eventos_id.addActionListener(actionlistener);
            btn_buscar.addActionListener(actionlistener);
            btn_cancelar.addActionListener(actionlistener);
            
            add(label_alerta);
            add(label_eventos_id);
            add(comb_eventos_id);
            add(btn_buscar);
            add(btn_cancelar);
        }
        
        public void configurarComponentesAsistenteEvento(){
            label_alerta = new JLabel("<html><font color='red'></font></html>", SwingConstants.CENTER);
            label_buscar = new JLabel("Identificación: ");
            txt_buscar = new JTextField();
            btn_buscar = new JButton("Buscar");
            btn_cancelar = new JButton("Cancelar");
            keylistener = new Keylistener();
            actionlistener = new Actionlistener();
            
            label_buscar.setBounds(10, 50, 100, 35);
            txt_buscar.setBounds(125, 50, 300, 35);
            btn_buscar.setBounds(125, 90, 145, 35);
            btn_cancelar.setBounds(280, 90, 145, 35);
            label_alerta.setBounds(10, 130, 400, 32);
            txt_buscar.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            
            btn_buscar.addActionListener(actionlistener);
            btn_cancelar.addActionListener(actionlistener);
            txt_buscar.addKeyListener(keylistener);
            
            add(label_buscar);
            add(label_alerta);
            add(txt_buscar);
            add(btn_buscar);
            add(btn_cancelar);
        }
        
        public void setComboBox(){
            ControladorEvento controladorEvento = new ControladorEvento();
            String[] eventos_id = controladorEvento.listarIdNombreEventos();
            
            comb_eventos_id.addItem("Seleccione");
            comb_eventos_id.addItem("Todos");
            
            for(int i=0; i<eventos_id.length; i++){
                comb_eventos_id.addItem(eventos_id[i]);
            }
            comb_eventos_id.setSelectedIndex(0);
        }
        
        public void buscarAsistente(String id_asistente){
            if(accion.equals("Modificar Asistente")){
                ControladorAsistente controladorAsistente = new ControladorAsistente();
                if(controladorAsistente.consultarAsistente(id_asistente)){
                    removerPaneles();
                    String[] datos_asistente = controladorAsistente.extraerAsistente(id_asistente);
                    mostrarPanelAsistente(accion, datos_asistente,true);
                    this.repaint();
                }else{
                    txt_buscar.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    label_alerta.setText("<html><font color='red' size='4'>!!! No Existe el asistente con esa identificación!!!</font></html>");
                    txt_buscar.requestFocus();
                }
            }else if(accion.equals("Asistente a Evento")){
                ControladorAsistente controladorAsistente = new ControladorAsistente();
                if(controladorAsistente.consultarAsistente(id_asistente)){
                    //removerPaneles();
                    //String[] datos_asistente = controladorAsistente.extraerAsistente(id_asistente);
                    //mostrarPanelAsistente(accion, datos_asistente,true);
                    //this.repaint();
                }else{
                    txt_buscar.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    label_alerta.setText("<html><font color='red' size='4'>!!! No Existe el asistente con esa identificación!!!</font></html>");
                    txt_buscar.requestFocus();
                }
            }
        }
        
        public boolean buscarFiltrarAsistentes(){
            if(accion.equals("Listar Asistentes")){
                String[] alertas = {"Debe seleccionar una opción en el campo Evento"};
                if(comb_eventos_id.getSelectedIndex() != 0 ){
                    return true;
                }else{
                    if(comb_eventos_id.getSelectedIndex() == 0){
                        comb_eventos_id.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                        label_alerta.setText("<html><font color='red' size='4'>!!!"+alertas[0]+"!!!</font></html>");
                        txt_buscar.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                        txt_buscar.requestFocus();
                        return false;
                    }
                }
            }else if(accion.equals("Asistente a Evento")){
                id_asistente = txt_buscar.getText();
                if(id_asistente.equals("") || !Pattern.matches("[0-9]+", id_asistente)){
                    txt_buscar.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    label_alerta.setText("<html><font color='red' size='4'>!!! Ingrese un número de identificación Correcto !!!</font></html>");
                    txt_buscar.requestFocus();
                    return false;
                }else{
                    buscarAsistente(id_asistente);
                    return true;
                }
            }else if(accion.equals("Modificar Asistente")){
                id_asistente = txt_buscar.getText();
                if(id_asistente.equals("") || !Pattern.matches("[0-9]+", id_asistente)){
                    txt_buscar.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    label_alerta.setText("<html><font color='red' size='4'>!!! Ingrese un número de identificación Correcto !!!</font></html>");
                    txt_buscar.requestFocus();
                    return false;
                }else{
                    buscarAsistente(id_asistente);
                    return true;
                }
            }
            return false;
        }
        
        public void modificarPanelRegistro(){
            
        }
        
        /*Clase exclusiva para manejar eventos del teclado en este panel*/
        public class Keylistener implements KeyListener{

            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getSource().equals(txt_buscar)){
                    label_alerta.setText("");
                    txt_buscar.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        
        }//Fin de clase keyListener
        
        /*Clase exclusiva para manejar eventos del mouse en este panel*/
        public class Actionlistener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource().equals(btn_buscar)){
                    if(buscarFiltrarAsistentes()){
                        if(accion.equals("Modificar Asistente") || accion.equals("Asistente a Evento")){
                            buscarAsistente(txt_buscar.getText());
                        }else if(accion.equals("Listar Asistentes")){
                            removerPaneles();
                            if(comb_eventos_id.getSelectedIndex() == 1){
                                mostrarPanelListar(0); //Para indicar todos los eventos
                            }else{
                                mostrarPanelListar(Integer.parseInt(comb_eventos_id.getSelectedItem().toString().split(" - ")[0]));                                                  
                            }
                        }
                    }
                }else if(e.getSource().equals(btn_cancelar)){
                    setVisible(false);
                    removerPaneles();
                    configurarPanelBienvenida();
                }else if(e.getSource().equals(comb_eventos_id)){
                    label_alerta.setText("");
                    comb_eventos_id.setBorder(null);
                }
            }
        
        }
    }//Fin PanelBuscarFiltrar
    
    
    /**
     * InnerClass que muestra el listado de asistentes que asisten a los eventos o alguno en específico
     */
    public class PanelListarAsistentes extends JPanel{
        JTable tabla;
        JScrollPane sp_tabla;
        DefaultTableModel dtm;
        ControladorAsistente controladorAsistente;
        ControladorEvento controladorEvento;
        public PanelListarAsistentes(){
            
        }
        public PanelListarAsistentes(int evento_id){
            setTitle("Listar Asistentes");                        // colocamos titulo a la ventana
            setSize(420, 550);                                 // colocamos tamanio a la ventana (ancho, alto)
            setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
            setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
            setResizable(false);                               // hacemos que la ventana no sea redimiensionable
            Border lowerEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            TitledBorder title = BorderFactory.createTitledBorder(lowerEtched, "Lista de Asistentes");
            Font titleFont = UIManager.getFont("TitledBorder.font");
            title.setTitleFont( titleFont.deriveFont(Font.ITALIC + Font.BOLD, 20) );
            setBorder(title); 
            configurarLLenarTabla(evento_id);
        }
        
        public void configurarLLenarTabla(int evento_id){
            String[] titulo = new String[]{"Id", "Nombre", "telefono", "correo", "Evento"};
            controladorEvento = new ControladorEvento();
            String[] ids = controladorEvento.listarIdsEvento(evento_id);
            controladorAsistente = new ControladorAsistente();
            String[] asistentes = controladorAsistente.listarAsistentes(ids);
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(titulo);
            for(int i=0; i<asistentes.length; i++){
                String[] fila = asistentes[i].split(";;;");
                String[] temp = {fila[0], fila[1]+" "+fila[2]+" "+fila[3]+" "+fila[4], fila[6], fila[7], String.valueOf(evento_id)};
                dtm.addRow(temp);
            }
             
            tabla = new JTable(dtm);
            sp_tabla = new JScrollPane(tabla);
            
            
            sp_tabla.setBounds(10, 30, 540, 510);
            
            add(sp_tabla);
        }
    }//Fin panel listar usuarios
    
    
}
