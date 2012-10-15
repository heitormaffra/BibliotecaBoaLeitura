/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author heitormaffra
 */
public class ClienteEstadoInativo implements ClienteEstado {

    @Override
    public String getEstado() {
        return "Cliente em Estado Inativo";
    }

    @Override
    public boolean mudarStatus() {
        return true;
    }
}
