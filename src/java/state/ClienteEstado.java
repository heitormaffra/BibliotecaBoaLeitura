/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author heitormaffra
 */
public interface ClienteEstado {
    
    /**
     *
     * @return Retorna em String o Status do Cliente. Inativo ou Ativo.
     */
    public String getEstado();
    
    /**
     *
     * @return estado boolean onde true é ativo e false é inativo
     */
    public boolean mudarStatus();
}
