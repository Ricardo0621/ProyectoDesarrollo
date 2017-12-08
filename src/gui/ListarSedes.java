/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorSede;
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
public class ListarSedes extends JFrame {

    public ListarSedes() {
        this.setTitle("Panel de usuario");                      // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        tablasSedes();
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

    public void tablasSedes() {
        String[] titulo = new String[]{"Id", "IdEmp", "Nombre", "Direccion", "telefono", "Fecha"};
        ControladorSede controladorSede = new ControladorSede();
        String[] sede = controladorSede.listarIdNombreSedes();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(titulo);
        for (int i = 0; i < sede.length; i++) {
            String[] fila = sede[i].split(";;;");
            String[] temp = {fila[0], fila[1], fila[2], fila[3], fila[4], fila[5]};
            dtm.addRow(temp);
        }

        JTable tabla = new JTable(dtm);
        JScrollPane sp_tabla = new JScrollPane(tabla);
        sp_tabla.setBounds(10, 30, 540, 510);
        add(sp_tabla);
    }
}
