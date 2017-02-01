/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosxml;

/**
 *
 * @author lukin
 */
public class frmMatrizAdjacencia extends javax.swing.JFrame {

    /**
     * Creates new form frmMatrizIncidencia
     */
    Grafo grafo = new Grafo();

    public frmMatrizAdjacencia() {
        initComponents();
        this.grafo = GraphSession.getGrafo();

        int indice = 0;
        Grafo g = grafo;
        int[][] v = g.matrizAdjacencia(g);
        for (int i = 0; i <= (g.getVertices().size() - 1); i++) {
            if (indice == 0) {
                jtaMatrizAdjacencia.append("Vertices/vertices\n    ");
                indice = 1;
                jtaMatrizAdjacencia.append("  " + g.getVertices().get(i).getId());
            } else {
                jtaMatrizAdjacencia.append("  " + g.getVertices().get(i).getId());
            }
        }
        for (int j = 0; j <= (g.getVertices().size() - 1); j++) {
            jtaMatrizAdjacencia.append("\n");
            jtaMatrizAdjacencia.append("  " + g.getVertices().get(j).getId());
            for (int i = 0; i <= (g.getVertices().size() - 1); i++) {
                jtaMatrizAdjacencia.append("  " + v[j][i]);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMatrizAdjacencia = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtaMatrizAdjacencia.setEditable(false);
        jtaMatrizAdjacencia.setColumns(20);
        jtaMatrizAdjacencia.setRows(5);
        jScrollPane1.setViewportView(jtaMatrizAdjacencia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(frmMatrizAdjacencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMatrizAdjacencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMatrizAdjacencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMatrizAdjacencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Grafo grafo = null;
                new frmMatrizIncidencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaMatrizAdjacencia;
    // End of variables declaration//GEN-END:variables
}
