
package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Livro;

/**
 *
 * @author heitormaffra
 */
public class LivroDAO {
    private static LivroDAO instance= new LivroDAO();
    
    private LivroDAO() {}
    
    public static LivroDAO getInstance() {
    return instance;
    }
    
     public void save(Livro livro) throws SQLException, ClassNotFoundException {
    Connection conn = null;
    Statement st  = null;

    try {
      conn = DataBaseLocator.getInstance().getConnection();
      st = conn.createStatement();
      st.execute("insert into livro (cd_livro, titulo_livro, nm_autor_livro)" +
        " values ('" + livro.getCd_livro() + "', '" + livro.getNm_livro()+ "', '" + livro.getNm_autor_livro() + "')");
      
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
