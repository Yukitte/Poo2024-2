/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import controle.Div;
import controle.Media;
import controle.Mult;
import controle.Operação;
import controle.Soma;
import controle.Sub;


public class Tela extends javax.swing.JFrame {
    public static double calcule(Operação op, double valor1, double valor2){
    return op.calcular(valor1, valor2);
}
    /**
     * Creates new form Tela
     */
    public Tela() {
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
        jLabel2 = new javax.swing.JLabel();
        jBsomar = new javax.swing.JButton();
        jLresultado = new javax.swing.JLabel();
        jTnota1 = new javax.swing.JTextField();
        jTnota2 = new javax.swing.JTextField();
        jBsub = new javax.swing.JButton();
        jBmult = new javax.swing.JButton();
        jBdiv = new javax.swing.JButton();
        jBmedia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nota 1 :");

        jLabel2.setText("Nota 2:");

        jBsomar.setText("+");
        jBsomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsomarActionPerformed(evt);
            }
        });

        jLresultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLresultado.setForeground(new java.awt.Color(255, 51, 51));
        jLresultado.setText("0.00");

        jTnota1.setColumns(4);
        jTnota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnota1ActionPerformed(evt);
            }
        });

        jTnota2.setColumns(4);
        jTnota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnota2ActionPerformed(evt);
            }
        });

        jBsub.setText("-");
        jBsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubActionPerformed(evt);
            }
        });

        jBmult.setText("*");
        jBmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmultActionPerformed(evt);
            }
        });

        jBdiv.setText("/");
        jBdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdivActionPerformed(evt);
            }
        });

        jBmedia.setText("Media");
        jBmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmediaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLresultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBmedia)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBsomar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBsub)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBmult))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBdiv)
                            .addComponent(jTnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(140, 178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsomar)
                    .addComponent(jBdiv)
                    .addComponent(jBmult)
                    .addComponent(jBsub))
                .addGap(18, 18, 18)
                .addComponent(jBmedia)
                .addGap(17, 17, 17)
                .addComponent(jLresultado)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTnota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnota1ActionPerformed

    private void jTnota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnota2ActionPerformed

    private void jBsomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsomarActionPerformed
    
    double pvalor1 = Double.valueOf(jTnota1.getText());
    double pvalor2 = Double.valueOf(jTnota2.getText());
    jLresultado.setText("Soma : "+ calcule(new Soma(),pvalor1,pvalor2));
    // TODO add your handling code here:
    }//GEN-LAST:event_jBsomarActionPerformed

    private void jBsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubActionPerformed
        // TODO add your handling code here:
        double pvalor1 = Double.valueOf(jTnota1.getText());
        double pvalor2 = Double.valueOf(jTnota2.getText());
        jLresultado.setText("Subtração : "+ calcule(new Sub(),pvalor1,pvalor2));
    }//GEN-LAST:event_jBsubActionPerformed

    private void jBmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmultActionPerformed
            // TODO add your handling code here:
        double pvalor1 = Double.valueOf(jTnota1.getText());
        double pvalor2 = Double.valueOf(jTnota2.getText());
        jLresultado.setText("Multiplicação : "+ calcule(new Mult(),pvalor1,pvalor2));
    }//GEN-LAST:event_jBmultActionPerformed

    private void jBdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdivActionPerformed
        // TODO add your handling code here:
        double pvalor1 = Double.valueOf(jTnota1.getText());
        double pvalor2 = Double.valueOf(jTnota2.getText());
        jLresultado.setText("Divisão : "+ calcule(new Div(),pvalor1,pvalor2));
    }//GEN-LAST:event_jBdivActionPerformed

    private void jBmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmediaActionPerformed
        // TODO add your handling code here:
        double pvalor1 = Double.valueOf(jTnota1.getText());
        double pvalor2 = Double.valueOf(jTnota2.getText());
        jLresultado.setText("Media : "+ calcule(new Media(),pvalor1,pvalor2));
    }//GEN-LAST:event_jBmediaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdiv;
    private javax.swing.JButton jBmedia;
    private javax.swing.JButton jBmult;
    private javax.swing.JButton jBsomar;
    private javax.swing.JButton jBsub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JTextField jTnota1;
    private javax.swing.JTextField jTnota2;
    // End of variables declaration//GEN-END:variables
}
