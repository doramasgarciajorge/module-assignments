package gui.dialogosCRUD.edicion;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objetos.Especialidad;

/*
------------------------------------------------------------
> MODULE-ASSIGNMENTS

- AUTHOR:     Doramas García Jorge
- EMAIL:      doramas.dev@pm.me
- GITHUB:     https://github.com/doramasgarciajorge
- REPOSITORY: https://github.com/doramasgarciajorge/module-assignments
------------------------------------------------------------
*/

public class editarEspecialidad extends javax.swing.JDialog {
    
    Especialidad espevieja;

    /**
     * Creates new form crearTurno
     */
    public editarEspecialidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public editarEspecialidad(java.awt.Frame parent, boolean modal, Especialidad espevieja) {
        super(parent, modal);
        initComponents();
        System.out.println(espevieja.toString());
        this.espevieja = espevieja;
        campoDescripcion.setText(espevieja.getDescripcion());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edición de familias profesionales");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Descripción:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(jLabel1, gridBagConstraints);

        campoDescripcion.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 10, 20);
        getContentPane().add(campoDescripcion, gridBagConstraints);

        botonCrear.setText("Editar familia profesional");
        botonCrear.setPreferredSize(new java.awt.Dimension(150, 30));
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 20, 20);
        getContentPane().add(botonCrear, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        if (campoDescripcion.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.");
        } else {
            try {
                System.out.println("AKIIIIIIIIIIIIIIIII" + String.valueOf(espevieja.getIdEspecialidad()));
                crud.EspecialidadesCRUD.actualizar(new objetos.Especialidad(campoDescripcion.getText()), String.valueOf(espevieja.getIdEspecialidad()));
                dispose();
                logica.LogicaTablas.actualizarTablasBaseDeDatos();
            } catch (SQLException ex) {
                Logger.getLogger(editarEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonCrearActionPerformed

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
            java.util.logging.Logger.getLogger(editarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                editarEspecialidad dialog = new editarEspecialidad(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonCrear;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
