/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.CalculaComissaoCategoriaUm;
import model.entity.Comissao;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Taís
 */

public class CalculaComissaoCategoriaUmTest extends CalculaComissaoTesteBase{

    Comissao comissao;

    @Before
    @Override
    public void setUp() throws Exception{
        super.setUp();
        comissao = new Comissao();
        comissao.setMes("03");
        comissao.setVendedor(Vendedores.get(0));

    }

    @Test
    public void DeveSerPossivelCalcularUmaComissao() {
        
        comissao.setTotalVendidoProdutoA(400);
        comissao.setTotalVendidoProdutoB(1000);
        comissao.setTotalVendidoProdutoC(600);

        CalculaComissaoCategoriaUm calculador = new CalculaComissaoCategoriaUm();

        calculador.CalculaComissao(comissao);

        assertEquals(260, comissao.getComissao(),0.0);
    }

}
