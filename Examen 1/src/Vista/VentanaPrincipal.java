/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.ControladorVentanaPrincipal;
/**
 *
 * @author Erick
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorVentanaPrincipal cVentanaPrincipal;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.cVentanaPrincipal= new ControladorVentanaPrincipal();
        this.jMSalir.addActionListener(cVentanaPrincipal);
        this.jMCrear.addActionListener(cVentanaPrincipal);
        this.jMIntercambios.addActionListener(cVentanaPrincipal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();
        jCXml = new javax.swing.JCheckBoxMenuItem();
        jMPersonas = new javax.swing.JMenu();
        jMCrear = new javax.swing.JMenuItem();
        jMProcesos = new javax.swing.JMenu();
        jMIntercambios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmArchivo.setText("Archivo");

        jMSalir.setText("Salir");
        jmArchivo.add(jMSalir);

        jCXml.setSelected(true);
        jCXml.setText("XML");
        jmArchivo.add(jCXml);

        jMenuBar1.add(jmArchivo);

        jMPersonas.setText("Personas");

        jMCrear.setText("Crear");
        jMPersonas.add(jMCrear);

        jMenuBar1.add(jMPersonas);

        jMProcesos.setText("Procesos");

        jMIntercambios.setText("Intercambios");
        jMProcesos.add(jMIntercambios);

        jMenuBar1.add(jMProcesos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCXml;
    private javax.swing.JMenuItem jMCrear;
    private javax.swing.JMenuItem jMIntercambios;
    private javax.swing.JMenu jMPersonas;
    private javax.swing.JMenu jMProcesos;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmArchivo;
    // End of variables declaration//GEN-END:variables
}
