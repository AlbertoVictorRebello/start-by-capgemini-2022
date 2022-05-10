/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import projectsMonitor.model.Task;

/**
 *
 * @author albertovictorrebello
 */
public class TaskTableModel extends AbstractTableModel{
    String[] columns = {"Name", "Description", "Deadline","Completed", "Edit", "Delete"};
    List<Task>tasks = new ArrayList();
                

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3;
    }
    
    @Override
     public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         tasks.get(rowIndex).setCompleted((boolean) aValue);
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (tasks.isEmpty()) {
            return Object.class;
        }
        
        return this.getValueAt(0, columnIndex).getClass();
    } 

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();                
            case 1:
                return tasks.get(rowIndex).getDescription();                
            case 2:
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");                
                return df.format(tasks.get(rowIndex).getDeadline());                
            case 3:
                return tasks.get(rowIndex).isCompleted();                            
            case 4:
                return "";                
            case 5:
                return "";                
            default:
                return "No data returned.";
        }
        
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
