package gestionstation;

import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PanelFacture extends javax.swing.JPanel {

    private DefaultTableModel df;
    private FacturesMapper dbm;

    public PanelFacture() {
        initComponents();
        dbm = new FacturesMapper();
        displayFactures();
        
            tblFactures.getSelectionModel().addListSelectionListener(e -> {
            int row =  tblFactures.getSelectedRow();
            if (row >= 0) {
                TextId.setText(tblFactures.getValueAt(row, 0).toString());
                TextNom.setText(tblFactures.getValueAt(row, 1).toString());
                TextProduit.setText(tblFactures.getValueAt(row, 2).toString());
                TextQuantite.setText(tblFactures.getValueAt(row, 3).toString());
                TextPrix.setText(tblFactures.getValueAt(row, 4).toString());
                TextDate.setText(tblFactures.getValueAt(row, 5).toString());
            }
        });

    }

    public void displayFactures() {

        List<Factures> factures = dbm.getFactures();
        df = new DefaultTableModel(new Object[]{"id", "nom","produit", "quantite","prix", "date"}, 0);
        for (Factures f : factures) {
            Object[] row = {f.getId(), f.getNom(),f.getProduit(), f.getQuantite(),f.getPrix(), f.getDate()};
            df.addRow(row);

        }
         tblFactures.setModel(df);

    }

    
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        TextNom = new javax.swing.JTextField();
        TextProduit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextQuantite = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextPrix = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TextDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactures = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextFacture = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(18, 54, 98));

        jLabel1.setForeground(new java.awt.Color(18, 54, 98));
        jLabel1.setText("ID");

        jLabel2.setForeground(new java.awt.Color(18, 54, 98));
        jLabel2.setText("Nom");

        jLabel3.setForeground(new java.awt.Color(18, 54, 98));
        jLabel3.setText("Produit");

        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });

        TextNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(18, 54, 98));
        jLabel4.setText("Quantite");

        TextQuantite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextQuantiteActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(18, 54, 98));
        jLabel5.setText("Prix");

        TextPrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPrixActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(18, 54, 98));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(18, 54, 98));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(18, 54, 98));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(18, 54, 98));
        jLabel6.setText("date");

        tblFactures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblFactures);

        jButton1.setBackground(new java.awt.Color(18, 54, 98));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextFacture.setColumns(20);
        TextFacture.setForeground(new java.awt.Color(0, 51, 51));
        TextFacture.setRows(5);
        TextFacture.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(TextFacture);

        jPanel1.setBackground(new java.awt.Color(18, 54, 98));
        jPanel1.setPreferredSize(new java.awt.Dimension(1172, 42));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FACTURE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setBackground(new java.awt.Color(18, 54, 98));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 54, 98));
        jLabel7.setText("AJOUTER LA FACTURE");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 54, 98));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LISTE DES FACTURES");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 54, 98));
        jLabel10.setText("LA FACTURE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(461, 461, 461)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TextPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TextQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(24, 24, 24)))))
                        .addGap(22, 22, 22)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextPrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPrixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPrixActionPerformed

    private void TextNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomActionPerformed

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    private void TextQuantiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextQuantiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextQuantiteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String nom = TextNom.getText();
        String produit = TextProduit.getText();
        int quantite = Integer.parseInt(TextQuantite.getText());
        int prix = Integer.parseInt(TextPrix.getText());
        String date = TextDate.getText();
        if (nom.equals("")) {
            JOptionPane.showMessageDialog(this, "Nom doit etre rempli");

        } else {

            Factures f = new Factures(nom, produit, quantite, prix, date);
            if (dbm.addFactures(f) > 0) {
                JOptionPane.showMessageDialog(this, "Insertion reussie");
                clearFields();
                displayFactures();
               // retireStock();
                
            }
            
        }
     
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(TextId.getText());
        String nom = TextNom.getText();
        String produit = TextProduit.getText();
        int quantite = Integer.parseInt(TextQuantite.getText());
        int prix = Integer.parseInt(TextPrix.getText());
        String date = TextDate.getText();
        if (nom.equals("")) {
            JOptionPane.showMessageDialog(this, "Nom doit etre rempli");

        } else {
            Factures f = new Factures(id,nom,produit,quantite,prix,date);
            if (dbm.updateFactures(f) > 0) {
                JOptionPane.showMessageDialog(this, "Modification reussie");
                clearFields();
                displayFactures();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int id = Integer.valueOf(TextId.getText());

        if (id == 0) {
            JOptionPane.showMessageDialog(this, "l'ID doit etre rempli");

        } else {
            int confirmation;
            confirmation = JOptionPane.showConfirmDialog(this, "voulez-vous vraiment supprimer cette colonne?", "confirmation",
                    JOptionPane.YES_NO_OPTION);
            String nom = TextNom.getText();
            String produit = TextProduit.getText();
            int quantite = Integer.valueOf(TextQuantite.getText());
            int prix =Integer.valueOf(TextPrix.getText());
            String date = TextDate.getText();
            Factures f = new Factures(id,nom,produit,prix,quantite,date);
            if (confirmation == JOptionPane.YES_NO_OPTION) {
                if (dbm.deleteFactures(f) > 0) {
                    JOptionPane.showMessageDialog(this, "Modification reussie");
                    clearFields();
                    displayFactures();
                }
            } else {
                JOptionPane.showMessageDialog(this, "suppression annulee");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      String id=TextId.getText();
      String nom=TextNom.getText();
      String produit=TextProduit.getText();
      String  prix=TextPrix.getText();;
      String quantite=TextQuantite.getText();;
      String date=TextDate.getText();;
     
      String Facture="****************Facture***********"+"\n";
      Facture+="\nN0            :"+id+"\n";
       Facture+="\nNOM          :"+nom+"\n";
        Facture+="\nPRODUIT    :"+produit+"\n";
         Facture+="\nQUANTITE   :"+quantite+"\n";
          Facture+="\nPRIX         :"+prix+"\n";
           Facture+="\nDATE        :"+date+"\n";
            Facture+="\nMERCI POUR VOTRE VISITE!";
            Facture+="\n";
            Facture+="\n*****************A BIENTOT!***********";
            TextFacture.setText(Facture);
            
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearFields() {

        TextNom.setText("");
        TextQuantite.setText("");
        TextDate.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextDate;
    private javax.swing.JTextArea TextFacture;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextNom;
    private javax.swing.JTextField TextPrix;
    private javax.swing.JTextField TextProduit;
    private javax.swing.JTextField TextQuantite;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblFactures;
    // End of variables declaration//GEN-END:variables

}
