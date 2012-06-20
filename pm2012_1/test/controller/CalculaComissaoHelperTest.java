/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.CalculaComissaoHelper;
import model.entity.Comissao;
import model.entity.Venda;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

        Assert.assertNotNull(vendasActual);
        Assert.assertEquals(3, vendasActual.size());
    }

    @Test
    public void SelecionaValoresParaAComissaoTeste(){

        String mesParaSelecionar = "03";

        List<Comissao> comissoesACalcular = calculadorHelper.SelecionaValoresParaAComissao(Vendas, Precos, Vendedores,mesParaSelecionar);

        Assert.assertNotNull(comissoesACalcular);
        Assert.assertEquals(2, comissoesACalcular.size());

    }

    @Test
    public void DeveSerPossivelSelecionarValoresParaAComissaoComTotaisCorretos(){

        String mesParaSelecionar = "03";

        double valorTotalProdutoAVendedor0020Expected= 50*40.0;
        double valorTotalProdutoBVendedor0019Expected = 35*50;

        List<Comissao> comissoesACalcular = calculadorHelper.SelecionaValoresParaAComissao(Vendas, Precos, Vendedores,mesParaSelecionar);

        Assert.assertNotNull(comissoesACalcular);

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

        Assert.assertEquals(valorTotalProdutoAVendedor0020Expected, totalVendedorAProdutoA, 0.0);
        Assert.assertEquals(valorTotalProdutoBVendedor0019Expected, totalVendedorBProdutoB, 0.0);
    }
}
