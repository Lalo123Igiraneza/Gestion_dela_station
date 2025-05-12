package gestionstation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/*
import java.util.logging.Level;
import java.util.logging.Logger;*/

public class DatabaseConfig1 {

    private Connection con = null;
    private final String url = "jdbc:mysql://localhost:3306/gestion_de_la_station"; 
    private final String user = "root";
    private final String password = "";

    public DatabaseConfig1() {
       
  

        try { 
            con = DriverManager.getConnection(url, user, password);
            System.out.println("connection to BD established");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }

}
