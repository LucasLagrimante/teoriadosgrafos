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
public class frmAbout extends javax.swing.JFrame {

    /**
     * Creates new form frmAbout
     */
    public frmAbout() {
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

        lblAbout = new javax.swing.JLabel();
        lblDev = new javax.swing.JLabel();
        lblDev1 = new javax.swing.JLabel();
        lblDev2 = new javax.swing.JLabel();
        lblDev3 = new javax.swing.JLabel();
        lblDev4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAbout.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblAbout.setText("Sobre");
        lblAbout.setName("lblAbout"); // NOI18N

        lblDev.setText("Desenvolvido por:");
        lblDev.setName("lblDev"); // NOI18N

        lblDev1.setText("Lucas Lagrimante");
        lblDev1.setName("lblDev1"); // NOI18N

        lblDev2.setText("Ramon Souza");

        lblDev3.setText("Kaio Costa");

        lblDev4.setText("Victor Duque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDev2)
                    .addComponent(lblDev3)
                    .addComponent(lblDev4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(lblAbout))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(lblDev)
                            .addGap(47, 47, 47)
                            .addComponent(lblDev1))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblAbout)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDev)
                    .addComponent(lblDev1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDev4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDev2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDev3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(frmAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAbout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblDev;
    private javax.swing.JLabel lblDev1;
    private javax.swing.JLabel lblDev2;
    private javax.swing.JLabel lblDev3;
    private javax.swing.JLabel lblDev4;
    // End of variables declaration//GEN-END:variables
}
