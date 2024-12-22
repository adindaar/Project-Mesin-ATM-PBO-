package Tampilan;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Menu_Utama extends javax.swing.JFrame {

    public Menu_Utama() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dana1 = new javax.swing.JButton();
        dana3 = new javax.swing.JButton();
        dana2 = new javax.swing.JButton();
        dana4 = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jumlahlain = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        transfer = new javax.swing.JRadioButton();
        setor = new javax.swing.JRadioButton();
        tariktunai = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELAMAT DATANG");

        dana1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dana1.setText("Rp. 300.000");
        dana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dana1ActionPerformed(evt);
            }
        });

        dana3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dana3.setText("Rp. 1.000.000");
        dana3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dana3ActionPerformed(evt);
            }
        });

        dana2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dana2.setText("Rp. 500.000");
        dana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dana2ActionPerformed(evt);
            }
        });

        dana4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dana4.setText("Rp. 2.000.000");
        dana4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dana4ActionPerformed(evt);
            }
        });

        kembali.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        jumlahlain.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jumlahlain.setText("Jumlah Lain");
        jumlahlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahlainActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Silahkan pilih nominal");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Silahkan pilih Menu");

        transfer.setBackground(new java.awt.Color(0, 51, 204));
        transfer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        transfer.setForeground(new java.awt.Color(255, 255, 255));
        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        setor.setBackground(new java.awt.Color(0, 51, 204));
        setor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setor.setForeground(new java.awt.Color(255, 255, 255));
        setor.setText("Setor");

        tariktunai.setBackground(new java.awt.Color(0, 51, 204));
        tariktunai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tariktunai.setForeground(new java.awt.Color(255, 255, 255));
        tariktunai.setText("Tarik Tunai");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dana1)
                                .addGap(18, 18, 18)
                                .addComponent(dana2)
                                .addGap(18, 18, 18)
                                .addComponent(dana3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dana4))
                            .addComponent(kembali)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jumlahlain))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(transfer)
                                        .addGap(91, 91, 91)
                                        .addComponent(setor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tariktunai)))
                                .addGap(71, 71, 71))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(62, 62, 62)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfer)
                    .addComponent(setor)
                    .addComponent(tariktunai))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dana1)
                    .addComponent(dana2)
                    .addComponent(dana3)
                    .addComponent(dana4))
                .addGap(32, 32, 32)
                .addComponent(jumlahlain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kembali)
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dana3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dana3ActionPerformed

        String nominal = evt.getActionCommand().toString();

        JOptionPane.showMessageDialog(this, "Transaksi berhasil\n\nJumlah : " + nominal);
    }//GEN-LAST:event_dana3ActionPerformed

    private void dana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dana2ActionPerformed
        String nominal = evt.getActionCommand().toString();

        JOptionPane.showMessageDialog(this, "Transaksi berhasil\n\nJumlah : " + nominal);
    }//GEN-LAST:event_dana2ActionPerformed

    private void dana4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dana4ActionPerformed
        String nominal = evt.getActionCommand().toString();

        JOptionPane.showMessageDialog(this, "Transaksi berhasil\n\nJumlah : " + nominal);
    }//GEN-LAST:event_dana4ActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        this.setVisible(false);
        new Landing().setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void jumlahlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahlainActionPerformed
        this.setVisible(false);
        new JumlahLain().setVisible(true);
    }//GEN-LAST:event_jumlahlainActionPerformed

    private void dana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dana1ActionPerformed
        String nominal = evt.getActionCommand().toString();

        JOptionPane.showMessageDialog(this, "Transaksi berhasil\n\nJumlah : " + nominal);
    }//GEN-LAST:event_dana1ActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dana1;
    private javax.swing.JButton dana2;
    private javax.swing.JButton dana3;
    private javax.swing.JButton dana4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jumlahlain;
    private javax.swing.JButton kembali;
    private javax.swing.JRadioButton setor;
    private javax.swing.JRadioButton tariktunai;
    private javax.swing.JRadioButton transfer;
    // End of variables declaration//GEN-END:variables
}
