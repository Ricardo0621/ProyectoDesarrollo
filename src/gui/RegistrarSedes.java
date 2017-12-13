/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorSede;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class RegistrarSedes extends JFrame {

    private String identificacion;
    private String id_empleado;
    private String nombre;
    private String direccion;
    private String telefono;
    private String fecha_creacion;
    ControladorSede ControladorSede = new ControladorSede();

    public RegistrarSedes() {
        initComponents();
        this.setTitle("Registrar Sedes");                      // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);
        setResizable(false);
        this.getContentPane().setBackground(new java.awt.Color (35,47,65));
        
        
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
    
        
        
        jTextFieldIdentificacion.setBounds(450,85,115,20 );
        jTextFieldIdEmpleado.setBounds(450,110, 115,20); 
        jTextFieldNombre.setBounds(450,135,115,20);
        jTextFieldDireccion.setBounds(450,160,115,20);
        jTextFieldTelefono.setBounds(450,185,115,20);
        jTextFieldFechaCreacion.setBounds(450,210,115,20); 
               
       
        jRadioRegistrar.setBounds(575,80,120,20);
        jRadioModificar.setBounds(575,105,120,20); 
        jButtonOk.setBounds(240, 410,100, 20);
        jButtonCancel.setBounds(350, 410,100, 20);
        jButtonBuscar.setBounds(460, 410,100, 20);
        
        
        
        iniciarComponentes();
        limpiarCampos();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        cerrar();
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
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldFechaCreacion = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jRadioRegistrar = new javax.swing.JRadioButton();
        jRadioModificar = new javax.swing.JRadioButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrar Sedes");

        jLabel2.setText("Identificacion");

        jLabel3.setText("Id empleado");

        jLabel4.setText("Nombre");

        jLabel5.setText("Direccion");

        jLabel6.setText("Telefono");

        jLabel7.setText("Fecha Creacion");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldIdEmpleado)
                            .addComponent(jTextFieldIdentificacion)
                            .addComponent(jTextFieldDireccion)
                            .addComponent(jTextFieldTelefono)
                            .addComponent(jTextFieldFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButtonOk)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioRegistrar)
                    .addComponent(jRadioModificar))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jRadioRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonBuscar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public final void iniciarComponentes() {
        identificacion = "";
        id_empleado = "";
        nombre = "";
        direccion = "";
        telefono = "";
        fecha_creacion = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        jButtonBuscar.setEnabled(false);
        jTextFieldFechaCreacion.setEnabled(false);
    }

    public final void cerrar()
    {
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
    public final void limpiarCampos() {
        jTextFieldIdentificacion.setText("");
        jTextFieldIdEmpleado.setText("");
        jTextFieldNombre.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldFechaCreacion.setText(fecha_creacion);
    }

    public void tomarCampos() {
        identificacion = jTextFieldIdentificacion.getText();
        id_empleado = jTextFieldIdEmpleado.getText();
        nombre = jTextFieldNombre.getText();
        direccion = jTextFieldDireccion.getText();
        telefono = jTextFieldTelefono.getText();
        fecha_creacion = jTextFieldFechaCreacion.getText();
        //fecha_creacion1 = jDateFecha.getDate();
    }

    public int validarCampos() {
        identificacion = jTextFieldIdentificacion.getText();
        id_empleado = jTextFieldIdEmpleado.getText();
        nombre = jTextFieldNombre.getText();
        direccion = jTextFieldDireccion.getText();
        telefono = jTextFieldTelefono.getText();
        fecha_creacion = jTextFieldFechaCreacion.getText();
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
        } else if (direccion.isEmpty()) {
            return 7;
        } else if (direccion.equals("")|| direccion.contains("*") 
                || direccion.contains("=") || direccion.toUpperCase().contains("SELECT") 
                || direccion.toUpperCase().contains("INSERT") || direccion.toUpperCase().contains("DROP") 
                || direccion.toUpperCase().contains("DELETE")) {
            return 4;
        } else if (telefono.isEmpty()) {
            return 7;
        } else if (!Pattern.matches("[0-9]+", telefono)) {
            return 5;
        } else if (fecha_creacion.isEmpty()) {
            return 7;
        } else if (!fecha_creacion.contains("-")) {
            return 6;
        }
        return 0;
    }

    public void habilitarBotones() {
        jRadioModificar.setEnabled(true);
        jRadioRegistrar.setEnabled(true);
        jButtonBuscar.setEnabled(true);
        jButtonCancel.setEnabled(true);
        jButtonOk.setEnabled(true);
        jTextFieldDireccion.setEditable(true);
        jTextFieldFechaCreacion.setEditable(true);
        jTextFieldIdEmpleado.setEditable(true);
        jTextFieldIdentificacion.setEditable(true);
        jTextFieldNombre.setEditable(true);
        jTextFieldTelefono.setEditable(true);
        jRadioModificar.setSelected(false);
        jRadioRegistrar.setSelected(false);
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
                JOptionPane.showMessageDialog(null, "La dirección no permite inyecciones de codigo");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El campo telefono sólo debe contener números");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "La fecha de creación no permite letras o caracteres especiales");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
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
                ControladorSede.registrarSede(identificacion, id_empleado, nombre, direccion, telefono, fecha_creacion);
                limpiarCampos();
                habilitarBotones();
            }
        }
        if (jRadioModificar.isSelected()) {
            tomarCampos();
            int respuesta = validarCampos();
            mostrarMensajesValidaciones(respuesta);
            if (respuesta == 0) {
                ControladorSede.editarSede(identificacion, id_empleado, nombre, direccion, telefono, fecha_creacion);
                limpiarCampos();
                habilitarBotones();
            }
        }
    }//GEN-LAST:event_jButtonOkActionPerformed

    /*private void validarBeta()
    {
        ControladorSede controlador = new ControladorSede() ;
        controlador.validarDatosModif(identificacion, id_empleado, nombre, direccion, telefono, fecha_creacion);
    }*/
    private void eventosModificar() {
        jRadioRegistrar.setEnabled(false);
        jRadioRegistrar.setSelected(false);
        jButtonOk.setEnabled(false);
        jButtonCancel.setEnabled(true);
        jButtonBuscar.setEnabled(true);
        jTextFieldIdEmpleado.setEditable(false);
        jTextFieldNombre.setEditable(false);
        jTextFieldDireccion.setEditable(false);
        jTextFieldTelefono.setEditable(false);
        jTextFieldFechaCreacion.setEditable(false);
    }

    private void eventosBuscar() {
        jTextFieldIdentificacion.setEditable(false);
        jTextFieldIdEmpleado.setEditable(true);
        jTextFieldNombre.setEditable(true);
        jTextFieldDireccion.setEditable(true);
        jTextFieldTelefono.setEditable(true);
        jTextFieldFechaCreacion.setEditable(true);
        jButtonBuscar.setEnabled(false);
        jButtonOk.setEnabled(true);
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

    public void retornarDatosSedes() {
        String[] datos = ControladorSede.extraerSede(identificacion);
        jTextFieldIdentificacion.setText(datos[0]);
        jTextFieldIdEmpleado.setText(datos[1]);
        jTextFieldNombre.setText(datos[2]);
        jTextFieldDireccion.setText(datos[3]);
        jTextFieldTelefono.setText(datos[4]);
        jTextFieldFechaCreacion.setText(datos[5]);
    }

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        identificacion = jTextFieldIdentificacion.getText();
        if (ControladorSede.consultarSede(identificacion) && jRadioModificar.isSelected()) {
            retornarDatosSedes();
            eventosBuscar();
        } else if (ControladorSede.consultarSede(identificacion) == false) {
            JOptionPane.showMessageDialog(null, "No existe");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarSedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioModificar;
    private javax.swing.JRadioButton jRadioRegistrar;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldFechaCreacion;
    private javax.swing.JTextField jTextFieldIdEmpleado;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
