package shha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MooseMoose
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class Database {
    public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    public static String JDBC_URL;
    public static Connection connection;
    
    //Constructor
    //When we make an instance of the Database we need to connect to
    //the database
    public Database(String name) {        
        JDBC_URL = "jdbc:derby:" + name + ";";
        
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            //we're screwed if we get here
        }
        
        try {
            
             connection = DriverManager.getConnection(JDBC_URL);
            
        } catch (SQLException e) {
            //we're even more screwed if we're here
        }
        
    }
    
    public Database(String name, String create) {
        JDBC_URL = "jdbc:derby:" + name + ";create=true";
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            //we're screwed if we get here
        }
        
        try {
            
             connection = DriverManager.getConnection(JDBC_URL);
            
        } catch (SQLException e) {
            //we're even more screwed if we're here
        }
    }
    
    //Precondtion: The connection to the database was sucessful and the database
    //              is in a a ready state
    //Postcondition: A new table is created in the database 
    public void createTable(String tableName, String setOfStrings) {
        String query = "create table " + tableName + setOfStrings;
        try{
            connection.createStatement().execute(query); 
        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
            
        }
       
        
    }
    
    //Precondition: The table already exisits in the database
    //Postcondition: The table gets removed from the database
    public void dropTable(String tableName)  {
        
        try {
            
            connection.createStatement().execute("drop table " + tableName);
            
        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        }
        
    }
    
    public void dropDatabase(String dataBaseName) {
        String statement = "DROP DATABASE " + dataBaseName;
        
        try {
            connection.createStatement().execute(statement);
        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        }
    }
    
    //Precondition: The requested tableName already exists in the database
    //Postcondition: Values are added to the table
    public void addDataToTable(String tableName, String... setOfStrings){
        String sql;
        StringBuilder stringS = new StringBuilder();
        for(String s : setOfStrings) {
                stringS.append(s);
        }
        
        try {
            sql = "INSERT INTO " + tableName + "  " + stringS;
            connection.createStatement().execute(sql);
        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        }
        
    }
    
    //Precondition: The table exists and there is data in it
    //Postcondition: The method returns a ResultSet collection
    //              with all columns in the table
    public ResultSet selectAll(String tableName) throws SQLException {
        ResultSet results;
        results = connection.createStatement().executeQuery("Select * from " + tableName);
        return results;
    }
    
    
    public void printAll(String tableName) {
        String statement = "SELECT * From " + tableName;
        ResultSet results;
        
        try {
             results = connection.createStatement().executeQuery(statement);
             ResultSetMetaData resultSetMetaData = results.getMetaData();
             int coulmCount = resultSetMetaData.getColumnCount();
             
             for(int i = 1; i <= coulmCount; i++) {
			System.out.format("%20s", resultSetMetaData.getColumnName(i) + " |");
		}
                
                System.out.println("");
		
		while (results.next()) {
			for(int i =1; i <= coulmCount; i++) {
				System.out.format("%20s", results.getString(i) + " |");
                                
			}
                        System.out.println();
		}

        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        } 
        
    }
    
    public void removeAllFromTable(String tableName) {
        String statement = "TRUNCATE TABLE " + tableName;
        
        try {
            connection.createStatement().execute(statement);
        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        }
    }
    
    public ResultSet executeQuery(String query) throws SQLException {
        ResultSet results;
        results = connection.createStatement().executeQuery(query);
        return results;
    }    
}
