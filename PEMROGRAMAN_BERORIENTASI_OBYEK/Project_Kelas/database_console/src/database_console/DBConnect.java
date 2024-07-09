/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database_console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author arifs
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String host = "jdbc:mysql://localhost:3306/employees";
            String uName = "root";
            String uPass = "";

            Connection con = DriverManager.getConnection(host, uName, uPass);
            
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM workers";
            ResultSet rs = stmt.executeQuery(SQL);
            
            while (rs.next()){
                int id_col = rs.getInt("ID");
                String first_name = rs.getString("First_Name");
                String last_name = rs.getString("Last_Name");
                String job = rs.getString("Job_Title");
                System.out.println(id_col + " " + first_name + " " + " " + last_name + " " + job);
            }
        }
        catch (SQLException err) {
            System.out.println( err.getMessage() );
        }
        
    }
    
}
