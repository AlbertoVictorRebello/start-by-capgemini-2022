/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectsMonitor.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import projectsMonitor.model.Task;
import util.ConnectionFactory;

/**
 *
 * @author alber
 */
public class TaskController {
    public void save(Task task) {
        String sql = "INSERT INTO tasks ("
                + "project_id, "
                + "name, "
                + "description, "
                + "notes, "
                + "completed, "
                + "deadline, "
                + "createdAt) "
//                + "updatedAt) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getProjectId());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, false);  
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
//            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            
            statement.execute();
            
        }catch (Exception ex) {
            throw new RuntimeException("Task saving error" + ex.getMessage(), ex);             
        }finally {
            ConnectionFactory.closeConnection(connection, statement);            
        } 
    }
    
    public void update(Task task) {
        String sql = "UPDATE tasks SET "
                + "name = ?, "
                + "description = ?, "
                + "notes = ?, "
                + "completed = ?, "
                + "deadline = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ? AND project_id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, task.getName());
            statement.setString(2, task.getDescription());
            statement.setString(3, task.getNotes());
            statement.setBoolean(4, task.isCompleted());
            statement.setDate(5, new Date(task.getDeadline().getTime()));
            statement.setDate(6, new Date(task.getCreatedAt().getTime()));
            task.setUpdatedAt();
            statement.setDate(7, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(8,task.getId());
            statement.setInt(9,task.getProjectId());
            
            statement.execute();
            
        }catch (Exception ex) {
            throw new RuntimeException("Task updating error" + ex.getMessage(), ex);             
        }finally {
            ConnectionFactory.closeConnection(connection, statement);            
        }         
    }
    
    public void removeById(int idProject, int idTask) {
        String sql = "DELETE FROM tasks WHERE project_id = ? AND id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
                
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idProject);
            statement.setInt(2, idTask);
            statement.execute();
            
        }catch (Exception ex) {
            throw new RuntimeException("Task deletion error" + ex.getMessage(), ex);             
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public List<Task> getAll(int idProject) {
        String sql = "SELECT * FROM tasks WHERE PROJECT_ID = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Task> tasks = new ArrayList<Task>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idProject);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setProjectId(resultSet.getInt("project_id"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
//                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                task.setUpdatedAt();
                tasks.add(task);
            }
            
        }catch (Exception ex) {
            throw new RuntimeException("GetAll tasks error" + ex.getMessage(), ex);             
        }finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
        
        return tasks;
    }
    
}
