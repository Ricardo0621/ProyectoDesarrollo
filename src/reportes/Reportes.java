/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import com.toedter.calendar.JDateChooser;
import controladores.ControladorEvento;
import gui.InterfazAdministrador;
import gui.InterfazGerente;
import gui.InterfazOperador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
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
    JRadioButton radio_reportes_graficos;
    JRadioButton radio_reportes_listados;
    JLabel label_fecha_inicial;
    JLabel label_fecha_final;
    JLabel label_combo_select;
    JLabel label_alerta;
    JComboBox combo_opcion;
    JDateChooser dateInicial;
    JDateChooser dateFinal;
    JButton btn_mostrar;
    JButton btn_salir;
    PanelGraficoBarras panel_barras;
    PanelGraficoTorta panelGraficoTorta;
    ControladorEvento controladorEvento;
    String[] datos_usuario;
    InterfazAdministrador interfazAdministrador;
    InterfazGerente interfazGerente;
    InterfazOperador interfazOperador;
    
    
    public Reportes(String[] datos_usuario){
        this.datos_usuario=datos_usuario;
        configurarRadioButtons();
        configurarComponentesGraficos();
        controladorEvento = new ControladorEvento();
        configurarPanelReports();
    }
    
    private void configurarPanelReports() {
        this.setTitle("Reportes");                      // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
        this.getContentPane().setBackground(new java.awt.Color (35,47,65));
        
        
        //LABEL ABC 
        javax.swing.JLabel jLabelABC = new javax.swing.JLabel();
        jLabelABC.setBounds (20,0, 236,99); 
        jLabelABC.setBackground(new java.awt.Color(0, 254, 254));
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
        this.setVisible(true);
        
    }
    
    public void configurarRadioButtons(){
        radio_reportes_graficos = new JRadioButton("Reportes estadísticos");
        radio_reportes_listados = new JRadioButton("Listados");
        
        radio_reportes_graficos.setBounds(260, 20, 200, 20);
        radio_reportes_listados.setBounds(470, 20, 200, 20);
        
        radio_reportes_graficos.addActionListener(this);
        radio_reportes_listados.addActionListener(this);
        
        this.add(radio_reportes_graficos);
        this.add(radio_reportes_listados);
    }
        
    public void configurarComponentesGraficos(){
        btn_mostrar = new JButton("Mostrar");
        label_combo_select = new JLabel("Seleccione");
        if(datos_usuario[2].equals("Operador")){
            combo_opcion = new JComboBox(new String[]{"Seleccione","Ventas por sede", "Ventas por evento"});            
        }else{
            combo_opcion = new JComboBox(new String[]{"Seleccione","Ventas por sede", "Ventas por evento", "Ventas por vendedor"});
        }
        label_fecha_inicial = new JLabel("Fecha inicial");
        label_fecha_final = new JLabel("Fecha final");
        dateInicial = new JDateChooser();
        dateFinal = new JDateChooser();
        label_alerta = new JLabel("");
        btn_salir = new JButton("Salir");
        
        label_combo_select.setBounds(260, 60, 80, 25);
        combo_opcion.setBounds(260, 60, 200, 25);
        label_fecha_inicial.setBounds(260, 90, 80, 25);
        label_fecha_final.setBounds(260, 120, 80, 25);
        dateInicial.setBounds(260, 90, 200, 20);
        dateFinal.setBounds(260, 120, 200, 20);
        btn_mostrar.setBounds(600, 120, 100, 30);
        label_alerta.setBounds(600, 90, 300, 30);
        btn_salir.setBounds(600, 515, 150, 50);
            
        dateInicial.getJCalendar().setPreferredSize(new Dimension(500, 200));
        dateInicial.setFont(new Font("Dialog", Font.PLAIN, 10));
        dateFinal.getJCalendar().setPreferredSize(new Dimension(500, 200));
        dateFinal.setFont(new Font("Dialog", Font.PLAIN, 10));
        
        btn_mostrar.addActionListener(this);
        btn_salir.addActionListener(this);
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
        
        combo_opcion.setEnabled(false);
        dateInicial.setEnabled(false);
        dateFinal.setEnabled(false);
        btn_mostrar.setEnabled(false);
        
        this.add(btn_mostrar);
        this.add(label_combo_select);
        this.add(combo_opcion);
        this.add(label_fecha_inicial);
        this.add(label_fecha_final);
        this.add(dateInicial);
        this.add(dateFinal);
        this.add(label_alerta);
        this.add(btn_salir);
    }
    
    public void habilitarCampos(int opcion){
        if(opcion == 1){
            combo_opcion.removeAllItems();
            combo_opcion.addItem("Seleccione");
            combo_opcion.addItem("Ventas por sede");
            combo_opcion.addItem("Ventas por evento");
            if(!datos_usuario[2].equals("Operador")){
                combo_opcion.addItem("Ventas por empleado");
            }
            combo_opcion.setEnabled(true);
            dateInicial.setEnabled(true);
            dateFinal.setEnabled(true);
            btn_mostrar.setEnabled(true);
        }else if(opcion == 2){
            combo_opcion.removeAllItems();
            combo_opcion.addItem("Seleccione");
            combo_opcion.addItem("eventos");
            combo_opcion.addItem("sedes");
            combo_opcion.addItem("Ventas por sede");
            combo_opcion.addItem("Ventas por evento");
            if(!datos_usuario[2].equals("Operador")){
                combo_opcion.addItem("Ventas por empleado");
                combo_opcion.addItem("Todos los empleados");
            }
            combo_opcion.setEnabled(true);
            dateInicial.setEnabled(false);
            dateFinal.setEnabled(false);
            btn_mostrar.setEnabled(true);
        }
    }
    
    public void mostrarPanelGraficoBarras(int opcion, String fecha_inicial, String fecha_final){
        controladorEvento = new ControladorEvento();
        panel_barras = new PanelGraficoBarras(opcion, fecha_inicial, fecha_final);
        panel_barras.setBounds(10, 165, 380, 320);
        this.add(panel_barras);
    }
    
    public void mostrarPanelGraficoTorta(int opcion, String fecha_inicial, String fecha_final){
        panelGraficoTorta = new PanelGraficoTorta(opcion, fecha_inicial, fecha_final);
        panelGraficoTorta.setBounds(400, 165, 380, 320);
        this.add(panelGraficoTorta);
    }
    
    public void removerPaneles(){
        if (panelGraficoTorta != null) {
            this.remove(panelGraficoTorta);
        }
        if (panel_barras != null){
            this.remove(panel_barras);
        }
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
        if(e.getSource().equals(btn_mostrar)){
            if(radio_reportes_graficos.isSelected()){
                if(validarCampos() == 0){
                    removerPaneles();
                    int opcion = combo_opcion.getSelectedIndex();
                    String fecha_inicial = new SimpleDateFormat("yyyy-MM-dd").format(dateInicial.getDate());
                    String fecha_final = new SimpleDateFormat("yyyy-MM-dd").format(dateFinal.getDate());
                    mostrarPanelGraficoBarras(opcion, fecha_inicial, fecha_final);
                    mostrarPanelGraficoTorta(opcion, fecha_inicial, fecha_final);
                    this.repaint();
                }
            }else if(radio_reportes_listados.isSelected()){
                displayReporte(combo_opcion.getSelectedIndex());
            }
        }else if(e.getSource().equals(combo_opcion)){
            dateInicial.setBorder(null);
            label_alerta.setText("");
            combo_opcion.setBorder(null);
            dateFinal.setBorder(null);
        }else if(e.getSource().equals(radio_reportes_graficos)){
            radio_reportes_listados.setSelected(false);
            habilitarCampos(1);
        }else if(e.getSource().equals(radio_reportes_listados)){
            radio_reportes_graficos.setSelected(false);
            habilitarCampos(2);
            removerPaneles();
            this.repaint();
        }else if(e.getSource().equals(btn_salir)){
            if(datos_usuario[2].equals("Administrador")){
                interfazAdministrador = new InterfazAdministrador(datos_usuario);
                interfazAdministrador.setVisible(true);
                this.dispose();
            }else if(datos_usuario[2].equals("Gerente")){
                interfazGerente = new InterfazGerente();
                interfazGerente.setVisible(true);
                this.dispose();
            }else if(datos_usuario[2].equals("Operador")){
                interfazOperador = new InterfazOperador(datos_usuario);
                interfazOperador.setVisible(true);
                this.dispose();
            }
        }
    }
    
    public void displayReporte(int opcion){
        try {
            String report = "";
            if(opcion == 1){
                report = new File(".").getCanonicalPath()+ "/src/reportes/eventos.jrxml";
            }else if(opcion == 2){
                report = new File(".").getCanonicalPath()+ "/src/reportes/sedes.jrxml";
            }else if(opcion == 3){
                report = new File(".").getCanonicalPath()+ "/src/reportes/ventas_por_sede.jrxml";
            }else if(opcion == 4){
                report = new File(".").getCanonicalPath()+ "/src/reportes/ventas_por_evento.jrxml";
            }else if(opcion == 5){
                report = new File(".").getCanonicalPath()+ "/src/reportes/ventas_por_empleado.jrxml";
            }else if(opcion == 6){
                report = new File(".").getCanonicalPath()+ "/src/reportes/empleados.jrxml";
            }
            JasperReport ir = JasperCompileManager.compileReport(report);
            JasperPrint ip = JasperFillManager.fillReport(ir, null,controladorEvento.getConnection());
            JFrame frame = new JFrame();
            frame.setBounds(100, 100, 800,600);
            frame.add(new JRViewer(ip));
            frame.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public class PanelGraficoBarras extends JPanel{
        public PanelGraficoBarras(int opcion, String fecha_inicial, String fecha_final){
            setGrafico(opcion, fecha_inicial, fecha_final);
        }
        public void setGrafico(int opcion, String fecha_inicial, String fecha_final){
            DefaultCategoryDataset grafico = new DefaultCategoryDataset();
            String[] ventas_sedes = null;
            String variable = "";
            if(opcion == 1){
                variable = "sede";
                ventas_sedes = controladorEvento.ventasPorSede(fecha_inicial, fecha_final);
            }else if(opcion == 2){
                variable = "evento";
                ventas_sedes = controladorEvento.ventasEvento(fecha_inicial, fecha_final);
            }else if(opcion == 3){
                variable = "empleado";
                ventas_sedes = controladorEvento.ventasPorEmpleado(fecha_inicial, fecha_final);
            }
            for(int i=0; i<ventas_sedes.length; i++){
                int cantidad = Integer.parseInt(ventas_sedes[i].split(" - ")[1]);
                String sede = ventas_sedes[i].split(" - ")[0];
                grafico.setValue(cantidad, "Ventas", sede);
            }

            JFreeChart datos_grafico = ChartFactory.createBarChart("Ventas por "+variable, "Sedes", "Ventas", grafico, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
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
            String variable = "";
            if(opcion == 1){
                variable = "sede";
                ventas_sedes = controladorEvento.cuposVendidosPorSede(fecha_inicial, fecha_final);
            }else if(opcion == 2){
                variable = "evento";
                ventas_sedes = controladorEvento.cuposVendidosPorEvento(fecha_inicial, fecha_final);
            }else if(opcion == 3){
                variable = "empleado";
                ventas_sedes = controladorEvento.cuposVendidosPorEmpleado(fecha_inicial, fecha_final);
            }
            for(int i=0; i<ventas_sedes.length; i++){
                int cantidad = Integer.parseInt(ventas_sedes[i].split(" - ")[1]);
                String sede = ventas_sedes[i].split(" - ")[0];
                grafico.setValue(sede, cantidad);
            }
            
            JFreeChart datos_grafico = ChartFactory.createPieChart("Cupos por "+variable, grafico, true, true, true);
            ChartPanel barPanel = new ChartPanel(datos_grafico);
            barPanel.setBounds(0, 0, 380, 320);
            removeAll();
            add(barPanel);
            validate();
        }
    }//Fin PanelGraficoTorta  
}
