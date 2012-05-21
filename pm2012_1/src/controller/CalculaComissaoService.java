/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Comissao;
import model.Preco;
import model.Venda;
import model.Vendedor;

public class CalculaComissaoService {
	
	private CalculaComissaoHelper Helper;
	
	public CalculaComissaoService(){
		
		Helper = new CalculaComissaoHelper();
	}

	public List<Comissao> CalculaComissoes(String mes, List<Venda> vendas, List<Preco> precos, List<Vendedor> vendedores) {
		
		try{
			List<Venda> vendasDoMes = Helper.SelecionaVendasDoMes(vendas, mes);
			
			List<Comissao> comissaoACalcular = Helper.SelecionaValoresParaAComissao(vendasDoMes,precos,vendedores,mes);
			
			ICalculaComissao calculador;
			
			for (Comissao _comissao: comissaoACalcular){
				
				calculador= CalculaComissaoFacotry(_comissao.getVendedor().getCategoria()); 
				
				calculador.CalculaComissao(_comissao);
			}
			
			return comissaoACalcular;
		}
		catch(Exception e){
			
			return null;
		}
					
	}

	private ICalculaComissao CalculaComissaoFacotry(char categoria){
		
		if (categoria== '1'){
			return new CalculaComissaoCategoriaUm();
		}
		else if (categoria=='2'){
			return new CalculaComissaoCategoriaDois();
		}
		
	return null;

	}
	
	
	
}
