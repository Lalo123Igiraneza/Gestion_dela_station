
package gestionstation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList; 
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class UserMapper {
      private Connection con = null;
    private ResultSet rs;
      private PreparedStatement pstmt = null; 
      
       public   UserMapper() {
 con = new DatabaseConfig1().getCon();
}  
      
  public int addUser(User u){
  String req="INSERT INTO utilisateur(id,nom,prenom,email,password,telephone,) values (?,?,?,?,?,?)";  
    try {
            pstmt = con.prepareStatement(req);
            pstmt.setInt(1, u.getId());
            pstmt.setString(2, u.getNom());
            pstmt.setString(3, u.getPrenom());
            pstmt.setString(4, u.getEmail());
            pstmt.setString(5, u.getPassword());
             pstmt.setString(6, u.getTelephone());
            return pstmt.executeUpdate(); 

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
}      
       
  public int updateUser(User u) {
        String req = "UPDATE utilisateur SET nom=? , prenom=?,email=?,password=? telephone=? WHERE id = ?";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setString(1, u.getNom());
            pstmt.setString(2, u.getPrenom());
              pstmt.setString(3, u.getEmail());
            pstmt.setString(4, u.getPassword());
            pstmt.setString(5, u.getTelephone());
            pstmt.setInt(6, u.getId());
            return pstmt.executeUpdate();  

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
      public int deleteUser(User u) {
        String req = " DELETE FROM utilisateur where id =?";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setInt(1, u.getId());
            return pstmt.executeUpdate();  

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
      
   public User chercherParId(int id) {
   User user = null;
    try {
       
        String req = "SELECT nom, prenom, email, password, telephone FROM utilisateurs WHERE id = ?";
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            user = new User(
                id,
                rs.getString("nom"),
                rs.getString("prenom"),
                rs.getString("email"),
                rs.getString("password"),
                rs.getString("telephone")
            );
            
        }
        rs.close();
        pstmt.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return user;

    }
    
    public List<User> getUser(){
        List<User> user = new ArrayList<>();
        String req = "SELECT * FROM utilisateur";
        try {
            pstmt = con.prepareStatement(req);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String email=rs.getNString("email");
                String password=rs.getNString("password");
                 String telephone=rs.getNString("telephone");
                User u = new User(id, nom, prenom,email,password,telephone);
                user.add(u); 

            }
     } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return user;
    }
    
    
    
    //la connection
    public User login(String email,String password)
    {  
        User u=null;
   
    String  req="SELECT FROM utilisateur  WHERE email=? AND password=?";
          
         try
         {   
                
              
               PreparedStatement pstmt =con.prepareStatement(req);
                pstmt = con.prepareStatement(req);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next())
           {
                u=new User();
                   
                 u.setNom(rs.getString("nom"));
                u.setEmail( rs.getString("email")); 
                   u.setPassword(rs.getString("password")) ; }
              
           
        }
         catch(SQLException e)
                 {
                  System.out.println(e.getMessage());
                 }
    
                return u;
    }}