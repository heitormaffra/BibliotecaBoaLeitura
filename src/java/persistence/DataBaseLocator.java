/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author heitormaffra
 */
public class DataBaseLocator {
    
    private static DataBaseLocator instance = new DataBaseLocator();
    
    public static DataBaseLocator getInstance() {
        return instance;
    }
    
    /** Creates a new instance of DatabaseLocator */
    public Connection getConnection() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca_boa_leitura", "livraria", "123");
        return conn;
    }
}
