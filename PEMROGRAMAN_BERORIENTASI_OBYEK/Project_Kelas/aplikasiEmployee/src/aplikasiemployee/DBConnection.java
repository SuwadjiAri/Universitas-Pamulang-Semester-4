package aplikasiemployee;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arifs
 */
public class DBConnection {
    
    public static Connection Connect(){
        try {
            String host = "jdbc:mysql://localhost:3306/employees";
            String uName = "root";
            String uPass = "";
            Connection conn = DriverManager.getConnection(host, uName, uPass);
            return conn;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
