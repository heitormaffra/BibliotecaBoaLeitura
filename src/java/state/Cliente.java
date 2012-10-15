/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author heitormaffra
 */
public class Cliente {
    private model.Cliente nomeCliente;
    private ClienteEstado estado;

    public Cliente() {
        this.estado = new ClienteEstadoAtivo();
    }

    public String getNomeCliente() {
        return nomeCliente.getNm_cliente();
    }

    public ClienteEstado getEstado() {
        return estado;
    }

    public void setEstado(ClienteEstado estado) {
        this.estado = estado;
    }
    
    public boolean inativar(){
        return estado.mudarStatus();
    }  
    
    public String getNomeEstado(){
        return estado.getEstado();
    }
}