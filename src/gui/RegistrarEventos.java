/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorEvento;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class RegistrarEventos extends JFrame {

    private String identificacion;
    private String id_empleado;
    private String nombre;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_creacion;
    private String fecha_fin;
    private String horario;
    private String horas;
    private String valor;
    private String lugar;
    private String cupos;
    private String estado;
    ControladorEvento ControladorEvento = new ControladorEvento();

    /**
     * Creates new form RegistrarSedes
     */
    public RegistrarEventos() {
        initComponents();
        this.setTitle("Registrar Evento");                      // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);             
        setResizable(false);
       this.getContentPane().setBackground(new java.awt.Color (35,47,65));
        
       //Label Titulo
        jLabel1.setBounds (240,0, 236,20);
        jLabel1.setFont(new java.awt.Font("Arial 18 Plain",Font.PLAIN, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        
        jLabel2.setBounds (240,85,130,20);
        jLabel2.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel3.setBounds (240,110,115,20);
        jLabel3.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel4.setBounds (240,135 ,115,20);
        jLabel4.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel5.setBounds (240,160,115,20);
        jLabel5.setFont(new java.awt.Font("Arial 18 Plain",Font.PLAIN, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel6.setBounds(240,185,140,20);
        jLabel6.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel7.setBounds (240,210,140,20);
        jLabel7.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel8.setBounds (240,235,115,20);
        jLabel8.setFont(new java.awt.Font("Arial 18 Plain",Font.PLAIN, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
         jLabel9.setBounds (240,260,115,20);;
        jLabel9.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
         jLabel10.setBounds (240,285,115,20);
        jLabel10.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel11.setBounds (240,310,115,20);
        jLabel11.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel12.setBounds (240,335,115,20);
        jLabel12.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
       jLabel13.setBounds (240,360,115,20);
        jLabel13.setFont(new java.awt.Font("Arial 18 Plain",Font.PLAIN, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel14.setBounds (240,385,115,20);;
        jLabel14.setFont(new java.awt.Font("Arial 18 Plain", Font.PLAIN, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //LABEL ABC 
        javax.swing.JLabel jLabelABC = new javax.swing.JLabel();
        jLabelABC.setBounds (20,0, 236,99);
        jLabelABC.setFont(new java.awt.Font("Purisa", 1, 50)); // NOI18N
        jLabelABC.setForeground(new java.awt.Color(254, 254, 254));
        jLabelABC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelABC.setText("A.B.C.");
        
        //PANEL AZUL CLARO
        javax.swing.JPanel  jPanelAzulClaro = new javax.swing.JPanel();
        jPanelAzulClaro.setBounds(0,0,240,800) ;
        jPanelAzulClaro.setBackground(new java.awt.Color(97, 212, 195));
        jPanelAzulClaro.add(jLabelABC); 
        this.getContentPane().add(jPanelAzulClaro); 
        
     
        jTextFieldIdentificacion.setBounds(450,85,115,20 );
        jTextFieldIdEmpleado.setBounds(450,110, 115,20); 
        jTextFieldNombre.setBounds(450,135,115,20);
        jTextFieldDescripcion.setBounds(450,160,115,20);
        jTextFieldFechaCreacion.setBounds(450,185,115,20);
        jDateFechaInicio.setBounds(450,210,115,20); 
        jDateFechaFin.setBounds(450,235, 115,20); 
        jTextFieldHorario.setBounds(450,260,115,20); 
        jTextFieldHoras.setBounds(450,285,115,20); 
        jTextFieldValor.setBounds(450,310,115,20);
        jTextFieldLugar.setBounds(450,335,115,20); 
        jTextFieldCupos.setBounds(450,360,115,20);
        jComboBoxEstado.setBounds(450,385,115,20);
        jRadioRegistrar.setBounds(575,80,120,20);
        jRadioModificar.setBounds(575,105,120,20); 
         jButtonOk.setBounds(450, 410,100, 20);
        jButtonCancel.setBounds(560, 410,100, 20);
        jButtonBuscar.setBounds(670, 410,100, 20);
       // jButtonCancel(450,);
        iniciarComponentes();
        iniciarFecha();
        limpiarCampos();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        cerrar();
    }

    public final void cerrar() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                JFrame frame = (JFrame) e.getSource();
                int opcion = JOptionPane.showConfirmDialog(frame, "¿Desea volver al paner del Gerente'?", "Salir", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_NO_OPTION) {
                    InterfazGerente io = new InterfazGerente();
                    io.setVisible(true);
                    frame.dispose();
                } else if (opcion == JOptionPane.NO_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jTextFieldIdEmpleado = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldFechaCreacion = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jRadioRegistrar = new javax.swing.JRadioButton();
        jRadioModificar = new javax.swing.JRadioButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldHorario = new javax.swing.JTextField();
        jTextFieldHoras = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldLugar = new javax.swing.JTextField();
        jTextFieldCupos = new javax.swing.JTextField();
        jDateFechaInicio = new com.toedter.calendar.JDateChooser();
        jDateFechaFin = new com.toedter.calendar.JDateChooser();
        jComboBoxEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrar Eventos");

        jLabel2.setText("Identificacion");

        jLabel3.setText("Id empleado");

        jLabel4.setText("Nombre");

        jLabel5.setText("Descripcion");

        jLabel6.setText("Fecha Creacion");

        jLabel7.setText("Fecha Inicio");

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jRadioRegistrar.setText("Registrar");
        jRadioRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRegistrarActionPerformed(evt);
            }
        });

        jRadioModificar.setText("Modificar");
        jRadioModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioModificarActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha Fin");

        jLabel9.setText("Horario");

        jLabel10.setText("Horas");

        jTextFieldHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHorasActionPerformed(evt);
            }
        });

        jLabel11.setText("Valor");

        jLabel12.setText("Lugar");

        jLabel13.setText("Cupos");

        jLabel14.setText("Estado");

        jTextFieldLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLugarActionPerformed(evt);
            }
        });

        jTextFieldCupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCuposActionPerformed(evt);
            }
        });

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", "Ocupado" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addComponent(jLabel13))
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldIdEmpleado)
                            .addComponent(jTextFieldIdentificacion)
                            .addComponent(jTextFieldDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonOk)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBuscar))
                            .addComponent(jTextFieldFechaCreacion)
                            .addComponent(jTextFieldHorario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldValor)
                            .addComponent(jTextFieldLugar)
                            .addComponent(jTextFieldCupos)
                            .addComponent(jTextFieldHoras)
                            .addComponent(jDateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioRegistrar)
                    .addComponent(jRadioModificar))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jRadioRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioModificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jDateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jDateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldCupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonBuscar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public final void iniciarComponentes() {
        identificacion = "";
        id_empleado = "";
        nombre = "";
        descripcion = "";
        fecha_inicio = "";
        fecha_creacion = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        fecha_fin = "";
        horario = "";
        horas = "";
        valor = "";
        lugar = "";
        cupos = "";
        estado = "";
        jButtonBuscar.setEnabled(false);
        jTextFieldFechaCreacion.setEnabled(false);
    }

    public final void iniciarFecha() {
        jDateFechaInicio.setDateFormatString("yyyy-MM-dd");
        jDateFechaFin.setDateFormatString("yyyy-MM-dd");
    }

    public final void limpiarCampos() {
        jTextFieldIdentificacion.setText("");
        jTextFieldIdEmpleado.setText("");
        jTextFieldNombre.setText("");
        jTextFieldDescripcion.setText("");
        jTextFieldFechaCreacion.setText(fecha_creacion);
        jTextFieldHorario.setText("");
        jTextFieldHoras.setText("");
        jTextFieldValor.setText("");
        jTextFieldLugar.setText("");
        jTextFieldCupos.setText("");
        jDateFechaInicio.setDate(null);
        jDateFechaFin.setDate(null);
        jComboBoxEstado.setSelectedItem(null);
    }

    public void tomarCampos() {
        identificacion = jTextFieldIdentificacion.getText();
        id_empleado = jTextFieldIdEmpleado.getText();
        nombre = jTextFieldNombre.getText();
        descripcion = jTextFieldDescripcion.getText();
        fecha_inicio = new SimpleDateFormat("yyyy-MM-dd").format(jDateFechaInicio.getDate());
        fecha_fin = new SimpleDateFormat("yyyy-MM-dd").format(jDateFechaFin.getDate());
        fecha_creacion = jTextFieldFechaCreacion.getText();
        horario = jTextFieldHorario.getText();
        horas = jTextFieldHoras.getText();
        valor = jTextFieldValor.getText();
        lugar = jTextFieldLugar.getText();
        cupos = jTextFieldCupos.getText();
        estado = getEstado();
    }

    public int validarCampos() {
        identificacion = jTextFieldIdentificacion.getText();
        id_empleado = jTextFieldIdEmpleado.getText();
        nombre = jTextFieldNombre.getText();
        descripcion = jTextFieldDescripcion.getText();
        fecha_creacion = jTextFieldFechaCreacion.getText();
        fecha_inicio = new SimpleDateFormat("yyyy-MM-dd").format(jDateFechaInicio.getDate());
        fecha_fin = new SimpleDateFormat("yyyy-MM-dd").format(jDateFechaFin.getDate());
        horario = jTextFieldHorario.getText();
        horas = jTextFieldHoras.getText();
        valor = jTextFieldValor.getText();
        lugar = jTextFieldLugar.getText();
        cupos = jTextFieldCupos.getText();
        if (identificacion.isEmpty()) {
            return 7;
        } else if (!Pattern.matches("[0-9]+", identificacion)) {
            return 1;
        } else if (id_empleado.isEmpty()) {
            return 7;
        } else if (!Pattern.matches("[0-9]+", id_empleado)) {
            return 2;
        } else if (nombre.isEmpty()) {
            return 7;
        } else if (!Pattern.matches("[a-zA-Z ]+", nombre)) {
            return 3;
        } else if (descripcion.isEmpty()) {
            return 7;
        } else if (!Pattern.matches("[a-zA-Z ]+", descripcion)) {
            return 4;
        } else if (fecha_creacion.isEmpty()) {
            return 7;
        } else if (!fecha_creacion.contains("-")) {
            return 5;
        } else if (fecha_inicio.isEmpty()) {
            return 7;
        } else if (!fecha_inicio.contains("-")) {
            return 6;
        } else if (fecha_fin.isEmpty()) {
            return 7;
        } else if (!fecha_fin.contains("-")) {
            return 8;
        } else if (horario.isEmpty()) {
            return 7;
        } else if (!horario.contains("-") || !horario.contains(":")) {
            return 9;
        } else if (horas.isEmpty()) {
            return 7;
        } else if (!Pattern.matches("[0-9]+", horas)) {
            return 10;
        } else if (valor.isEmpty()) {
            return 7;
        } else if (!Pattern.matches("[0-9]+", valor)) {
            return 11;
        } else if (lugar.isEmpty()) {
            return 7;
        } else if (!Pattern.matches("[a-zA-Z0-9 ]+", lugar)) {
            return 12;
        } else if (cupos.isEmpty()) {
            return 7;
        } else if (!Pattern.matches("[0-9]+", cupos)) {
            return 13;
        }

        return 0;
    }

    public void habilitarBotones() {
        jRadioModificar.setEnabled(true);
        jRadioRegistrar.setEnabled(true);
        jButtonBuscar.setEnabled(true);
        jButtonCancel.setEnabled(true);
        jButtonOk.setEnabled(true);
        jTextFieldDescripcion.setEditable(true);
        jTextFieldFechaCreacion.setEditable(true);
        jTextFieldIdEmpleado.setEditable(true);
        jTextFieldIdentificacion.setEditable(true);
        jTextFieldNombre.setEditable(true);
        jRadioModificar.setSelected(false);
        jRadioRegistrar.setSelected(false);
        jDateFechaFin.setEnabled(true);
        jDateFechaInicio.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
    }
    private void jRadioRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRegistrarActionPerformed
        // TODO add your handling code here:
        jRadioModificar.setEnabled(false);
    }//GEN-LAST:event_jRadioRegistrarActionPerformed

    private void mostrarMensajesValidaciones(int numero) {
        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "El campo identifiacion sólo debe contener números");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El campo id empleado sólo debe contener números");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El campo nombre sólo debe contener letras");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "La descripcion no permite numeros o caracteres especiales");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "La fecha de creación no permite letras o caracteres especiales");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "La fecha de inicio no permite letras o caracteres especiales");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "La fecha de fin no permite letras o caracteres especiales");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "El campo horario no permite letras o caracteres especiales");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "El campo horas sólo permite números");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "El campo valor sólo permite números");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "El campo lugar no permite caracteres especiales");
                break;
            case 13:
                JOptionPane.showMessageDialog(null, "El campo cupos sólo permite números");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Éxito");
                limpiarCampos();
                break;
            default:
                break;
        }
    }
    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        // TODO add your handling code here:
        if (jRadioRegistrar.isSelected()) {
            tomarCampos();
            int respuesta = validarCampos();
            mostrarMensajesValidaciones(respuesta);
            if (respuesta == 0) {
                ControladorEvento.registrarEvento(id_empleado, identificacion, nombre, descripcion, fecha_creacion, fecha_inicio, fecha_fin, horario, horas, valor, lugar, cupos, estado);
                limpiarCampos();
                habilitarBotones();
            }
        }
        if (jRadioModificar.isSelected()) {
            tomarCampos();
            int respuesta = validarCampos();
            mostrarMensajesValidaciones(respuesta);
            if (respuesta == 0) {
                ControladorEvento.editarEvento(id_empleado, identificacion, nombre, descripcion, fecha_creacion, fecha_inicio, fecha_fin, horario, horas, valor, lugar, cupos, estado);
                limpiarCampos();
                habilitarBotones();
            }
        }
    }//GEN-LAST:event_jButtonOkActionPerformed

    /*private void validarBeta()
    {
        ControladorEvento controlador = new ControladorEvento() ;
        controlador.validarDatosModif(identificacion, id_empleado, nombre, descripcion, fecha_inicio, fecha_creacion);
    }*/
    private void eventosModificar() {
        jRadioRegistrar.setEnabled(false);
        jRadioRegistrar.setSelected(false);
        jButtonOk.setEnabled(false);
        jButtonCancel.setEnabled(true);
        jButtonBuscar.setEnabled(true);
        jTextFieldIdEmpleado.setEditable(false);
        jTextFieldNombre.setEditable(false);
        jTextFieldDescripcion.setEditable(false);
        jTextFieldFechaCreacion.setEditable(false);
        jDateFechaInicio.setEnabled(false);
        jDateFechaFin.setEnabled(false);
        jTextFieldHorario.setEditable(false);
        jTextFieldHoras.setEditable(false);
        jTextFieldValor.setEditable(false);
        jTextFieldLugar.setEditable(false);
        jTextFieldCupos.setEditable(false);
        jComboBoxEstado.setEnabled(false);
    }

    private void eventosBuscar() {
        jTextFieldIdentificacion.setEditable(false);
        jTextFieldIdEmpleado.setEditable(true);
        jTextFieldNombre.setEditable(true);
        jTextFieldDescripcion.setEditable(true);
        jDateFechaInicio.setEnabled(true);
        jDateFechaFin.setEnabled(true);
        jButtonBuscar.setEnabled(false);
        jButtonOk.setEnabled(true);
        jTextFieldFechaCreacion.setEditable(true);
        jComboBoxEstado.setEnabled(true);
        jTextFieldHorario.setEditable(true);
        jTextFieldHoras.setEditable(true);
        jTextFieldValor.setEditable(true);
        jTextFieldLugar.setEditable(true);
        jTextFieldCupos.setEditable(true);
    }

    private void jRadioModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioModificarActionPerformed
        // TODO add your handling code here:
        eventosModificar();
    }//GEN-LAST:event_jRadioModificarActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        iniciarComponentes();
        limpiarCampos();
        habilitarBotones();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    public void retornarDatosEventos() {
        String[] datos = ControladorEvento.extraerEvento(identificacion);
        jTextFieldIdentificacion.setText(datos[0]);
        jTextFieldIdEmpleado.setText(datos[1]);
        jTextFieldNombre.setText(datos[2]);
        jTextFieldDescripcion.setText(datos[3]);
        jTextFieldFechaCreacion.setText(datos[4]);
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(datos[5]);
            date2 = new SimpleDateFormat("yyyy-MM-dd").parse(datos[6]);
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDateFechaInicio.setDate(date1);
        jDateFechaFin.setDate(date2);
        jTextFieldHorario.setText(datos[7]);
        jTextFieldHoras.setText(datos[8]);
        jTextFieldValor.setText(datos[9]);
        jTextFieldLugar.setText(datos[10]);
        jTextFieldCupos.setText(datos[11]);
        jComboBoxEstado.setSelectedItem(datos[12]);
    }

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        identificacion = jTextFieldIdentificacion.getText();
        if (ControladorEvento.consultarEvento(identificacion)) {
            retornarDatosEventos();
            eventosBuscar();

        } else {
            JOptionPane.showMessageDialog(null, "No existe");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private String getEstado() {
        String temp = "";
        switch (jComboBoxEstado.getSelectedIndex()) {
            case 0:
                temp = "Activo";
                break;
            case 1:
                temp = "Inactivo";
                break;
            default:
                temp = "Ocupado";
                break;
        }
        return temp;
    }

    private void jTextFieldHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHorasActionPerformed

    private void jTextFieldLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLugarActionPerformed

    private void jTextFieldCuposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCuposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCuposActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
        getEstado();
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private com.toedter.calendar.JDateChooser jDateFechaFin;
    private com.toedter.calendar.JDateChooser jDateFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioModificar;
    private javax.swing.JRadioButton jRadioRegistrar;
    private javax.swing.JTextField jTextFieldCupos;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldFechaCreacion;
    private javax.swing.JTextField jTextFieldHorario;
    private javax.swing.JTextField jTextFieldHoras;
    private javax.swing.JTextField jTextFieldIdEmpleado;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
