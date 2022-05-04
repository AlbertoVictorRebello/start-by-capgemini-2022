/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alber
 */
public class ConnectionFactory {
    private final static String DRIVER = "com.mysql.jdbc.Driver";        
    private final static String URL = "jdbc:mysql://localhost:3306/projectsMonitor";
    private final static String USER = "root";
    private final static String PASS = "";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        }catch(Exception ex) {
            throw new RuntimeException("Database connection error", ex);
            
        }
        
        
    }
}
