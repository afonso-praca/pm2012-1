/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pm2012_1;

import java.util.Date;

/**
 *
 * @author Taís
 */
public class Venda {
    
	private Date Data;
	private String CodigoVendedor;
	private int QuantidadePA;
	private int QuantidadePB;
	private int QuantidadePC;

    public Venda(Date Data, String CodigoVendedor, int QuantidadePA, int QuantidadePB, int QuantidadePC) {
        this.Data = Data;
        this.CodigoVendedor = CodigoVendedor;
        this.QuantidadePA = QuantidadePA;
        this.QuantidadePB = QuantidadePB;
        this.QuantidadePC = QuantidadePC;
    }

    @Override
    public String toString() {
        return "Venda{" + "Data=" + Data + ", CodigoVendedor=" + CodigoVendedor + ", QuantidadePA=" + QuantidadePA + ", QuantidadePB=" + QuantidadePB + ", QuantidadePC=" + QuantidadePC + '}';
    }
	
    
        
	
	public Date getData() {
		return Data;
	}
        
	public void setData(Date data) {
		Data = data;
	}
        
	public String getCodigoVendedor() {
		return CodigoVendedor;
	}
        
	public void setCodigoVendedor(String codigoVendedor) {
		CodigoVendedor = codigoVendedor;
	}
        
	public int getQuantidadePA() {
		return QuantidadePA;
	}
        
	public void setQuantidadePA(int quantidadePA) {
		QuantidadePA = quantidadePA;
	}
        
	public int getQuantidadePB() {
		return QuantidadePB;
	}
        
	public void setQuantidadePB(int quantidadePB) {
		QuantidadePB = quantidadePB;
	}
        
	public int getQuantidadePC() {
		return QuantidadePC;
	}
        
	public void setQuantidadePC(int quantidadePC) {
		QuantidadePC = quantidadePC;
	}
	

}
