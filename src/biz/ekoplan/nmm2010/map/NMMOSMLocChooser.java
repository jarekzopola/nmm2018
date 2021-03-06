/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.ekoplan.nmm2010.map;

import biz.ekoplan.nmm2010.toolbox.NMMToolbox;
import java.awt.Image;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.OsmTileLoader;
import org.openstreetmap.gui.jmapviewer.interfaces.TileSource;
import org.openstreetmap.gui.jmapviewer.tilesources.BingAerialTileSource;
import org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource;

/**
 *
 * @author jarek
 */
public class NMMOSMLocChooser extends javax.swing.JDialog {

    double lon;
    double lat;
    Image i;
    
    MapMarkerDot mmd=new MapMarkerDot(0,0);
    
    
    /**
     * Creates new form NMMOSMLocChooser
     */
    public NMMOSMLocChooser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
                
        this.comboTileSource.removeAllItems();
        this.comboTileSource.addItem(new OsmTileSource.Mapnik());
        this.comboTileSource.addItem(new BingAerialTileSource());
        
        this.jMapViewer2.setTileLoader(new OsmTileLoader(this.jMapViewer2));
                       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMapViewer2 = new org.openstreetmap.gui.jmapviewer.JMapViewer();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelCoordinates = new javax.swing.JLabel();
        textCoordinates = new javax.swing.JTextField();
        comboTileSource = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jMapViewer2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMapViewer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMapViewer2MouseClicked(evt);
            }
        });
        jMapViewer2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMapViewer2MouseMoved(evt);
            }
        });

        jLabel1.setText("Show location on a map.          CTRL+click - center and zoom map.");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelCoordinates.setText("Coordinates:");

        textCoordinates.setText("--,- ; --,-");

        comboTileSource.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OpenStreetMap (Mapnik)", "OpenCycleMap", "BING" }));
        comboTileSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTileSourceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTileSource, 0, 287, Short.MAX_VALUE))
                    .addComponent(jMapViewer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelCoordinates)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textCoordinates, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTileSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMapViewer2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(labelCoordinates)
                    .addComponent(textCoordinates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMapViewer1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMapViewer1MouseMoved
        
    }//GEN-LAST:event_jMapViewer1MouseMoved

    private void jMapViewer2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMapViewer2MouseMoved
        
        JMapViewer jmv = (JMapViewer)evt.getSource();
        Coordinate c;
        c=jmv.getPosition(evt.getX(), evt.getY());
        
        this.labelCoordinates.setText(NMMToolbox.formatDouble(c.getLon(), "##0.000000")
                +" "+NMMToolbox.formatDouble(c.getLat(), "##0.000000"));
    }//GEN-LAST:event_jMapViewer2MouseMoved

    private void jMapViewer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMapViewer2MouseClicked
        JMapViewer jmv = (JMapViewer)evt.getSource();
        Coordinate c;
        c=jmv.getPosition(evt.getX(), evt.getY());
        
        if (evt.isControlDown()) {
            int zoom = this.jMapViewer2.getZoom();
            if (zoom<11) { 
                zoom=zoom*2; 
            } else {
                zoom=zoom+1;
            }
            this.jMapViewer2.setDisplayPositionByLatLon(c.getLat(), c.getLon(),zoom);
        } else {
            this.textCoordinates.setText(NMMToolbox.formatDouble(c.getLon(), "##0.000000")
                +" "+
                NMMToolbox.formatDouble(c.getLat(), "##0.000000"));
            this.lon=c.getLon();
            this.lat=c.getLat();            
        }               
    }//GEN-LAST:event_jMapViewer2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboTileSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTileSourceActionPerformed
        if (this.comboTileSource.getSelectedIndex()!=-1) {
            this.jMapViewer2.setTileSource((TileSource)this.comboTileSource.getSelectedItem());
        }             
    }//GEN-LAST:event_comboTileSourceActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                
    }//GEN-LAST:event_formWindowOpened

    public double getLon() {
        return this.lon;
    }
    
    public double getLat() {
        return this.lat;
    }
    
    public Image getImage() {
        return i;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NMMOSMLocChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NMMOSMLocChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NMMOSMLocChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NMMOSMLocChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                NMMOSMLocChooser dialog = new NMMOSMLocChooser(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboTileSource;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private org.openstreetmap.gui.jmapviewer.JMapViewer jMapViewer2;
    private javax.swing.JLabel labelCoordinates;
    private javax.swing.JTextField textCoordinates;
    // End of variables declaration//GEN-END:variables
}
