/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.ControladorEvento;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author diegoruiz
 */
public class Reportes extends JFrame implements ActionListener{
    JButton reporte_ventas;
    PanelGraficoBarras panel_barras;
    ControladorEvento controladorEvento;
    public Reportes(){
        configurarPanelReports();
        configurarBotones();
        controladorEvento = new ControladorEvento();
        panel_barras = new PanelGraficoBarras();
        panel_barras.setBounds(50, 100, 700, 400);
        this.add(panel_barras);
        this.repaint();
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
    
    public void configurarBotones(){
        reporte_ventas = new JButton("Ventas");
        reporte_ventas.setBounds(10, 20, 100, 50);
        reporte_ventas.addActionListener(this);
        this.add(reporte_ventas);
    }
    
    public void setGrafico(){
        DefaultCategoryDataset grafico = new DefaultCategoryDataset();
        String[] ventas_sedes = controladorEvento.ventasPorSede();
        for(int i=0; i<ventas_sedes.length; i++){
            int cantidad = Integer.parseInt(ventas_sedes[i].split(" - ")[1]);
            String sede = ventas_sedes[i].split(" - ")[0];
            grafico.setValue(cantidad, "Ventas", sede);
        }

        JFreeChart datos_grafico = ChartFactory.createBarChart("Aporte", "Sedes", "Ventas", grafico, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        CategoryPlot barChrt = datos_grafico.getCategoryPlot();
        barChrt.setRangeGridlinePaint(Color.ORANGE);

        ChartPanel barPanel = new ChartPanel(datos_grafico);
        panel_barras.removeAll();
        panel_barras.add(barPanel, BorderLayout.CENTER);
        panel_barras.validate();
    }//Fin PanelGraficoBarras

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(reporte_ventas)){
            setGrafico();
        }
    }
    
    public class PanelGraficoBarras extends JPanel{
        public PanelGraficoBarras(){
            configurarPanelGraficos();
        
        }
        
        private void configurarPanelGraficos() {
            setSize(700, 300);                                 // colocamos tamanio a la ventana (ancho, alto)
            setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
            //setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
            setResizable(false);                               // hacemos que la ventana no sea redimiensionable
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
            setBackground(Color.BLUE);
            setVisible(true);
        }
        
        public void setGrafico(){
            DefaultCategoryDataset grafico = new DefaultCategoryDataset();
            grafico.setValue(10000, "Categoria", "ENERO");
            grafico.setValue(20000, "Categoria", "FEBRERO");
            grafico.setValue(30000, "Categoria", "MARZO");
            
            JFreeChart datos_grafico = ChartFactory.createBarChart("Aporte", "Meses", "Aporte", grafico, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
            CategoryPlot barChrt = datos_grafico.getCategoryPlot();
            barChrt.setRangeGridlinePaint(Color.ORANGE);
            
            ChartPanel barPanel = new ChartPanel(datos_grafico);
            
        
        }//Fin PanelGraficoBarras
    
        public class PanelGraficoTorta{

        }//Fin PanelGraficoTorta

        public class PanelGraficoHistograma{

        }//Fin PanelGraficoHistograma
    }
    
    public static void main(String[] args){
        Reportes reportes = new Reportes();
    }
    
}
