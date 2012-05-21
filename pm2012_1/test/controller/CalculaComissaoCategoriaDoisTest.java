/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import controller.CalculaComissaoCategoriaDois;
import controller.CalculaComissaoCategoriaUm;
import model.Comissao;

/**
 *
 * @author Taís
 */
import controller.CalculaComissaoCategoriaDois;
import controller.CalculaComissaoCategoriaDois;
import controller.CalculaComissaoCategoriaUm;
import model.Comissao;

public class CalculaComissaoCategoriaDoisTest extends CalculaComissaoTesteBase{


	Comissao comissao;
	
	@Before
        @Override
	public void setUp() throws Exception{
		super.setUp();
		comissao = new Comissao();
		comissao.setMes("03");
		comissao.setVendedor(Vendedores.get(1));
		
	}
	
	@Test
	public void DeveSerPossivelCalcularUmaComissao() {
		
		comissao.setTotalVendidoProdutoA(1500);
		comissao.setTotalVendidoProdutoB(2000);
		comissao.setTotalVendidoProdutoC(1500);
		
		CalculaComissaoCategoriaDois calculador = new CalculaComissaoCategoriaDois();
		
		calculador.CalculaComissao(comissao);
		
		assertEquals(1500, comissao.getComissao(),0.0);
		
	}

}
