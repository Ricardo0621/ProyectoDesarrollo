/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.toedter.calendar.JDateChooser;
import controladores.ControladorEvento;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author diegoruiz
 */
public class Reportes extends JFrame implements ActionListener{
    JLabel label_fecha_inicial;
    JLabel label_fecha_final;
    JLabel label_combo_select;
    JLabel label_alerta;
    JComboBox combo_opcion;
    JDateChooser dateInicial;
    JDateChooser dateFinal;
    JButton mostrar;
    PanelGraficoBarras panel_barras;
    PanelGraficoTorta panelGraficoTorta;
    ControladorEvento controladorEvento;
    String tipo_reporte;
    
    public Reportes(String tipo_reporte){
        configurarComponentes();
        this.tipo_reporte = tipo_reporte;
        controladorEvento = new ControladorEvento();
        configurarPanelReports();
    }
    
    private void configurarPanelReports() {
        this.setTitle("Reportes");                      // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
        this.setVisible(true);
    }
    
    public void configurarComponentes(){
        mostrar = new JButton("Mostrar");
        label_combo_select = new JLabel("Seleccione");
        combo_opcion = new JComboBox(new String[]{"Seleccione","Ventas por sede", "Ventas por vendedor", "Ventas por evento"});
        label_fecha_inicial = new JLabel("Fecha inicial");
        label_fecha_final = new JLabel("Fecha final");
        dateInicial = new JDateChooser();
        dateFinal = new JDateChooser();
        label_alerta = new JLabel("");
        
        label_combo_select.setBounds(50, 20, 80, 25);
        combo_opcion.setBounds(140, 20, 200, 25);
        label_fecha_inicial.setBounds(50, 50, 80, 25);
        label_fecha_final.setBounds(50, 80, 80, 25);
        dateInicial.setBounds(140, 50, 200, 20);
        dateFinal.setBounds(140, 80, 200, 20);
        mostrar.setBounds(350, 80, 100, 30);
        label_alerta.setBounds(350, 50, 300, 30);
        
        dateInicial.getJCalendar().setPreferredSize(new Dimension(500, 200));
        dateInicial.setFont(new Font("Dialog", Font.PLAIN, 10));
        dateFinal.getJCalendar().setPreferredSize(new Dimension(500, 200));
        dateFinal.setFont(new Font("Dialog", Font.PLAIN, 10));
        
        mostrar.addActionListener(this);
        combo_opcion.addActionListener(this);
        
        dateInicial.getDateEditor().addPropertyChangeListener(
            new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    dateInicial.setBorder(null);
                    label_alerta.setText("");
                    combo_opcion.setBorder(null);
                    dateFinal.setBorder(null);
                }
            });
        dateFinal.getDateEditor().addPropertyChangeListener(
            new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    dateInicial.setBorder(null);
                    label_alerta.setText("");
                    combo_opcion.setBorder(null);
                    dateFinal.setBorder(null);
                }
            });
        
        this.add(mostrar);
        this.add(label_combo_select);
        this.add(combo_opcion);
        this.add(label_fecha_inicial);
        this.add(label_fecha_final);
        this.add(dateInicial);
        this.add(dateFinal);
        this.add(label_alerta);
    }
    
    public void mostrarPanelGraficoBarras(int opcion, String fecha_inicial, String fecha_final){
        controladorEvento = new ControladorEvento();
        panel_barras = new PanelGraficoBarras(opcion, fecha_inicial, fecha_final);
        panel_barras.setBounds(10, 150, 380, 3200);
        this.add(panel_barras);
    }
    
    public void mostrarPanelGraficoTorta(int opcion, String fecha_inicial, String fecha_final){
        panelGraficoTorta = new PanelGraficoTorta(opcion, fecha_inicial, fecha_final);
        panelGraficoTorta.setBounds(400, 150, 380, 320);
        this.add(panelGraficoTorta);
    }
    
    public int validarCampos(){
        int resultado = -1;
        if (combo_opcion.getSelectedIndex() == 0){
            resultado = 1;
        }else if(dateInicial.getDate() == null){
            resultado = 2;
        }else if(dateFinal.getDate()== null){
            resultado = 3;
        }else{
            resultado = 0;
        }
        marcarCampos(resultado);
        return resultado;
    }
    
    public void marcarCampos(int opcion){
        if(opcion == 1){
            combo_opcion.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            label_alerta.setText("<html><font color='red' size='4'>!!! Seleccione una opción !!!</font></html>");
        }else if(opcion == 2){
            dateInicial.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            label_alerta.setText("<html><font color='red' size='4'>!!! Seleccione la fecha inicial !!!</font></html>");
        }else if(opcion == 3){
            dateFinal.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            label_alerta.setText("<html><font color='red' size='4'>!!! Seleccione la fecha final!!!</font></html>");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(mostrar)){
            if(validarCampos() == 0){
                if (panelGraficoTorta != null) {
                    this.remove(panelGraficoTorta);
                }
                if (panel_barras != null){
                    this.remove(panel_barras);
                }
                int opcion = combo_opcion.getSelectedIndex();
                String fecha_inicial = new SimpleDateFormat("yyyy-MM-dd").format(dateInicial.getDate());
                String fecha_final = new SimpleDateFormat("yyyy-MM-dd").format(dateFinal.getDate());
                mostrarPanelGraficoBarras(opcion, fecha_inicial, fecha_final);
                mostrarPanelGraficoTorta(opcion, fecha_inicial, fecha_final);
                this.repaint();
            }
        }else if(e.getSource().equals(combo_opcion)){
            dateInicial.setBorder(null);
            label_alerta.setText("");
            combo_opcion.setBorder(null);
            dateFinal.setBorder(null);
        }
    }
    
    public class PanelGraficoBarras extends JPanel{
        public PanelGraficoBarras(int opcion, String fecha_inicial, String fecha_final){
            setGrafico(opcion, fecha_inicial, fecha_final);
        }
        public void setGrafico(int opcion, String fecha_inicial, String fecha_final){
            DefaultCategoryDataset grafico = new DefaultCategoryDataset();
            String[] ventas_sedes = null;
            if(opcion == 1){
                ventas_sedes = controladorEvento.ventasPorSede(fecha_inicial, fecha_final);
            }else if(opcion == 2){
                ventas_sedes = controladorEvento.ventasPorEmpleado(fecha_inicial, fecha_final);
            }else if(opcion == 3){
                ventas_sedes = controladorEvento.ventasEvento(fecha_inicial, fecha_final);
            }
            for(int i=0; i<ventas_sedes.length; i++){
                int cantidad = Integer.parseInt(ventas_sedes[i].split(" - ")[1]);
                String sede = ventas_sedes[i].split(" - ")[0];
                grafico.setValue(cantidad, "Ventas", sede);
            }

            JFreeChart datos_grafico = ChartFactory.createBarChart("Ventas por sede", "Sedes", "Ventas", grafico, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
            CategoryPlot barChrt = datos_grafico.getCategoryPlot();
            barChrt.setRangeGridlinePaint(Color.ORANGE);
            org.jfree.chart.axis.CategoryAxis axis = datos_grafico.getCategoryPlot().getDomainAxis();
            axis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);

            ChartPanel barPanel = new ChartPanel(datos_grafico);
            barPanel.setBounds(0, 0, 380, 320);
            removeAll();
            add(barPanel);
            validate();
        }
    }//Fin PanelGraficoBarras
    
    public class PanelGraficoTorta extends JPanel{
        public  PanelGraficoTorta(int opcion, String fecha_inicial, String fecha_final){
            setGrafico(opcion, fecha_inicial, fecha_final);
        }
        public void setGrafico(int opcion, String fecha_inicial, String fecha_final){
            DefaultPieDataset grafico = new DefaultPieDataset();
            String[] ventas_sedes = null;
            if(opcion == 1){
                ventas_sedes = controladorEvento.cuposVendidosPorSede(fecha_inicial, fecha_final);
            }else if(opcion == 2){
                ventas_sedes = controladorEvento.cuposVendidosPorEmpleado(fecha_inicial, fecha_final);
            }else if(opcion == 3){
                ventas_sedes = controladorEvento.cuposVendidosPorEvento(fecha_inicial, fecha_final);
            }
            for(int i=0; i<ventas_sedes.length; i++){
                int cantidad = Integer.parseInt(ventas_sedes[i].split(" - ")[1]);
                String sede = ventas_sedes[i].split(" - ")[0];
                grafico.setValue(sede, cantidad);
            }
            
            JFreeChart datos_grafico = ChartFactory.createPieChart("Cupos por sede", grafico, true, true, true);
            ChartPanel barPanel = new ChartPanel(datos_grafico);
            barPanel.setBounds(0, 0, 380, 320);
            removeAll();
            add(barPanel);
            validate();
        }
    }//Fin PanelGraficoTorta

    public class PanelGraficoHistograma{

    }//Fin PanelGraficoHistograma
    
    public static void main(String[] args){
        Reportes reportes = new Reportes("Ventas");
    }
    
}
