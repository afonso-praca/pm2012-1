/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author Taís
 */
import java.util.Date;

public class Venda extends BaseEntity{

	private Date Data;
	private String CodigoVendedor;
	private int QuantidadePA;
	private int QuantidadePB;
	private int QuantidadePC;
	
	
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
