package classes;
import javax.swing.JOptionPane;

public class MainScreen extends javax.swing.JFrame {
    public MainScreen() {
        initComponents();
        deltaLbl.setVisible(false);
        x1Lbl.setVisible(false);
        x2Lbl.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstTerm = new javax.swing.JSpinner();
        secondTerm = new javax.swing.JSpinner();
        thirdTerm = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calcButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblSecondTerm1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSecondTerm2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblFirstTerm1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblThirdTerm = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblFirstTerm2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        deltaResult = new javax.swing.JLabel();
        deltaLbl = new javax.swing.JLabel();
        x1Lbl = new javax.swing.JLabel();
        x1Result = new javax.swing.JLabel();
        x2Lbl = new javax.swing.JLabel();
        x2Result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        firstTerm.setModel(new javax.swing.SpinnerNumberModel());
        firstTerm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        firstTerm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                firstTermStateChanged(evt);
            }
        });

        secondTerm.setModel(new javax.swing.SpinnerNumberModel());
        secondTerm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                secondTermStateChanged(evt);
            }
        });

        thirdTerm.setModel(new javax.swing.SpinnerNumberModel());
        thirdTerm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                thirdTermStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Find The Roots Of A Second Degree Equation</html>");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("<html> x<sup>2</sup> +</html>");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("x +");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("=   0");

        calcButton.setText("Calculate");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        cleanButton.setText("Clean");
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("x = ( -");

        lblSecondTerm1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSecondTerm1.setForeground(new java.awt.Color(255, 0, 0));
        lblSecondTerm1.setText("b");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("<html>&plusmn; &radic;</html>");

        lblSecondTerm2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSecondTerm2.setForeground(new java.awt.Color(255, 0, 0));
        lblSecondTerm2.setText("b");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("<html><sup>2</sup></html>");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("-   4  *");

        lblFirstTerm1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFirstTerm1.setForeground(new java.awt.Color(255, 0, 0));
        lblFirstTerm1.setText("a");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("*");

        lblThirdTerm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblThirdTerm.setForeground(new java.awt.Color(255, 0, 0));
        lblThirdTerm.setText("c");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText(") / ( 2 *");

        lblFirstTerm2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFirstTerm2.setForeground(new java.awt.Color(255, 0, 0));
        lblFirstTerm2.setText("a");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText(")");

        deltaResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        deltaLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deltaLbl.setText("<html>&Delta; = </html> ");

        x1Lbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        x1Lbl.setText("<html>x<sup>I</sup> = </html>");

        x1Result.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        x2Lbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        x2Lbl.setText("<html>x<sup>II</sup> = </html>");

        x2Result.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(firstTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secondTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(calcButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(x1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(x1Result))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(x2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2Result))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSecondTerm1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSecondTerm2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFirstTerm1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deltaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deltaResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblThirdTerm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFirstTerm2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcButton)
                    .addComponent(cleanButton)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSecondTerm1)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSecondTerm2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(lblFirstTerm1)
                    .addComponent(jLabel12)
                    .addComponent(lblThirdTerm)
                    .addComponent(jLabel5)
                    .addComponent(lblFirstTerm2)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deltaResult, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deltaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x1Result))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2Result))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        int valueFirstTerm=(int) firstTerm.getValue(),valueSecondTerm=(int) secondTerm.getValue(),
                valueThirdTerm=(int) thirdTerm.getValue();
        deltaLbl.setVisible(true);
        deltaResult.setVisible(true);
        int delta=(int) Math.pow(valueSecondTerm,2)-4*valueFirstTerm*valueThirdTerm;
        deltaResult.setText(Integer.toString(delta));
        if(delta<0 || valueFirstTerm==0) deltaResult.setText(deltaResult.getText()+" (incalculable roots)");
        else{
            double x1=(-valueSecondTerm+Math.sqrt(delta))/(2*valueFirstTerm),x2=(-valueSecondTerm-Math.sqrt(delta))/(2*valueFirstTerm);
            x1Result.setText(String.format("%.2f",x1));
            x2Result.setText(String.format("%.2f",x2));
            x1Lbl.setVisible(true);
            x2Lbl.setVisible(true);
            x1Result.setVisible(true);
            x2Result.setVisible(true);
        }
    }//GEN-LAST:event_calcButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        JOptionPane.showMessageDialog(rootPane,"<html><strong>Thanks for using it!</strong></html>","Finishing...", 1);
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void firstTermStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_firstTermStateChanged
        String valueTermA=firstTerm.getValue().toString();
        lblFirstTerm1.setText(valueTermA);
        lblFirstTerm2.setText(valueTermA);
    }//GEN-LAST:event_firstTermStateChanged

    private void secondTermStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_secondTermStateChanged
        String valueTermB=secondTerm.getValue().toString();
        lblSecondTerm1.setText(valueTermB);
        lblSecondTerm2.setText(valueTermB);
    }//GEN-LAST:event_secondTermStateChanged

    private void thirdTermStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_thirdTermStateChanged
        String valueTermC=thirdTerm.getValue().toString();
        lblThirdTerm.setText(valueTermC);
    }//GEN-LAST:event_thirdTermStateChanged

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        firstTerm.setValue(0);
        secondTerm.setValue(0);
        thirdTerm.setValue(0);
        lblFirstTerm1.setText("a");
        lblFirstTerm2.setText("a");
        lblSecondTerm1.setText("b");
        lblSecondTerm2.setText("b");
        lblThirdTerm.setText("c");
        deltaLbl.setVisible(false);
        deltaResult.setVisible(false);
        x1Lbl.setVisible(false);
        x2Lbl.setVisible(false);
        x1Result.setVisible(false);
        x2Result.setVisible(false);
    }//GEN-LAST:event_cleanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcButton;
    private javax.swing.JButton cleanButton;
    private javax.swing.JLabel deltaLbl;
    private javax.swing.JLabel deltaResult;
    private javax.swing.JButton exitButton;
    private javax.swing.JSpinner firstTerm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFirstTerm1;
    private javax.swing.JLabel lblFirstTerm2;
    private javax.swing.JLabel lblSecondTerm1;
    private javax.swing.JLabel lblSecondTerm2;
    private javax.swing.JLabel lblThirdTerm;
    private javax.swing.JSpinner secondTerm;
    private javax.swing.JSpinner thirdTerm;
    private javax.swing.JLabel x1Lbl;
    private javax.swing.JLabel x1Result;
    private javax.swing.JLabel x2Lbl;
    private javax.swing.JLabel x2Result;
    // End of variables declaration//GEN-END:variables
}
