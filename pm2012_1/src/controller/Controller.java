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

public class Controller {
    
        public static TextFileToEntity LeitorDeArquivo;
	public static EntityToTextFile EscritorDeArquivo;
	public static CalculaComissaoService CalculadorDeComissaoService;
	
	public static List<Venda> Vendas;
	public static List<Preco> Precos;
	public static List<Vendedor> Vendedores;
	public static List<Comissao> Comissoes;

	public Controller(){
		LeitorDeArquivo = new TextFileToEntity();
		EscritorDeArquivo = new EntityToTextFile();
		CalculadorDeComissaoService = new CalculaComissaoService();
	}
	
	public static void calculaComissoes(String mes, String vendasPath,
			String precosPath, String vendedoresPath, String saidaPath) throws Exception {
		
		try{
		Vendas = LeitorDeArquivo.ConverteArquivoVendaParaEntidade(vendasPath);
		Precos = LeitorDeArquivo.ConverteArquivoPrecoParaEntidade(precosPath);
		Vendedores = LeitorDeArquivo.ConverteArquivoVendedorParaEntidade(vendedoresPath);
		
		if (Vendas!= null && Precos!= null && Vendedores!= null){
		
			Comissoes=CalculadorDeComissaoService.CalculaComissoes(mes, Vendas, Precos, Vendedores);
		
		}else {
			throw new Exception("Um erro ocoreu na leitua dos arquivos.");
		}
		
		
		if (Comissoes != null){
			EscritorDeArquivo.ConverteComissaoParaArquivo(Comissoes, saidaPath);		
		}
		else{
			
			throw new Exception("Um erro ocorreu no calculo de Comissão.");
		}
		}
		catch(Exception e){
			throw e;
		}
	}

	
	
	
}

