/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorEvento;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo
 */
public class ListarEventos extends JFrame {

    public ListarEventos() {
        this.setTitle("Panel de usuario");                      // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tablasEventos();
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
        sp_tabla.setBounds(10, 30, 540, 510);
        add(sp_tabla);
    }
}
