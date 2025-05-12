package gestionstation;

import java.sql.Connection;//etablir la connection
import java.sql.SQLException;//pour le cas des  erreurs liee a SQL
import java.sql.PreparedStatement;//execution des requetes SQL
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FacturesMapper {

    private Connection con = null;
    private ResultSet rs;
    private PreparedStatement pstmt = null;

    public FacturesMapper() {
        con = new DatabaseConfig1().getCon();
    }

    public int addFactures(Factures f) {
      
        String req = "INSERT INTO factures(id,nom,produit,quantite,prix,date) values (?,?,?,?,?,?)";

       
try {
            pstmt = con.prepareStatement(req);
            pstmt.setInt(1, f.getId());
            pstmt.setString(2, f.getNom());
            pstmt.setString(3, f.getProduit());
            pstmt.setInt(4, f.getQuantite());
            pstmt.setInt(5, f.getPrix());
            pstmt.setString(6, f.getDate());
             

  
       
       
       
          return pstmt.executeUpdate();    
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;   
        
    }
    //UPDATE OPPERATION

    public int updateFactures(Factures f) {
        String req = "UPDATE factures SET nom=? , produit=?,Quantite=?,prix=?,Date=? WHERE id = ?";
        try {
            pstmt = con.prepareStatement(req);

            pstmt.setString(1, f.getNom());
            pstmt.setString(2, f.getProduit());
            pstmt.setInt(3, f.getQuantite());
            pstmt.setInt(4, f.getPrix());
            pstmt.setString(5, f.getDate());
            pstmt.setInt(6, f.getId());
            return pstmt.executeUpdate();  //retourne le nombre de ligne affecte

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public int deleteFactures(Factures f) {
        String req = " DELETE FROM factures where id =?";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setInt(1, f.getId());
            return pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public List<Factures> getFactures() {
        List<Factures> factures = new ArrayList<>();
        String req = "SELECT * FROM factures";
        try {
            pstmt = con.prepareStatement(req);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String produit = rs.getString("produit");
                int quantite = rs.getInt("quantite");
                int prix = rs.getInt("prix");
                String date = rs.getString("date");
                Factures f = new Factures(id, nom, produit, quantite, prix, date);
                factures.add(f);

            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return factures;
    }


public int retireStock(Factures f)
{
    String req = "UPDATE produits SET quantite = quantite - ? WHERE nom = ? AND quantite >= ?";
    try
    {
               //Retire du stock  boolean 
          
       pstmt = con.prepareStatement(req);
       pstmt.setInt(1, f.getQuantiteARetirer());
        pstmt.setString(2,f.getNomProduit() );
       pstmt.setInt(3, f.getQuantiteARetirer());
        int lignesAffectees = pstmt.executeUpdate();  
        return pstmt.executeUpdate();  
    }
          
            
         catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
}
}
