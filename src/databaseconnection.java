
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tahmi
 */
public class databaseconnection {
    final static String JDBC="com.mysql.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/student";
    final static String USER = "root";
    final static String PASS = "";
    public static Connection connection(){
        try{
            Class.forName(JDBC);
            return DriverManager.getConnection(DB_URL,USER,PASS);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    }
