/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Taís
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.entity.Preco;
import model.entity.Venda;
import model.entity.Vendedor;
import org.junit.Before;


public class CalculaComissaoTesteBase {

	protected List<Venda> Vendas;
	protected List<Preco> Precos;
	protected List<Vendedor> Vendedores;

	@Before
	public void setUp() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Vendas = new ArrayList<Venda>();
		
		AdicionaUmaVendaAListaDeVendas("10/03/2011", "0020", 10, 30, 50);
		
		AdicionaUmaVendaAListaDeVendas("10/03/2011","0019",15,35,55);
		
		AdicionaUmaVendaAListaDeVendas("11/03/2011","0020",40,20,60);		
		
		Preco preco = new Preco();
		preco.setData(sdf.parse("10/02/2011"));
		preco.setPrecoPA(40.00);
		preco.setPrecoPB(50.00);
		preco.setPrecoPC(70.00);
		
		Precos = new ArrayList<Preco>();
		
		Precos.add(preco);
		
		preco = new Preco();
		preco.setData(sdf.parse("20/05/2011"));
		preco.setPrecoPA(20.00);
		preco.setPrecoPB(35.00);
		preco.setPrecoPC(80.00);
		
		Precos.add(preco);
		
		Vendedor vendedor = new Vendedor();
		vendedor.setCategoria('1');
		vendedor.setCodigo("0020");
		vendedor.setNome("MANOEL DA SILVA");		
		
		Vendedores = new ArrayList<Vendedor>();
		
		Vendedores.add(vendedor);
		
		vendedor = new Vendedor();
		vendedor.setCategoria('2');
		vendedor.setCodigo("0019");
		vendedor.setNome("MARIA DO SOCORRO");		
		
		Vendedores.add(vendedor);
		
	}
	
	protected void AdicionaUmaVendaAListaDeVendas(String data,String codigoVendedor, int qtdA, int qtdB, int qtdC){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Venda venda = new Venda();

		try{
			venda.setData(sdf.parse(data));
			venda.setCodigoVendedor(codigoVendedor);
			venda.setQuantidadePA(qtdA);
			venda.setQuantidadePB(qtdB);
			venda.setQuantidadePC(qtdC);
		}
		catch (ParseException ex){

		}

			Vendas.add(venda);
		
	}
	
}

