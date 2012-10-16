/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Cliente;

/**
 *
 * @author heitormaffra
 */
public class ClienteDAO {
    private static ClienteDAO instance= new ClienteDAO();
    
    private ClienteDAO() {}
    
    public static ClienteDAO getInstance() {
    return instance;
    }
    
     public void save(Cliente cliente) throws SQLException, ClassNotFoundException {
    Connection conn = null;
    Statement st  = null;

    try {
      conn = DataBaseLocator.getInstance().getConnection();
      st = conn.createStatement();
      st.execute("insert into cliente (codigo, nm_cliente, end_cliente, tel_cliente, email_cliente)" +
        " values ('" + cliente.getCodigo() + "', '" + cliente.getNm_cliente() + "', '" + cliente.getEnd_cliente() 
        + "', '" + cliente.getTel_cliente() + "', '" + cliente.getEmail_cliente() + "')");
      
    } catch(SQLException e) {
      throw e;
    } finally {
      closeResources(conn, st);
    }
  }
  public void closeResources(Connection conn, Statement st) throws SQLException {
    try {
      if(st!=null) {
            st.close();
        }
      if(conn!=null) {
            conn.close();
        }
      
    } catch(SQLException e) {
        throw e;
    }
  }
}
