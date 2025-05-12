
package gestionstation;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class UserPanel extends javax.swing.JPanel {
    
 private UserMapper dbm;
   

    public UserPanel() {
        initComponents();
         dbm = new UserMapper();
 
      
        

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        TextNom = new javax.swing.JTextField();
        TextPrenom = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        ConnectionBtn = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TextPswd = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Displaybtn = new javax.swing.JButton();
        txtpswd = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 54, 98));
        jLabel1.setText("CHANGER UTULISATEUR");

        jLabel2.setText("Nom");

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel4.setText("password");

        jPanel1.setBackground(new java.awt.Color(18, 54, 98));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AJOUTER UN UTULISATEUR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel5)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jLabel6.setText("ID");

        jLabel7.setText("Prenom");

        jLabel8.setText("Nom");

        jLabel9.setText("Email");

        TextPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPrenomActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ConnectionBtn.setBackground(new java.awt.Color(18, 54, 98));
        ConnectionBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConnectionBtn.setText("SE CONNECTER");
        ConnectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectionBtnActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel11.setText("Password");

        TextPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPswdActionPerformed(evt);
            }
        });

        Searchbtn.setText("SEARCH");
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });

        jLabel12.setText("Tel");

        jPanel2.setBackground(new java.awt.Color(220, 226, 234));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 54, 98));
        jLabel10.setText("INFORMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel10)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Displaybtn.setText("DISPLAY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(TextNom, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(TextId)
                                    .addComponent(TextPrenom)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(btnSave)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnUpdate)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDelete)
                                        .addGap(42, 42, 42)
                                        .addComponent(Searchbtn)
                                        .addGap(33, 33, 33)
                                        .addComponent(Displaybtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel11)
                                                .addComponent(TextPswd, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                                .addComponent(txtTel)))
                                        .addGap(59, 59, 59))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(232, 232, 232)
                                        .addComponent(ConnectionBtn))
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpswd, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ConnectionBtn)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(Searchbtn)
                    .addComponent(Displaybtn))
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String nom = TextNom.getText();
        String prenom = TextPrenom.getText();
        String email = TextEmail.getText();
         String password  = TextPswd.getText();
         String telephone=txtTel.getText();

        if (nom.equals("")) {
            JOptionPane.showMessageDialog(this, "Nom doit etre rempli");

        } else {
            User u = new User(nom, prenom,email,password,telephone);
            if (dbm.addUser(u) > 0) {
                JOptionPane.showMessageDialog(this, "Insertion reussie");
                //clearFields();
                //displayClient();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
        String prenom = TextPrenom.getText();
        String email = TextEmail.getText();
         String password  = TextPswd.getText();
         String telephone=txtTel.getText();
            User u = new User(id, nom, prenom, email,password,telephone);
            
            if (confirmation == JOptionPane.YES_NO_OPTION) {
                if (dbm.deleteUser(u) > 0) {
                    JOptionPane.showMessageDialog(this, "Modification reussie");
                   clearFields();
//                    displayClient();
                }
            } else {
                JOptionPane.showMessageDialog(this, "suppression annulee");
            }
        } 
       
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void TextPswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPswdActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_TextPswdActionPerformed

    private void TextPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPrenomActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        int id = Integer.valueOf(TextId.getText());
        String nom = TextNom.getText();
        String prenom = TextPrenom.getText();
        String email=TextEmail.getText();
        String password=TextPswd.getText();
         String telephone=txtTel.getText();

        if (nom.equals("")) {
            JOptionPane.showMessageDialog(this, "Nom doit etre rempli");

        } else {
          User u = new User(id, nom, prenom,email,password,telephone);
            if (dbm.updateUser(u) > 0) {
                JOptionPane.showMessageDialog(this, "Modification reussie");
                clearFields();
//                displayClient();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:
        
    try {
        int id = Integer.parseInt(TextId.getText());
        UserMapper mapper=new UserMapper();
       User user =mapper.chercherParId(id);

        if (user != null) {
            txtNom.setText(user.getNom());
            TextPrenom.setText(user.getPrenom());
            txtEmail.setText(user.getEmail());
            TextPswd.setText(user.getPassword());
            txtTel.setText(user.getTelephone());
        } else {
            JOptionPane.showMessageDialog(this, "Utilisateur non trouvé");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID invalide");
    }

    }//GEN-LAST:event_SearchbtnActionPerformed

    private void ConnectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectionBtnActionPerformed
        // TODO add your handling code here:
        String nom = txtNom.getText();
        String email = txtEmail.getText();
        String password = new String(txtpswd.getPassword());

        if (!nom.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            Fenetreprincipale1 fenetre = new Fenetreprincipale1(nom,email);
            fenetre.setVisible(true);
            SwingUtilities.getWindowAncestor(UserPanel.this).dispose();
        } else {
            JOptionPane.showMessageDialog(UserPanel.this, "Veuillez remplir tous les champs.");
        }
    

//         try
//         {   
//               Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/gestion_de_la_station");    
//               String  req="SELECT FROM utilisateur  WHERE email=? AND password=?";
//               PreparedStatement pstmt =con.prepareStatement(req);
//                pstmt = con.prepareStatement(req);
//            pstmt.setString(1, email);
//            pstmt.setString(2, Password);
//           ResultSet rs=pstmt.executeQuery();
//          
//           {
//               JOptionPane.showMessageDialog(this, "coonection reussie!");}
//               else
//               {
//                      
//                       }
//               con.close();
//           
//         }
//         catch(SQLException e)
//                 {
//                   JOptionPane.showMessageDialog(this,"erreur" +e.getMessage());
//                 }
   
    }//GEN-LAST:event_ConnectionBtnActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

 private void clearFields() {
        TextId.setText("");
        TextNom.setText("");
        TextPrenom.setText("");
        TextEmail.setText("");
        TextPswd.setText("");
        txtTel.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConnectionBtn;
    private javax.swing.JButton Displaybtn;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextNom;
    private javax.swing.JTextField TextPrenom;
    private javax.swing.JTextField TextPswd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    private javax.swing.JPasswordField txtpswd;
    // End of variables declaration//GEN-END:variables
}
