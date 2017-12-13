/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.JPanel;
import reportes.Reportes;

/**
 *
 * @author Ricardo
 */
public class InterfazGerente extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGerente
     */
    public InterfazGerente() {
        initComponents();
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelSedes = new javax.swing.JPanel();
        jLabelSedes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelEventos = new javax.swing.JPanel();
        jLabelEventos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelListarSedes = new javax.swing.JPanel();
        jLabelListarSedes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelReportes = new javax.swing.JPanel();
        jLabelReportes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelListarEventos = new javax.swing.JPanel();
        jLabelListarEventos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelAzulClaro = new javax.swing.JPanel();
        jLabelABC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));

        jPanelSedes.setBackground(new java.awt.Color(36, 47, 65));
        jPanelSedes.setForeground(new java.awt.Color(36, 47, 65));
        jPanelSedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSedesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSedesMouseExited(evt);
            }
        });

        jLabelSedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-business-building-50.png"))); // NOI18N
        jLabelSedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSedesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSedesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSedesMousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(245, 246, 255));
        jLabel2.setText("Sedes");

        javax.swing.GroupLayout jPanelSedesLayout = new javax.swing.GroupLayout(jPanelSedes);
        jPanelSedes.setLayout(jPanelSedesLayout);
        jPanelSedesLayout.setHorizontalGroup(
            jPanelSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSedesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSedesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jLabelSedes))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelSedesLayout.setVerticalGroup(
            jPanelSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSedesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelSedes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEventos.setBackground(new java.awt.Color(36, 47, 65));
        jPanelEventos.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanelEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelEventosMouseExited(evt);
            }
        });

        jLabelEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-event-50.png"))); // NOI18N
        jLabelEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelEventosMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEventosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEventosMouseEntered(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Eventos");

        javax.swing.GroupLayout jPanelEventosLayout = new javax.swing.GroupLayout(jPanelEventos);
        jPanelEventos.setLayout(jPanelEventosLayout);
        jPanelEventosLayout.setHorizontalGroup(
            jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEventosLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEventos)
                    .addGroup(jPanelEventosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)))
                .addGap(27, 27, 27))
        );
        jPanelEventosLayout.setVerticalGroup(
            jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventosLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabelEventos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanelListarSedes.setBackground(new java.awt.Color(36, 47, 65));
        jPanelListarSedes.setForeground(new java.awt.Color(36, 47, 65));
        jPanelListarSedes.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanelListarSedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelListarSedesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelListarSedesMouseEntered(evt);
            }
        });

        jLabelListarSedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-people-40.png"))); // NOI18N
        jLabelListarSedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelListarSedesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelListarSedesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelListarSedesMousePressed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Listar Sedes");

        javax.swing.GroupLayout jPanelListarSedesLayout = new javax.swing.GroupLayout(jPanelListarSedes);
        jPanelListarSedes.setLayout(jPanelListarSedesLayout);
        jPanelListarSedesLayout.setHorizontalGroup(
            jPanelListarSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListarSedesLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabelListarSedes)
                .addGap(29, 29, 29))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelListarSedesLayout.setVerticalGroup(
            jPanelListarSedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarSedesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelListarSedes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelReportes.setBackground(new java.awt.Color(36, 47, 65));
        jPanelReportes.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanelReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelReportesMouseExited(evt);
            }
        });

        jLabelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-combo-chart-50.png"))); // NOI18N
        jLabelReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelReportesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelReportesMousePressed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 250, 250));
        jLabel4.setText("Reportes");

        javax.swing.GroupLayout jPanelReportesLayout = new javax.swing.GroupLayout(jPanelReportes);
        jPanelReportes.setLayout(jPanelReportesLayout);
        jPanelReportesLayout.setHorizontalGroup(
            jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportesLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelReportes)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17))
        );
        jPanelReportesLayout.setVerticalGroup(
            jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelReportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanelListarEventos.setBackground(new java.awt.Color(36, 47, 65));
        jPanelListarEventos.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanelListarEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelListarEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelListarEventosMouseExited(evt);
            }
        });

        jLabelListarEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-list-40.png"))); // NOI18N
        jLabelListarEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelListarEventosMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelListarEventosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelListarEventosMouseEntered(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Listar Eventos");

        javax.swing.GroupLayout jPanelListarEventosLayout = new javax.swing.GroupLayout(jPanelListarEventos);
        jPanelListarEventos.setLayout(jPanelListarEventosLayout);
        jPanelListarEventosLayout.setHorizontalGroup(
            jPanelListarEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarEventosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelListarEventos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListarEventosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelListarEventosLayout.setVerticalGroup(
            jPanelListarEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarEventosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelListarEventos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Bienvenido Gerente");

        jPanelAzulClaro.setBackground(new java.awt.Color(97, 212, 195));

        jLabelABC.setFont(new java.awt.Font("Purisa", 1, 50)); // NOI18N
        jLabelABC.setForeground(new java.awt.Color(254, 254, 254));
        jLabelABC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelABC.setText("A.B.C.");

        javax.swing.GroupLayout jPanelAzulClaroLayout = new javax.swing.GroupLayout(jPanelAzulClaro);
        jPanelAzulClaro.setLayout(jPanelAzulClaroLayout);
        jPanelAzulClaroLayout.setHorizontalGroup(
            jPanelAzulClaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAzulClaroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelABC, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAzulClaroLayout.setVerticalGroup(
            jPanelAzulClaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAzulClaroLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabelABC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelAzulClaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(316, 316, 316))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanelSedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jPanelEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jPanelListarSedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jPanelListarEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSedes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelListarSedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelListarEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
            .addComponent(jPanelAzulClaro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelListarEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelListarEventosMouseExited
        // TODO add your handling code here:
        //resetColor(jPanelListarEventos);
       jPanelListarEventos.setBackground(new Color (36,47,65) );
       jLabelListarEventos.setForeground(Color.white) ;
        
    }//GEN-LAST:event_jPanelListarEventosMouseExited

    private void jPanelListarEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelListarEventosMouseEntered
        // TODO add your handling code here:
        setColor(jPanelListarEventos);
    }//GEN-LAST:event_jPanelListarEventosMouseEntered

    private void jLabelListarEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelListarEventosMouseEntered
        // TODO add your handling code here:
        setColor(jPanelListarEventos);
    }//GEN-LAST:event_jLabelListarEventosMouseEntered

    private void jLabelListarEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelListarEventosMouseExited
        // TODO add your handling code here:
        //resetColor(jPanelListarEventos);
        jLabelListarEventos.setForeground(Color.white) ;
      
    }//GEN-LAST:event_jLabelListarEventosMouseExited

    private void jLabelListarEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelListarEventosMousePressed
        ListarEventos listarEventos = new ListarEventos();
        listarEventos.show();
    }//GEN-LAST:event_jLabelListarEventosMousePressed

    private void jPanelReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReportesMouseExited
        // TODO add your handling code here:
        resetColor(jPanelReportes);
        jPanelReportes.setBackground(new Color (36,47,65) );
        jLabelReportes.setForeground(Color.white) ;
    }//GEN-LAST:event_jPanelReportesMouseExited

    private void jPanelReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReportesMouseEntered
        // TODO add your handling code here:
        setColor(jPanelReportes);
    }//GEN-LAST:event_jPanelReportesMouseEntered

    private void jLabelReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReportesMousePressed
        String datosempleado[] = {"", "", "Gerente"};
        Reportes reportes = new Reportes(datosempleado);
        reportes.show();
    }//GEN-LAST:event_jLabelReportesMousePressed

    private void jLabelReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReportesMouseExited
        // TODO add your handling code here:
        //resetColor(jPanelReportes);
        jLabelListarEventos.setForeground(Color.white) ;
    }//GEN-LAST:event_jLabelReportesMouseExited

    private void jLabelReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReportesMouseEntered
        // TODO add your handling code here:
        setColor(jPanelReportes);
    }//GEN-LAST:event_jLabelReportesMouseEntered

    private void jPanelListarSedesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelListarSedesMouseEntered
        // TODO add your handling code here:
        setColor(jPanelListarSedes);
        
    }//GEN-LAST:event_jPanelListarSedesMouseEntered

    private void jPanelListarSedesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelListarSedesMouseExited
        // TODO add your handling code here:
        jPanelListarSedes.setBackground(new Color (36,47,65) );
        jLabelListarSedes.setForeground(Color.white) ;
    }//GEN-LAST:event_jPanelListarSedesMouseExited

    private void jLabelListarSedesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelListarSedesMousePressed
        ListarSedes listarSedes = new ListarSedes();
        listarSedes.show();
    }//GEN-LAST:event_jLabelListarSedesMousePressed

    private void jLabelListarSedesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelListarSedesMouseExited
        // TODO add your handling code here:
        jLabelListarSedes.setForeground(Color.white) ;
    }//GEN-LAST:event_jLabelListarSedesMouseExited

    private void jLabelListarSedesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelListarSedesMouseEntered
        // TODO add your handling code here:
        setColor(jPanelListarSedes);
    }//GEN-LAST:event_jLabelListarSedesMouseEntered

    private void jPanelEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEventosMouseExited
        // TODO add your handling code here:
        jPanelEventos.setBackground(new Color (36,47,65) );
        jLabelEventos.setForeground(Color.white) ;
    }//GEN-LAST:event_jPanelEventosMouseExited

    private void jPanelEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEventosMouseEntered
        // TODO add your handling code here:
        setColor(jPanelEventos);
    }//GEN-LAST:event_jPanelEventosMouseEntered

    private void jLabelEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMousePressed
        RegistrarEventos registrarEventos = new RegistrarEventos();
        registrarEventos.show();
        dispose();
    }//GEN-LAST:event_jLabelEventosMousePressed

    private void jLabelEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMouseExited
        // TODO add your handling code here:
        resetColor(jPanelEventos);
    }//GEN-LAST:event_jLabelEventosMouseExited

    private void jLabelEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMouseEntered
        // TODO add your handling code here:
        setColor(jPanelEventos);
    }//GEN-LAST:event_jLabelEventosMouseEntered

    private void jPanelSedesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSedesMouseExited
        // TODO add your handling code here:
        jPanelSedes.setBackground(new Color (36,47,65) );
        jLabelSedes.setForeground(Color.white) ;
    }//GEN-LAST:event_jPanelSedesMouseExited

    private void jPanelSedesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSedesMouseEntered
        // TODO add your handling code here:
        setColor(jPanelSedes);
    }//GEN-LAST:event_jPanelSedesMouseEntered

    private void jLabelSedesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSedesMousePressed
        RegistrarSedes registrarSedes = new RegistrarSedes();
        registrarSedes.show();
        dispose();
    }//GEN-LAST:event_jLabelSedesMousePressed

    private void jLabelSedesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSedesMouseExited
        // TODO add your handling code here:
        jLabelSedes.setForeground(Color.white) ;
    }//GEN-LAST:event_jLabelSedesMouseExited

    private void jLabelSedesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSedesMouseEntered
        // TODO add your handling code here:
        setColor(jPanelSedes);
    }//GEN-LAST:event_jLabelSedesMouseEntered

    
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(255, 255, 255));
    }

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
            java.util.logging.Logger.getLogger(InterfazGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelABC;
    private javax.swing.JLabel jLabelEventos;
    private javax.swing.JLabel jLabelListarEventos;
    private javax.swing.JLabel jLabelListarSedes;
    private javax.swing.JLabel jLabelReportes;
    private javax.swing.JLabel jLabelSedes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAzulClaro;
    private javax.swing.JPanel jPanelEventos;
    private javax.swing.JPanel jPanelListarEventos;
    private javax.swing.JPanel jPanelListarSedes;
    private javax.swing.JPanel jPanelReportes;
    private javax.swing.JPanel jPanelSedes;
    // End of variables declaration//GEN-END:variables
}
