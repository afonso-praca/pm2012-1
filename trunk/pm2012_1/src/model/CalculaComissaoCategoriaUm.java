/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Comissao;

public class CalculaComissaoCategoriaUm implements ICalculaComissao {

	@Override
	public void CalculaComissao(Comissao comissao) {
		
		double valorComissao = 0;
		
		double valorTotalVendas = comissao.getTotal();
		
		if (valorTotalVendas > 1800.00){
            valorComissao = ((valorTotalVendas - 1800) * 0.2 ) + 220;
         }else if((valorTotalVendas>1000.00) && (valorTotalVendas <= 1800.00)){
            valorComissao = ((valorTotalVendas - 1000) * 0.15 ) +  100;
         }else if ( valorTotalVendas <=1000.00){
            valorComissao = 100;
         }

		comissao.setComissao(valorComissao);

	}

}
