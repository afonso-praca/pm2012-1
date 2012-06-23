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

        Vendas = new ArrayList<Venda>();

        AdicionaUmaVendaAListaDeVendas("10/03/2011", "0020", 10, 30, 50);
        AdicionaUmaVendaAListaDeVendas("10/03/2011","0019",15,35,55);
        AdicionaUmaVendaAListaDeVendas("11/03/2011","0020",40,20,60);		

        Precos = new ArrayList<Preco>();

        AdicionaUmPrecoAListaDePrecos("10/02/2011", 40.00, 50.00, 70.00);
        AdicionaUmPrecoAListaDePrecos("20/05/2011", 20.00, 35.00, 80.00);

        Vendedores = new ArrayList<Vendedor>();

        AdicionaUmVendedorAListaDeVendedores('1', "0020", "MANOEL DA SILVA");
        AdicionaUmVendedorAListaDeVendedores('2', "0019", "MARIA DO SOCORRO");
    }
	
    protected void AdicionaUmaVendaAListaDeVendas(String data,String codigoVendedor, int qtdA, int qtdB, int qtdC){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Venda venda = new Venda();
        
        try {
            venda.setData(sdf.parse(data));
            venda.setCodigoVendedor(codigoVendedor);
            venda.setQuantidadePA(qtdA);
            venda.setQuantidadePB(qtdB);
            venda.setQuantidadePC(qtdC);
        }
        catch (ParseException e){
            System.out.println(e.getMessage());
        }
        
        Vendas.add(venda);
    }
    
    protected void AdicionaUmPrecoAListaDePrecos(String data, double precoPA, double precoPB, double precoPC){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Preco preco = new Preco();
        
        try {
            preco.setData(sdf.parse(data));
            preco.setPrecoPA(precoPA);
            preco.setPrecoPB(precoPB);
            preco.setPrecoPC(precoPC);
        }
        catch (ParseException e){
            System.out.println(e.getMessage());
        }
        
        Precos.add(preco);
    }
    
    protected void AdicionaUmVendedorAListaDeVendedores(char categoria, String codigo, String nome){
        
        Vendedor vendedor = new Vendedor();
        
        try {
            vendedor.setCategoria(categoria);
            vendedor.setCodigo(codigo);
            vendedor.setNome(nome);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }	

        Vendedores.add(vendedor);
    }	
}

