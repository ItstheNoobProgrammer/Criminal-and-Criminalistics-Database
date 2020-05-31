/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacd;

/**
 *
 * @author Mukund R
 */
import java.sql.*;

public class Cacd {
        
    /**
     * @param args the command line arguments
     */
     public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));

            String url = "jdbc:mysql://localhost:3306/c?serverTimezone=UTC";
            // create a connection to the database
            conn = DriverManager.getConnection(url,"root","");
            
            System.out.println("Connection to SQLite has been established.");
            return conn;
            
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            System.out.println(e.getMessage());
            return null;
        }

    /**
     *
     * @param args
     */
     }
}