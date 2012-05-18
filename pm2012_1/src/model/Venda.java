/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Taís
 */
public class Venda {
    
	private String mes;
	private String codigoVendedor;
	private int quantidadePA;
	private int quantidadePB;
	private int quantidadePC;

    public Venda(String mes, String codigoVendedor, int quantidadePA, int quantidadePB, int quantidadePC) {
        this.mes = mes;
        this.codigoVendedor = codigoVendedor;
        this.quantidadePA = quantidadePA;
        this.quantidadePB = quantidadePB;
        this.quantidadePC = quantidadePC;
    }



    @Override
    public String toString() {
        return "Venda{" + "Mes=" + mes + ", CodigoVendedor=" + codigoVendedor + ", QuantidadePA=" + quantidadePA + ", QuantidadePB=" + quantidadePB + ", QuantidadePC=" + quantidadePC + '}';
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getQuantidadePA() {
        return quantidadePA;
    }

    public void setQuantidadePA(int quantidadePA) {
        this.quantidadePA = quantidadePA;
    }

    public int getQuantidadePB() {
        return quantidadePB;
    }

    public void setQuantidadePB(int quantidadePB) {
        this.quantidadePB = quantidadePB;
    }

    public int getQuantidadePC() {
        return quantidadePC;
    }

    public void setQuantidadePC(int quantidadePC) {
        this.quantidadePC = quantidadePC;
    }
	
    
        
	
	
}
