/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author Taís
 */
public class Comissao extends BaseEntity {

	private String Mes;
	private Vendedor Vendedor;
	private double TotalVendidoProdutoA;
	private double TotalVendidoProdutoB;
	private double TotalVendidoProdutoC;
	private double Comissao;
	
	public String getMes() {
		return Mes;
	}
	public void setMes(String mes) {
		Mes = mes;
	}
	public Vendedor getVendedor() {
		return Vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		Vendedor = vendedor;
	}
	public double getTotalVendidoProdutoA() {
		return TotalVendidoProdutoA;
	}
	public void setTotalVendidoProdutoA(double totalVendidoProdutoA) {
		TotalVendidoProdutoA = totalVendidoProdutoA;
	}
	public void setSumTotalVendidoProdutoA(double totalVendidoProdutoA) {
		TotalVendidoProdutoA += totalVendidoProdutoA;
	}
	public double getTotalVendidoProdutoB() {
		return TotalVendidoProdutoB;
	}
	public void setTotalVendidoProdutoB(double totalVendidoProdutoB) {
		TotalVendidoProdutoB = totalVendidoProdutoB;
	}
	public double getTotalVendidoProdutoC() {
		return TotalVendidoProdutoC;
	}
	public void setTotalVendidoProdutoC(double totalVendidoProdutoC) {
		TotalVendidoProdutoC = totalVendidoProdutoC;
	}
	public double getTotal() {
		return TotalVendidoProdutoA + TotalVendidoProdutoB + TotalVendidoProdutoC;
	}
	
	public double getComissao() {
		return Comissao;
	}
	public void setComissao(double comissao) {
		Comissao = comissao;
	}
	public void setSumTotalVendidoProdutoB(double totalVendidoB) {
		TotalVendidoProdutoB+= totalVendidoB;
		
	}
	public void setSumTotalVendidoProdutoC(double totalVendidoC) {		
		TotalVendidoProdutoC+=totalVendidoC;		
	}
	
	
}

