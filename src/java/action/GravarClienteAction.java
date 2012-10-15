/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import persistence.ClienteDAO;

/**
 *
 * @author heitormaffra
 */
public class GravarClienteAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int codigo = Integer.parseInt(request.getParameter("txtCdCliente"));
        String nm_cliente = request.getParameter("txtNmCliente");
        String end_cliente = request.getParameter("txtEndCliente");
        String tel_cliente = request.getParameter("txtTelCliente");
        String email_cliente = request.getParameter("txtEmailCliente");
        
        if(codigo == 0 || nm_cliente.equals("")){
            response.sendRedirect("index.jsp");
        }
        
        else{
            Cliente cliente = new Cliente();
            cliente.setCodigo(codigo);
            cliente.setEmail_cliente(email_cliente);
            cliente.setEnd_cliente(end_cliente);
            cliente.setNm_cliente(nm_cliente);
            cliente.setTel_cliente(tel_cliente);
            try {
                ClienteDAO.getInstance().save(cliente);
            } catch (SQLException ex) {
                response.sendError(500, "Erro no Banco de Dados");
                Logger.getLogger(GravarClienteAction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravarClienteAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
