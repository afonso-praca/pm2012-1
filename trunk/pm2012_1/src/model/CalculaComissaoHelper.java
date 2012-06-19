/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.entity.Comissao;
import model.entity.Preco;
import model.entity.Venda;
import model.entity.Vendedor;

public class CalculaComissaoHelper {
	
	public List<Comissao> SelecionaValoresParaAComissao(
			List<Venda> vendasDoMes, List<Preco> precos,
			List<Vendedor> vendedores, String mes) {		
		
		//Para mapear o vendedor (codigo de vendedor) e comissao
		HashMap<String,Comissao> comissoesMap = new HashMap<String,Comissao>();
		
		Preco precoCorrente = GetPrecoAtual(precos, mes);			
	
		HashMap<String, Vendedor> Vendedoresmap = MapVendedores(vendedores);		
		
		//Soma comissao de cada vendedor
		for (Venda _venda: vendasDoMes){

			Comissao comissao = new Comissao();
			
			//Se ja houver comissao inserida para o vendedor
			if (comissoesMap.containsKey(_venda.getCodigoVendedor())){
				
				comissao = comissoesMap.get(_venda.getCodigoVendedor());
			}
			else{
				comissao.setMes(mes);
				
				comissao.setVendedor(Vendedoresmap.get(_venda.getCodigoVendedor()));				
			}
			
			comissao.setSumTotalVendidoProdutoA(_venda.getQuantidadePA() * precoCorrente.getPrecoPA());
			comissao.setSumTotalVendidoProdutoB(_venda.getQuantidadePB() * precoCorrente.getPrecoPB());
			comissao.setSumTotalVendidoProdutoC(_venda.getQuantidadePC() * precoCorrente.getPrecoPC());	

			//Insere valores atualizados para calculo posterior de comissao
			comissoesMap.put(_venda.getCodigoVendedor(),comissao);
		}
		
		ArrayList<Comissao> comissoesComValores = new ArrayList<Comissao>(comissoesMap.values());
		
		return comissoesComValores;
		
	}

	public HashMap<String, Vendedor> MapVendedores(List<Vendedor> vendedores) {
		HashMap<String, Vendedor> Vendedoresmap = new HashMap<String, Vendedor>();
		for (Vendedor _vendedor: vendedores)
			Vendedoresmap.put(_vendedor.getCodigo(), _vendedor);
		return Vendedoresmap;
	}

	public Preco GetPrecoAtual(List<Preco> precos, String mes) {
		Preco precoCorrente = new Preco();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		
		for (Preco _preco: precos){			
			if (Integer.parseInt(sdf.format(_preco.getData())) <= (Integer.parseInt(mes)))				
				precoCorrente = _preco;			
		}
		return precoCorrente;
	}

	public List<Venda> SelecionaVendasDoMes(List<Venda> vendas, String mes) {
		// TODO Auto-generated method stub
		
		List<Venda> vendasDoMes = new ArrayList<Venda>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		
		for (Venda _venda: vendas){
			
			if (sdf.format(_venda.getData()).equals(mes)){
				vendasDoMes.add(_venda);
			}
			
		}
		
		return vendasDoMes;
	}


}

