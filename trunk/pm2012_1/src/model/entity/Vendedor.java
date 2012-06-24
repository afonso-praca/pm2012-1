/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author Taís
 */
public class Vendedor extends BaseEntity {
    
	private String Codigo;
	private String Nome;
	private char Categoria;
        
        public Vendedor() {
            
        }

        public Vendedor(String Codigo, String Nome, char Categoria) {
            this.Codigo = Codigo;
            this.Nome = Nome;
            this.Categoria = Categoria;
        }
        
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public char getCategoria() {
		return Categoria;
	}
	public void setCategoria(char categoria) {
		Categoria = categoria;
	}
}


