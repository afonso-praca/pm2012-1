/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import model.Preco;
import model.Venda;
import model.Vendedor;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import controller.CalculaComissaoService;
import controller.CalculaComissaoService;
import Model.*;
import java.util.ArrayList;
import model.Comissao;

public class CalculaComissaoServiceTest extends CalculaComissaoTesteBase {
	

	@Test
	public void DeveSerPossivelCalcularComissaoParaVendasDeCategoriaUm() {
		
		//ARRANGE			
		
		String mes="03";
		
		List<Comissao> comissoesDeCadaVendedor = new ArrayList<Comissao>();
		
		CalculaComissaoService calculador = new CalculaComissaoService();
		
		//ACT
		
		comissoesDeCadaVendedor = calculador.CalculaComissoes(mes,Vendas,Precos,Vendedores);
		
		//ASSERT
		assertNotNull(comissoesDeCadaVendedor);
		assertEquals(comissoesDeCadaVendedor.size(), 2);
		assertEquals(2300.00, comissoesDeCadaVendedor.get(0).getComissao(),0.0);
	}

	@Test
	public void DeveSerPossivelCalcularComissaoParaVendasDeCategoriaDois() {
		
		//ARRANGE			
		
		String mes="03";
		
		List<Comissao> comissoesDeCadaVendedor = new ArrayList<Comissao>();
		
		CalculaComissaoService calculador = new CalculaComissaoService();
		
		//ACT
		
		comissoesDeCadaVendedor = calculador.CalculaComissoes(mes,Vendas,Precos,Vendedores);
		
		//ASSERT
		assertNotNull(comissoesDeCadaVendedor);
		assertEquals(comissoesDeCadaVendedor.size(), 2);
		assertEquals(1860, comissoesDeCadaVendedor.get(1).getComissao(),0.0);
	}
}
