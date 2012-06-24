/*
 * Classe controladora da aplicação
 * TODO -> receber por parâmetro as referencias a leitores e escritores
 */

package controller;

import java.util.EventListener;
import java.util.List;
import model.CalculaComissaoService;
import model.EntityToTextFile;
import model.entity.Comissao;
import model.entity.Preco;
import model.entity.Venda;
import model.entity.Vendedor;
import model.txt.PrecoToEntity;
import model.txt.VendaToEntity;
import model.txt.VendedorToEntity;
import model.xml.PrecoXmlReader;
import model.xml.VendaXmlReader;
import model.xml.VendedorXmlReader;

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

            // seleciona o tipo de leitura a ser feito (XML ou CSV)
            if (tipo_arquivo_origem.equalsIgnoreCase("txt"))
            {
                Vendas = VendaToEntity.getInstance().ConverteArquivoDoModelo(vendasPath);
                Precos = PrecoToEntity.getInstance().ConverteArquivoDoModelo(precosPath);
                Vendedores = VendedorToEntity.getInstance().ConverteArquivoDoModelo(vendedoresPath);
            } else if (tipo_arquivo_origem.equalsIgnoreCase("xml")) {
                Vendedores = VendedorXmlReader.LeArquivoParaUmaLista(vendedoresPath);
                Vendas = VendaXmlReader.LeArquivoParaUmaLista(vendasPath);
                Precos = PrecoXmlReader.LeArquivoParaUmaLista(precosPath);
            }

            // Verifica os retornos e chama o calculo
            if (Vendas != null && Precos != null && Vendedores != null){
                Comissoes = CalculadorDeComissaoService.CalculaComissoes(mes, Vendas, Precos, Vendedores);
            } else {
                throw new Exception("Um erro ocoreu na leitua dos arquivos.");
            }

            // Escreve a resposta em arquivo TXT
            if (Comissoes != null){
                EscritorDeArquivo.ConverteComissaoParaArquivo(Comissoes, saidaPath);
            } else {
                throw new Exception("Um erro ocorreu no calculo de Comissão.");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}