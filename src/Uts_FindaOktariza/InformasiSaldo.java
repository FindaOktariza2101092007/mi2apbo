/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts_FindaOktariza;

/**
 *
 * @author LENOVO
 */
public class InformasiSaldo extends javax.swing.JFrame {

    /**
     * Creates new form InformasiSaldo
     */
    
    
    public InformasiSaldo() {  
        initComponents();
        InformasiSaldoModel saldo = new InformasiSaldoModel();
        saldoData.setText("Rp. "+saldo.getSaldo());
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
        saldoData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JUMLAH SALDO ANDA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(187, 113, 197, 22);

        saldoData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        saldoData.setForeground(new java.awt.Color(255, 255, 255));
        saldoData.setText("Rp.");
        jPanel1.add(saldoData);
        saldoData.setBounds(187, 144, 197, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 370);

        pack();
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
            java.util.logging.Logger.getLogger(InformasiSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformasiSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformasiSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformasiSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformasiSaldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel saldoData;
    // End of variables declaration//GEN-END:variables
}
