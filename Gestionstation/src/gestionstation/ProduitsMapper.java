
package gestionstation;

import java.sql.Connection;//etablir la connection
import java.sql.SQLException;//pour le cas des  erreurs liee a SQL
import java.sql.PreparedStatement;//execution des requetes SQL
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
  
public class ProduitsMapper {
 
    private Connection con = null;
    private ResultSet rs;
      private PreparedStatement pstmt = null; 
    
    public   ProduitsMapper() {
 con = new DatabaseConfig1().getCon();
}  


public int addProduits(Produits p){
  String req="INSERT INTO produits(id,nom,quantite,date) values (?,?,?,?)";  
    try {
            pstmt = con.prepareStatement(req);
            pstmt.setInt(1, p.getId());
            pstmt.setString(2, p.getNom());
            pstmt.setInt(3, p.getQuantite());
            pstmt.setString(4, p.getDate());
            return pstmt.executeUpdate();  //retourne le nombre de ligne affecte

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
} 
  //UPDATE OPPERATION
    public int updateProduits(Produits p) {
//        String req = "INSERT  INTO personne (nom , prenon) value('"+p.getName()+"','"+p.getSurname()+"')";
        String req = "UPDATE produits SET nom=? , Quantite=?,Date=? WHERE id = ?";
        try {
            pstmt = con.prepareStatement(req);
            
            pstmt.setString(1, p.getNom());
            pstmt.setInt(2, p.getQuantite());
            pstmt.setString(3, p.getDate());
             pstmt.setInt(4, p.getId());
            return pstmt.executeUpdate();  //retourne le nombre de ligne affecte

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
        public int deleteProduits(Produits p) {
        String req = " DELETE FROM produits where id =?";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setInt(1, p.getId());
            return pstmt.executeUpdate();  

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
    

    public List<Produits> getProduits(){
        List<Produits> produits = new ArrayList<>();
        String req = "SELECT * FROM Produits";
        try {
            pstmt = con.prepareStatement(req);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                int quantite = rs.getInt("quantite");
                 String date=rs.getString("date");
                Produits p = new Produits(id, nom, quantite,date);
                produits.add(p); 

            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return produits;
    }
    //recuperation du stock apres l'enregistrement
    public  int getStockTotal(String nomProduit)
    {
        int total=0;
        String req= "select SUM(Quantite)as total FROM produits where  nom=?";
        try{
            pstmt=con.prepareStatement(req);
            pstmt.setString(1,nomProduit);
            ResultSet rs= pstmt.executeQuery();
            if(rs.next())
            {
                total=rs.getInt("total");
            }
            
            rs.close();
            
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        
     return total;   
    }
    
    //update du stock apres l'enregistrement de la facture
    
    public int updateStock(String nomProduit,int nouveauStock)
    {
        String req="UPDATE produits set quantite=? where nom=? ";
        try(PreparedStatement pstmt=con.prepareStatement(req))
        {
           pstmt.setInt(1,nouveauStock);
            pstmt.setString(2,nomProduit);
            return pstmt.executeUpdate();
        }
        catch(SQLException ex)
        {
            System.out.println("erreur lors de la mise a jour du stock:"+ex.getMessage());
        }
        return 0;
    }
    

    
}

