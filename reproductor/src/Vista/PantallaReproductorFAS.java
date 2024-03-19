
package Vista;

import Controlador.Reproductor;
import Modelo.Cancion;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PantallaReproductorFAS extends javax.swing.JFrame {

    private DefaultListModel modelo = new DefaultListModel();
    private Reproductor reproductor;
    private Timer tiempo;
    private TimerTask task;
    private int speed = 1000;
    private File arch;
    public PantallaReproductorFAS() {

        initComponents();
        this.setTitle("FASReproductor");

       
        this.setLocationRelativeTo(null);
        reproductor = new Reproductor();

        arch = null;
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de audio MP3 (*.mp3)", "mp3");
        this.elegirArchivo.setFileFilter(filter);
        this.elegirArchivo.setAcceptAllFileFilterUsed(false);
        this.elegirArchivo.setMultiSelectionEnabled(true);
    }

    private void btn_cambiar_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiar_adelanteActionPerformed
        reproductor.buscar_sig();
        this.l_cancion.setText(reproductor.getCancionActual().toString());


    }//GEN-LAST:event_btn_cambiar_adelanteActionPerformed

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed
        if (this.jList1.getSelectedValue() != null) {
            if (reproductor.getEstado() == 0) {

                this.btn_play.setText("||");
                reproductor.setEstado(1);
                Cancion cancion = (Cancion) this.jList1.getSelectedValue();
                if (cancion == null) {
                    cancion = (Cancion) modelo.getElementAt(0);
                }
                reproductor.reproducir(cancion);
                this.l_cancion.setText("Reproduciendo " + reproductor.getCancionActual().toString());
                startAnimation();
            } else {
                if (reproductor.getEstado() == 1) {

                    this.btn_play.setText(">");
                    reproductor.setEstado(2);
                    reproductor.pausar();
                } else {

                    this.btn_play.setText("||");
                    reproductor.setEstado(1);
                    reproductor.continuar();

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, Seleccione una canción");
        }


    }//GEN-LAST:event_btn_playActionPerformed
    public void startAnimation() {
        tiempo = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                int act = (int) reproductor.get_duracionActual();
                int total = (int) reproductor.get_duracionTotal();
                if (act == total) {
                    stopAnimation();
                } else
                {
                    slider_cancion.setMaximum(total);
                    slider_cancion.setValue(act);

                }
            }
        };
        tiempo.schedule(task, 0, speed);
    }

    public void stopAnimation() {
        tiempo.cancel();
        task.cancel();
    }


    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        File ruta[];
        int estadoJC = elegirArchivo.showOpenDialog(null);
        if (estadoJC == JFileChooser.APPROVE_OPTION) {

            ruta = elegirArchivo.getSelectedFiles();
            try {
                // TODO add your handling code here:
                Modelo.Archivo.cargar_canciones(reproductor, ruta);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PantallaReproductorFAS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        rellenar_jlist();
        if (arch != null) {

        }        // TODO add your handling code here:
    }

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {
        modelo.removeAllElements();
        reproductor.borrar();
        reproductor.parar();
        l_cancion.setText("");
        this.btn_play.setText(">");
    }
    private void btn_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopActionPerformed
        reproductor.parar();

        this.l_cancion.setText("");
        this.btn_play.setText(">");
        reproductor.setEstado(0);
    }
    private void slider_cancionCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_slider_cancionCaretPositionChanged
       int pos = slider_cancion.getValue();
        reproductor.ir_a_posicion(pos);
    }//GEN-LAST:event_slider_cancionCaretPositionChanged

    private void slider_cancionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_slider_cancionPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_slider_cancionPropertyChange

    private void btn_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarActionPerformed
        Cancion c = (Cancion) jList1.getSelectedValue();
        reproductor.eliminar_cancion(c);
        modelo.removeElement(c);
        if (c == reproductor.getCancionActual()) {
            reproductor.parar();
        }
    }//GEN-LAST:event_btn_quitarActionPerformed

    private void btn_cambiar_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiar_atrasActionPerformed

        reproductor.buscar_ant();
        this.l_cancion.setText(reproductor.getCancionActual().toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cambiar_atrasActionPerformed

    private void slider_cancionAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_slider_cancionAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_slider_cancionAncestorMoved

    private void slider_cancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider_cancionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_slider_cancionMouseClicked

    public void rellenar_jlist() {

        Cancion aux;
        Iterator<Cancion> it = reproductor.get_playlist().iterator();
        modelo.removeAllElements();
        while (it.hasNext()) {
            aux = it.next();
            modelo.addElement(aux);
        }

    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(PantallaReproductorFAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaReproductorFAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaReproductorFAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaReproductorFAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaReproductorFAS().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cambiar_adelante;
    private javax.swing.JButton btn_cambiar_atras;
    private javax.swing.JButton btn_play;
    private javax.swing.JButton btn_quitar;
    private javax.swing.JButton btn_stop;
    private javax.swing.JFileChooser elegirArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_cancion;
    private javax.swing.JSlider slider_cancion;
}
