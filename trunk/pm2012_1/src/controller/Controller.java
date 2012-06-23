/*
 * Classe controladora da aplicação
 * TODO -> receber por parâmetro as referencias a leitores e escritores
 */
package controller;

import java.util.EventListener;
import java.util.List;
import model.*;
import model.entity.Comissao;
import model.entity.Preco;
import model.entity.Venda;
import model.entity.Vendedor;

public class Controller {
        
	public static EntityToTextFile EscritorDeArquivo;
	public static CalculaComissaoService CalculadorDeComissaoService;
	
	public static List<Venda> Vendas;
	public static List<Preco> Precos;
	public static List<Vendedor> Vendedores;
	public static List<Comissao> Comissoes;
        
        public EventListener listener;

	public Controller(){
                EscritorDeArquivo = new EntityToTextFile();
		CalculadorDeComissaoService = new CalculaComissaoService();
	}
	
	public void calculaComissoes(String mes, String vendasPath,
            String precosPath, String vendedoresPath, String saidaPath, String tipo_arquivo_origem) throws Exception {
            
            System.out.println(tipo_arquivo_origem);
            
		try {
                    Vendas = VendaToEntity.getInstance().ConverteArquivoDoModelo(vendasPath);
                    Precos = PrecoToEntity.getInstance().ConverteArquivoDoModelo(precosPath);
                    Vendedores = VendedorToEntity.getInstance().ConverteArquivoDoModelo(vendedoresPath);
		
                    if (Vendas != null && Precos != null && Vendedores != null){
                        Comissoes = CalculadorDeComissaoService.CalculaComissoes(mes, Vendas, Precos, Vendedores);
                    } else {
                        throw new Exception("Um erro ocoreu na leitua dos arquivos.");
                    }
		
                    if (Comissoes != null){
                        EscritorDeArquivo.ConverteComissaoParaArquivo(Comissoes, saidaPath);
                    }
                    else {
                        throw new Exception("Um erro ocorreu no calculo de Comissão.");
                    }
		}
		catch(Exception e){
                    System.out.println(e.getMessage());
                    throw e;
		}
	}
}


