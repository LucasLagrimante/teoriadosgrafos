/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Aresta;
import model.Grafo;
import model.Vertice;

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

        jpnRepresentacoes = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnMatrizIncidencia = new javax.swing.JButton();
        btnMatrizAdjacencia = new javax.swing.JButton();
        btnListaAdjacencia = new javax.swing.JButton();
        btnConjunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jpnRepresentacoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        lblTitulo.setText("Representações");

        javax.swing.GroupLayout jpnRepresentacoesLayout = new javax.swing.GroupLayout(jpnRepresentacoes);
        jpnRepresentacoes.setLayout(jpnRepresentacoesLayout);
        jpnRepresentacoesLayout.setHorizontalGroup(
            jpnRepresentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRepresentacoesLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(77, 77, 77))
        );
        jpnRepresentacoesLayout.setVerticalGroup(
            jpnRepresentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRepresentacoesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitulo)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnMatrizIncidencia.setText("Matriz Incidência");
        btnMatrizIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizIncidenciaActionPerformed(evt);
            }
        });

        btnMatrizAdjacencia.setText("Matriz Adjacência");
        btnMatrizAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizAdjacenciaActionPerformed(evt);
            }
        });

        btnListaAdjacencia.setText("Lista Adjacencia");
        btnListaAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAdjacenciaActionPerformed(evt);
            }
        });

        btnConjunto.setText("Conjunto");
        btnConjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConjuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnRepresentacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMatrizIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMatrizAdjacencia, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnListaAdjacencia, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(btnConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnRepresentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMatrizIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btnListaAdjacencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMatrizAdjacencia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMatrizIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizIncidenciaActionPerformed
        
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
    
        
    }//GEN-LAST:event_btnMatrizIncidenciaActionPerformed

    private void btnMatrizAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizAdjacenciaActionPerformed
        
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
        
    }//GEN-LAST:event_btnMatrizAdjacenciaActionPerformed

    private void btnListaAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAdjacenciaActionPerformed
        ArrayList<ArrayList> listaAdjacencia = grafo.listaAdjacencia(grafo);
        for (int i = 0; i < listaAdjacencia.size(); i++) {
            ArrayList<String> lista = listaAdjacencia.get(i);
            System.out.print("\n");
            for (int j = 0; j < lista.size(); j++) {
                System.out.print(lista.get(j) + "--->");
                if (j == (lista.size() - 1)) {
                    System.out.print("null");
                }
            }
    }//GEN-LAST:event_btnListaAdjacenciaActionPerformed
    }
    
    private void btnConjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConjuntoActionPerformed
        for (Vertice v : grafo.getVertices()) {
            System.out.print("\nVertices: " + v.getId());
        }
        
        for (Aresta a : grafo.getArestas()) {
            System.out.print("\nAresta: ->" + a.getId());
            System.out.print(" Vertices: " + a.getSource() + "  " + a.getTarget());
        }
    }//GEN-LAST:event_btnConjuntoActionPerformed

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
    private javax.swing.JButton btnConjunto;
    private javax.swing.JButton btnListaAdjacencia;
    private javax.swing.JButton btnMatrizAdjacencia;
    private javax.swing.JButton btnMatrizIncidencia;
    private javax.swing.JPanel jpnRepresentacoes;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
