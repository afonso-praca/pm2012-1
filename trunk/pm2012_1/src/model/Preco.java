/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Taís
 */
import java.util.Date;

public class Preco {

	private Date Data;
	private double PrecoPA;
	private double PrecoPB;
	private double PrecoPC;
	
	public Date getData() {
		return Data;
	}
	public void setData(Date data) {
		Data = data;
	}
	public double getPrecoPA() {
		return PrecoPA;
	}
	public void setPrecoPA(double precoPA) {
		PrecoPA = precoPA;
	}
	public double getPrecoPB() {
		return PrecoPB;
	}
	public void setPrecoPB(double precoPB) {
		PrecoPB = precoPB;
	}
	public double getPrecoPC() {
		return PrecoPC;
	}
	public void setPrecoPC(double precoPC) {
		PrecoPC = precoPC;
	}
	
}

