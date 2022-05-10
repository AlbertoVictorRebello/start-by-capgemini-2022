/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author alber
 */
public class ConnectionFactory {
    private final static String DRIVER = "com.mysql.jdbc.Driver";        
    private final static String URL = "jdbc:mysql://localhost:3306/projectsDb";
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
    
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        }catch(Exception ex) {
            throw new RuntimeException("Database connection closing error", ex);            
        }                
    }    
    
    public static void closeConnection(Connection connection, PreparedStatement statement) {
        try {
            if (connection != null) {
                connection.close();
            }
            
            if (statement != null) {
                statement.close();
            }
        }catch(Exception ex) {
            throw new RuntimeException("Database connection closing error", ex);            
        }                
    }    
    
    public static void closeConnection(Connection connection, PreparedStatement
            statement, ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            
            if (statement != null) {
                statement.close();
            }
            
            if (resultSet != null) {
                resultSet.close();
            }
            
            
        }catch(Exception ex) {
            throw new RuntimeException("Database connection closing error", ex);            
        }                
    }    
}

