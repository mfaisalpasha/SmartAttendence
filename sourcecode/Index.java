package attendance;

/**
  * @author FaisalPasha
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Index() {
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

        jButton1 = new javax.swing.JButton();
        addEmp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exCsv = new javax.swing.JButton();
        showStat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        addEmp.setText("Employee Section");
        addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpActionPerformed(evt);
            }
        });
        getContentPane().add(addEmp);
        addEmp.setBounds(250, 200, 170, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Smart Attendance");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 60, 320, 29);

        exCsv.setText("Export Attendance to CSV");
        exCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exCsvActionPerformed(evt);
            }
        });
        getContentPane().add(exCsv);
        exCsv.setBounds(230, 320, 210, 50);

        showStat.setText("Attendance Report");
        showStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStatActionPerformed(evt);
            }
        });
        getContentPane().add(showStat);
        showStat.setBounds(250, 260, 170, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("(c) diudivergent");
        jLabel3.setAutoscrolls(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 530, 120, 17);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Version 0.1 Beta");
        jLabel4.setAutoscrolls(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 500, 120, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpActionPerformed
        // TODO add your handling code here:
        AddEmploy ad= new AddEmploy();
        ad.setVisible(true);
    }//GEN-LAST:event_addEmpActionPerformed

    private void showStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStatActionPerformed
        // TODO add your handling code here:
        Report rBut= new Report();
        rBut.setVisible(true);
    }//GEN-LAST:event_showStatActionPerformed

    private void exCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exCsvActionPerformed
        // TODO add your handling code here:
        Export ex=new Export();
        ex.setVisible(true);
    }//GEN-LAST:event_exCsvActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmp;
    private javax.swing.JButton exCsv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton showStat;
    // End of variables declaration//GEN-END:variables
}
