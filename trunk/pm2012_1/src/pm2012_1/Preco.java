/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pm2012_1;

/**
 *
 * @author Taís
 */
public class Preco {
    
        String mes;
	private double PrecoPA;
	private double PrecoPB;
	private double PrecoPC;

        public Preco(String mes, double PrecoPA, double PrecoPB, double PrecoPC) {
            this.mes = mes;
            this.PrecoPA = PrecoPA;
            this.PrecoPB = PrecoPB;
            this.PrecoPC = PrecoPC;
    }

    @Override
        public String toString() {
            return "Preco{" + "Mes=" + mes + ", PrecoPA=" + PrecoPA + ", " + "PrecoPB=" + PrecoPB + ", PrecoPC=" + PrecoPC + "}";   
     }    
    
        public String getMes() {
                return mes;
        }

        public void setMes(String mes) {
                this.mes = mes;
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
