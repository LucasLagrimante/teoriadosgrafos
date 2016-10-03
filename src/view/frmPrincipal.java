/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author lukin
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        lblTitulo = new javax.swing.JLabel();
        lblArestas = new javax.swing.JLabel();
        lblVertices = new javax.swing.JLabel();
        txtArestas = new javax.swing.JTextField();
        txtVertices = new javax.swing.JTextField();
        btnGerar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setText("Gerador de Grafos");
        lblTitulo.setName("lblTItulo"); // NOI18N

        lblArestas.setText("Arestas:");
        lblArestas.setName("lblArestas"); // NOI18N

        lblVertices.setText("Vértices:");
        lblVertices.setName("lblVertices"); // NOI18N

        txtArestas.setName("txtArestas"); // NOI18N

        txtVertices.setName("txtVertices"); // NOI18N

        btnGerar.setText("Gerar");
        btnGerar.setName("btnGerar"); // NOI18N
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        btnAbrir.setText("Abrir Grafo em xml");
        btnAbrir.setName("btnAbrir"); // NOI18N

        btnAbout.setText("About");
        btnAbout.setName("btnAbout"); // NOI18N
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnAbrir)
                        .addGap(33, 33, 33)
                        .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnAbout)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVertices)
                        .addGap(18, 18, 18)
                        .addComponent(txtVertices))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblArestas)
                        .addGap(18, 18, 18)
                        .addComponent(txtArestas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArestas)
                    .addComponent(txtArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVertices)
                    .addComponent(txtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        frmGrafo fg = new frmGrafo();
        fg.setVisible(true);
        int x =10;
    }//GEN-LAST:event_btnGerarActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
       frmAbout fa = new frmAbout();
       fa.setVisible(true);
    }//GEN-LAST:event_btnAboutActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnGerar;
    private javax.swing.JLabel lblArestas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVertices;
    private javax.swing.JTextField txtArestas;
    private javax.swing.JTextField txtVertices;
    // End of variables declaration//GEN-END:variables
}
