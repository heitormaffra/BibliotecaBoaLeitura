/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author heitormaffra
 */
public class ClienteEstadoAtivo implements ClienteEstado{

    @Override
    public String getEstado() {
        return "Cliente em Status Ativo";
    }

    @Override
    public boolean mudarStatus() {
        return false;
    }
    
}
