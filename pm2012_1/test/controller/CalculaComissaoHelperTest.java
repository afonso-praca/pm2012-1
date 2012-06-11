/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Preco;
import model.Venda;
import model.Vendedor;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import model.CalculaComissaoHelper;
import model.CalculaComissaoHelper;
import model.Comissao;

public class CalculaComissaoHelperTest extends CalculaComissaoTesteBase{

	private CalculaComissaoHelper calculadorHelper;
	
	@Before
	public void Init() throws Exception{
		super.setUp();
		calculadorHelper = new CalculaComissaoHelper();
	}
	
	@Test
	public void SelecionaVendasDoMesTeste() {
		
		//ARRANGE		
		String mesParaSelecionar = "03";
		
		AdicionaUmaVendaAListaDeVendas("10/04/2011", "0020", 5, 10, 15); //Venda de outro mes sem ser o mes da busca
		
		//ACT	
		
		List<Venda> vendasActual = calculadorHelper.SelecionaVendasDoMes(Vendas, mesParaSelecionar);
		
		//ASSERT
		
		assertNotNull(vendasActual);
		assertEquals(3, vendasActual.size());		
		
	}
	
	@Test
	public void SelecionaValoresParaAComissaoTeste(){
		
		String mesParaSelecionar = "03";
		
		List<Comissao> comissoesACalcular = calculadorHelper.SelecionaValoresParaAComissao(Vendas, Precos, Vendedores,mesParaSelecionar);
		
		assertNotNull(comissoesACalcular);
		assertEquals(2, comissoesACalcular.size());
		
	}

	@Test
	public void DeveSerPossivelSelecionarValoresParaAComissaoComTotaisCorretos(){
		
		String mesParaSelecionar = "03";
				
		double valorTotalProdutoAVendedor0020Expected= 50*40.0;
		double valorTotalProdutoBVendedor0019Expected = 35*50;
		
		List<Comissao> comissoesACalcular = calculadorHelper.SelecionaValoresParaAComissao(Vendas, Precos, Vendedores,mesParaSelecionar);
		
		assertNotNull(comissoesACalcular);
		
		double totalVendedorAProdutoA = 0;
		double totalVendedorBProdutoB= 0;
		
		for (Comissao comissao : comissoesACalcular){
			
			if(comissao.getVendedor().getCodigo().equals("0020")){
				
				totalVendedorAProdutoA= comissao.getTotalVendidoProdutoA();
			}
			else if(comissao.getVendedor().getCodigo().equals("0019")){
				
				totalVendedorBProdutoB = comissao.getTotalVendidoProdutoB();				
			}			
		}
		
		assertEquals(valorTotalProdutoAVendedor0020Expected, totalVendedorAProdutoA, 0.0);
		assertEquals(valorTotalProdutoBVendedor0019Expected, totalVendedorBProdutoB, 0.0);
	}

	
}
