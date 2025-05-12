
package gestionstation;
public class Fenetreprincipale1 extends javax.swing.JFrame {


    public Fenetreprincipale1(String nom,String email){// {
        initComponents(); 
         this.setResizable(false); 
        setLocationRelativeTo(null);
        lblNom.setText(nom);
        lblEmail.setText(email);
        
      }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnTableauBord = new javax.swing.JButton();
        btnProduits = new javax.swing.JButton();
        btnClients = new javax.swing.JButton();
        btnFacture = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnParametre = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(18, 54, 98));

        BtnTableauBord.setBackground(new java.awt.Color(18, 54, 98));
        BtnTableauBord.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnTableauBord.setForeground(new java.awt.Color(255, 255, 255));
        BtnTableauBord.setText("home");
        BtnTableauBord.setBorder(null);
        BtnTableauBord.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BtnTableauBord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTableauBordActionPerformed(evt);
            }
        });

        btnProduits.setBackground(new java.awt.Color(18, 54, 98));
        btnProduits.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProduits.setForeground(new java.awt.Color(255, 255, 255));
        btnProduits.setText("Stock");
        btnProduits.setBorder(null);
        btnProduits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduitsActionPerformed(evt);
            }
        });

        btnClients.setBackground(new java.awt.Color(18, 54, 98));
        btnClients.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClients.setForeground(new java.awt.Color(255, 255, 255));
        btnClients.setText("Clients");
        btnClients.setBorder(null);
        btnClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientsActionPerformed(evt);
            }
        });

        btnFacture.setBackground(new java.awt.Color(18, 54, 98));
        btnFacture.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFacture.setForeground(new java.awt.Color(255, 255, 255));
        btnFacture.setText("Facture");
        btnFacture.setBorder(null);
        btnFacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactureActionPerformed(evt);
            }
        });

        lblNom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNom.setForeground(new java.awt.Color(255, 255, 255));
        lblNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNom.setText("IGIRANEZA");

        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("lalo@gmail.com");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionstation/UserIcone.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        BtnParametre.setBackground(new java.awt.Color(18, 54, 98));
        BtnParametre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnParametre.setForeground(new java.awt.Color(255, 255, 255));
        BtnParametre.setText("Parametre");
        BtnParametre.setBorder(null);
        BtnParametre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnParametreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnTableauBord, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnProduits, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnParametre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFacture, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(384, 384, 384))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(BtnTableauBord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProduits, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(BtnParametre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTableauBordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTableauBordActionPerformed
        // TODO add your handling code here:
        
        jPanel2.removeAll();
        jPanel2.add(new PanelTableauBord());
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_BtnTableauBordActionPerformed

    private void btnProduitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduitsActionPerformed
        // TODO add your handling code here:
         jPanel2.removeAll();
        jPanel2.add(new PanelProduit());
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_btnProduitsActionPerformed

    private void btnClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientsActionPerformed
        // TODO add your handling code here:
         jPanel2.removeAll();
        jPanel2.add(new PanelClient());
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_btnClientsActionPerformed

    private void btnFactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactureActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(new PanelFacture());
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_btnFactureActionPerformed

    private void BtnParametreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnParametreActionPerformed
        // TODO add your handling code here:
        
         jPanel2.removeAll();
        jPanel2.add(new UserPanel());
        jPanel2.revalidate();
        jPanel2.repaint();
     
    }//GEN-LAST:event_BtnParametreActionPerformed

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
            java.util.logging.Logger.getLogger(Fenetreprincipale1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetreprincipale1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetreprincipale1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetreprincipale1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String nom="IGIRANEZA";
                String email="lalo@gmail.com";
                Fenetreprincipale1 fn=new Fenetreprincipale1(nom,email);
                fn.setVisible(true);
                PanelTableauBord Tb=new PanelTableauBord();
                        Tb.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnParametre;
    private javax.swing.JButton BtnTableauBord;
    private javax.swing.JButton btnClients;
    private javax.swing.JButton btnFacture;
    private javax.swing.JButton btnProduits;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNom;
    // End of variables declaration//GEN-END:variables
}
