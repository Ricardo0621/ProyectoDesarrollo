/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorEvento;
import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo
 */
public class ListarEventos extends JFrame {
    
   
    
    private void initComponents() 
    {
      
        
        
        
        
        pack(); 
    
    }

    public ListarEventos() {
        initComponents();
        this.setTitle("Panel de usuario");                      // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable     
        this.getContentPane().setBackground(new java.awt.Color (35,47,65));
        
        
         
        javax.swing.JLabel jLabelTitle = new javax.swing.JLabel();
        jLabelTitle.setBounds (240,0, 236,99); 
        
        jLabelTitle.setFont(new java.awt.Font("Arial 18 Plain", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(254, 254, 254));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jLabelTitle.setText("LISTADO DE EVENTOS");
        this.getContentPane().add(jLabelTitle);
        
        javax.swing.JPanel  jPanelAzulClaro = new javax.swing.JPanel();
        jPanelAzulClaro.setBounds(0,0,240,800) ;
        jPanelAzulClaro.setBackground(new java.awt.Color(97, 212, 195));
        
        this.getContentPane().add(jPanelAzulClaro); 
        
        javax.swing.JLabel jLabelABC = new javax.swing.JLabel();
        jLabelABC.setBounds (20,0, 236,99); 
        jLabelABC.setBackground(new java.awt.Color(0, 254, 254));
        jLabelABC.setFont(new java.awt.Font("Purisa", 1, 50)); // NOI18N
        jLabelABC.setForeground(new java.awt.Color(254, 254, 254));
        jLabelABC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelABC.setText("A.B.C.");
        
        jPanelAzulClaro.add(jLabelABC); 
        
        tablasEventos();
        
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

    public void tablasEventos() {
        String[] titulo = new String[]{"Id", "IdEmp", "Nombre", "Descrip", "Fech_cre", "Fech_in"};
        ControladorEvento controladorEvento = new ControladorEvento();
        String[] evento = controladorEvento.listarIdNombreEventos();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(titulo);
        for (int i = 0; i < evento.length; i++) {
            String[] fila = evento[i].split(";;;");
            String[] temp = {fila[0], fila[1], fila[2], fila[3], fila[4], fila[5]};
            dtm.addRow(temp);
        }

        JTable tabla = new JTable(dtm);
        JScrollPane sp_tabla = new JScrollPane(tabla);
        sp_tabla.setBounds(240, 60, 540, 320);
        add(sp_tabla);
    }
}
