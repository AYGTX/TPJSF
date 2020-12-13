/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AYGTX
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    protected static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException {
        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:3306/";
        // Database name to access 
        String dbName = "demoprj";
        String dbUsername = "root";
        String dbPassword = "";

        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,
                dbUsername,
                dbPassword);
        return con;
    }

}
