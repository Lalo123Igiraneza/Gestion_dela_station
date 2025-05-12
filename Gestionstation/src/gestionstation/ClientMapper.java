
package gestionstation;



import java.sql.Connection;//etablir la connection
import java.sql.SQLException;//pour le cas des  erreurs liee a SQL
import java.sql.PreparedStatement;//execution des requetes SQL
import java.util.ArrayList; 
import java.util.List;
import java.sql.ResultSet;//presente les resultats des requetes SQL executees et parcour des donnes retournees

public class ClientMapper {
    private Connection con = null;
    private ResultSet rs;
      private PreparedStatement pstmt = null;
 public   ClientMapper() {
 con = new DatabaseConfig1().getCon();
}  


public int addClient(Client c){
  String req="INSERT INTO clients(nom,prenom,id_st) values (?,?,?)";  
    try {
            pstmt = con.prepareStatement(req);
            pstmt.setString(1, c.getNom());
            pstmt.setString(2, c.getPrenom());
            pstmt.setInt(3, c.getId());
            return pstmt.executeUpdate();  //retourne le nombre de ligne affecte

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
} 
  //UPDATE OPPERATION
    public int updateClient(Client c) {
        String req = "UPDATE clients SET nom=? , prenom=? WHERE id = ?";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setString(1, c.getNom());
            pstmt.setString(2, c.getPrenom());
            pstmt.setInt(3, c.getId());
            return pstmt.executeUpdate();  

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
        public int deleteClient(Client c) {
        String req = " DELETE FROM clients where id =?";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setInt(1, c.getId());
            return pstmt.executeUpdate();  

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
    

    public List<Client> getClients(){
        List<Client> clients = new ArrayList<>();
        String req = "SELECT * FROM clients";
        try {
            pstmt = con.prepareStatement(req);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom_cl = rs.getString("nom");
                String prenom_cl = rs.getString("prenom");

                Client c = new Client(id, nom_cl, prenom_cl);
                clients.add(c); 

            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return clients;
    }
}
