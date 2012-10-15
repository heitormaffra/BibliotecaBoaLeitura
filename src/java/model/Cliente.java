/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author heitormaffra
 */
public class Cliente {
    private int codigo;
    private String nm_cliente;
    private String end_cliente;
    private String tel_cliente;
    private String email_cliente;

    public Cliente() {
    }

    public Cliente(int codigo, String nm_cliente, String end_cliente, String tel_cliente, String email_cliente) {
        super();
        this.codigo = codigo;
        this.nm_cliente = nm_cliente;
        this.end_cliente = end_cliente;
        this.tel_cliente = tel_cliente;
        this.email_cliente = email_cliente;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNm_cliente() {
        return nm_cliente;
    }

    public void setNm_cliente(String nm_cliente) {
        this.nm_cliente = nm_cliente;
    }

    public String getEnd_cliente() {
        return end_cliente;
    }

    public void setEnd_cliente(String end_cliente) {
        this.end_cliente = end_cliente;
    }

    public String getTel_cliente() {
        return tel_cliente;
    }

    public void setTel_cliente(String tel_cliente) {
        this.tel_cliente = tel_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
    
    
    
}
