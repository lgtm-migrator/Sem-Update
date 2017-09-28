package vista;

import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pc;

public class VentanaPrincipal extends javax.swing.JFrame {

    public static String ip = "192.168.0.100";

    public VentanaPrincipal() {
        initComponents();
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
        jButtonIniciar = new javax.swing.JButton();
        jButtonDetener = new javax.swing.JButton();
        url = new javax.swing.JLabel();
        jlabelSQL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App [ID:?]");
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(235, 150));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("App");
        getContentPane().add(jLabel1);

        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniciar);

        jButtonDetener.setText("Detener");
        jButtonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetenerActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDetener);
        getContentPane().add(url);
        getContentPane().add(jlabelSQL);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        try {
            Pc usuario;
            
            // Hacer peticion al servlet y capturar el json para convertirlo a Pc usando
            // Pc usuario = gson.fromJson(string, Pc.class)
            
            Desktop.getDesktop().browse(new URI("http://" + ip + ":" + usuario.getPuertoPHP() + "/phpmyadmin"));
            url.setText("http://" + ip + ":" + usuario.getPuertoPHP() + "/phpmyadmin");
            jlabelSQL.setText("PuertoSQL: " + usuario.getPuertoSQL());
            this.setTitle("App [ID:" + usuario.getId() + "]");
        } catch (URISyntaxException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jButtonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetenerActionPerformed
        
        // Haccer post al servlet
        
        url.setText("");
        jlabelSQL.setText("");
        this.setTitle("App [ID:?]");
    }//GEN-LAST:event_jButtonDetenerActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetener;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabelSQL;
    private javax.swing.JLabel url;
    // End of variables declaration//GEN-END:variables
}
