/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectsMonitor.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import projectsMonitor.model.Project;
import projectsMonitor.model.Task;
import util.ConnectionFactory;

/**
 *
 * @author alber
 */
public class ProjectController {
    public void save(Project project) {
         String sql = "INSERT INTO projects ("
                + "name, "
                + "description, "
                + "createdAt) "

                 + "VALUES (?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);      
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
//            if (project.getUpdatedAt() != null) {   
//                statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
//            }else {
//                statement.setDate(4, new Date(project.getCreatedAt().getTime()));                
//            }
            
            statement.execute();
            
        }catch (Exception ex) {
            throw new RuntimeException("Project saving error" + ex.getMessage(), ex);             
        }finally {
            ConnectionFactory.closeConnection(connection, statement);            
        } 
        
    }
    
    public void update(Project project) {
        String sql = "UPDATE projects SET "                
                + "name = ?, "
                + "description = ?, "              
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());          
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            project.setUpdatedAt();
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5,project.getId());
            
            statement.execute();
            
        }catch (Exception ex) {
            throw new RuntimeException("Task updating error" + ex.getMessage(), ex);             
        }finally {
            ConnectionFactory.closeConnection(connection, statement);            
        }         
    }
    
    public void removeById(int idProject) {
        String sql = "DELETE FROM projects WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
                
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idProject);   
            statement.execute();
            
        }catch (Exception ex) {
            throw new RuntimeException("Project deletion error" + ex.getMessage(), ex);             
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }        
    }    
    
    public List<Project> getAll() {
       String sql = "SELECT * FROM projects";

       Connection connection = null;
       PreparedStatement statement = null;
       ResultSet resultSet = null;

       List<Project> projects = new ArrayList<Project>();

       try {
           connection = ConnectionFactory.getConnection();
           statement = connection.prepareStatement(sql);
           resultSet = statement.executeQuery();

           while(resultSet.next()) {
               Project project = new Project();
               project.setId(resultSet.getInt("id"));
               project.setName(resultSet.getString("name"));
               project.setDescription(resultSet.getString("description"));        
               project.setCreatedAt(resultSet.getDate("createdAt"));
               project.setUpdatedAt(resultSet.getDate("updatedAt"));
               projects.add(project);
           }

       }catch (Exception ex) {
           throw new RuntimeException("GetAll projects error" + ex.getMessage(), ex);             
       }finally {
           ConnectionFactory.closeConnection(connection, statement, resultSet);
       }        

       return projects;
    }
    
    public Project getProjectByName(String name) {
       String sql = "SELECT * FROM projects WHERE NAME = ?";  

       Connection connection = null;
       PreparedStatement statement = null;
       ResultSet resultSet = null;            
       

       try {
           connection = ConnectionFactory.getConnection();
           statement = connection.prepareStatement(sql);
           statement.setString(1, name);
           resultSet = statement.executeQuery();
           
           Project project = new Project();
           resultSet.next();
           project.setId(resultSet.getInt("id"));
           project.setName(resultSet.getString("name"));
           project.setDescription(resultSet.getString("description"));        
           project.setCreatedAt(resultSet.getDate("createdAt"));
           if (project.getUpdatedAt() != null) {   
                project.setUpdatedAt(resultSet.getDate("updatedAt")); 
            }
           return project;

       }catch (Exception ex) {
           throw new RuntimeException("GetAll projects error" + ex.getMessage(), ex);             
       }finally {
           ConnectionFactory.closeConnection(connection, statement, resultSet);
       }        

       
    }
//    public int getIdByName(String name) {
//       String sql = "SELECT id FROM projects WHERE NAME = ?";
//       int projectId;
//
//       Connection connection = null;
//       PreparedStatement statement = null;
//       ResultSet resultSet = null;
//
//       try {
//           connection = ConnectionFactory.getConnection();
//            statement = connection.prepareStatement(sql);     
//            
//            statement.setString(1, name);
//            statement.executeQuery();
//            projectId = resultSet.getInt("id");
//            
//        }catch (Exception ex) {
//            throw new RuntimeException("Project id search error" + ex.getMessage(), ex);             
//        }finally {
//            ConnectionFactory.closeConnection(connection, statement);            
//        } 
//        
//       return projectId;
//    }
       
}
