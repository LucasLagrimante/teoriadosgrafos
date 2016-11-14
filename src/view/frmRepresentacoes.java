/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Grafo;

/**
 *
 * @author Kaio
 */
public class frmRepresentacoes extends javax.swing.JDialog {

    Grafo grafo = new Grafo();
            
    public frmRepresentacoes(Grafo grafo) {
        initComponents();
        this.grafo = grafo;
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
        jLabel1 = new javax.swing.JLabel();
        jBMatrizIncidencia = new javax.swing.JButton();
        jBMatrizAdjacencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Representações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jBMatrizIncidencia.setText("Matriz Incidência");
        jBMatrizIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMatrizIncidenciaActionPerformed(evt);
            }
        });

        jBMatrizAdjacencia.setText("Matriz Adjacência");
        jBMatrizAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMatrizAdjacenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBMatrizAdjacencia)
                            .addComponent(jBMatrizIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jBMatrizIncidencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBMatrizAdjacencia)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBMatrizIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMatrizIncidenciaActionPerformed
        
        int indice = 0;
        Grafo g = grafo;
        int[][] v = g.matrizIncidencia(g);
        for (int i = 0; i <= (g.getArestas().size() - 1); i++) {
            if (indice == 0) {
                System.out.print("\nMatrizIncidencia   ");
                indice = 1;
                System.out.print("  " + g.getArestas().get(i).getId());
            } else {
                System.out.print("  " + g.getArestas().get(i).getId());
            }
        }
        for (int j = 0; j <= (g.getVertices().size() - 1); j++) {
            System.out.print("\n");
            System.out.print("                  " + g.getVertices().get(j).getId());
            for (int i = 0; i <= (g.getArestas().size() - 1); i++) {
                System.out.print("  " + v[j][i]);
            }
        }
    
        
    }//GEN-LAST:event_jBMatrizIncidenciaActionPerformed

    private void jBMatrizAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMatrizAdjacenciaActionPerformed
        
        int indice = 0;
        Grafo g = grafo;
        int[][] v = g.matrizAdjacencia(g);
        for (int i = 0; i <= (g.getVertices().size() - 1); i++) {
            if (indice == 0) {
                System.out.print("\nVertices/vertices   ");
                indice = 1;
                System.out.print("  " + g.getVertices().get(i).getId());
            } else {
                System.out.print(" " + g.getVertices().get(i).getId());
            }
        }
        for (int j = 0; j <= (g.getVertices().size() - 1); j++) {
            System.out.print("\n");
            System.out.print("                  " + g.getVertices().get(j).getId());
            for (int i = 0; i <= (g.getVertices().size() - 1); i++) {
                System.out.print("  " + v[j][i]);
            }
        }
        
    }//GEN-LAST:event_jBMatrizAdjacenciaActionPerformed

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
            java.util.logging.Logger.getLogger(frmRepresentacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRepresentacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRepresentacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRepresentacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Grafo grafo = null;
                new frmRepresentacoes(grafo).setVisible(true);
                    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBMatrizAdjacencia;
    private javax.swing.JButton jBMatrizIncidencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
