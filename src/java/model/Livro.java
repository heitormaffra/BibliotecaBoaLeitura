/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author heitormaffra
 */
public class Livro {
    
    private int cd_livro;
    private String nm_livro;
    private String nm_autor_livro;

    public Livro() {
    }

    public Livro(int cd_livro, String nm_livro, String nm_autor_livro) {
        super();
        this.cd_livro = cd_livro;
        this.nm_livro = nm_livro;
        this.nm_autor_livro = nm_autor_livro;
    }

    
    
    public int getCd_livro() {
        return cd_livro;
    }

    public void setCd_livro(int cd_livro) {
        this.cd_livro = cd_livro;
    }

    public String getNm_livro() {
        return nm_livro;
    }

    public void setNm_livro(String nm_livro) {
        this.nm_livro = nm_livro;
    }

    public String getNm_autor_livro() {
        return nm_autor_livro;
    }

    public void setNm_autor_livro(String nm_autor_livro) {
        this.nm_autor_livro = nm_autor_livro;
    }
    
    
    
}
