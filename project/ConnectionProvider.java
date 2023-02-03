/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author FASTY
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
     try
     {
        Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "Fasty@9196");
            return con;
     }
     catch(Exception e)
     {
         return null;
     }
    }
    
}
