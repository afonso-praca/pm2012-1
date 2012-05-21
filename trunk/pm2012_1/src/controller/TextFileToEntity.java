/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Preco;
import model.Venda;
import model.Vendedor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TextFileToEntity {
	
	TextFileReader FileReader;
	
	List<String[]> ArquivoEmLista;
	
	SimpleDateFormat sdf;
	
	public TextFileToEntity(){
		
		FileReader = new TextFileReader();
		ArquivoEmLista = new ArrayList<String[]>();
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	}
	
	public List<Preco> ConverteArquivoPrecoParaEntidade(String caminho){
		
		ArquivoEmLista= FileReader.LeArquivoParaUmaLista(caminho);
		
		List<Preco> listaPrecosDoArquivo = new ArrayList<Preco>();
		
		for(String[] conteudoLinhaDoArquivo : ArquivoEmLista){
			
			Preco preco = new Preco();
			try {
				preco.setData(sdf.parse(conteudoLinhaDoArquivo[0]));
				preco.setPrecoPA(Double.parseDouble(conteudoLinhaDoArquivo[1].replace(",", ".")));
				preco.setPrecoPB(Double.parseDouble(conteudoLinhaDoArquivo[2].replace(",", ".")));
				preco.setPrecoPC(Double.parseDouble(conteudoLinhaDoArquivo[3].replace(",", ".")));
			} catch (ParseException e) {
				return null;
			}	
			
			listaPrecosDoArquivo.add(preco);			
		}
		
		return listaPrecosDoArquivo;
		
	}

	public List<Venda> ConverteArquivoVendaParaEntidade(String caminho){
			
		ArquivoEmLista= FileReader.LeArquivoParaUmaLista(caminho);
		
		List<Venda> listaVendasDoArquivo = new ArrayList<Venda>();
		
		for(String[] conteudoLinhaDoArquivo : ArquivoEmLista){
			
			Venda venda = new Venda();
			try {
				venda.setData(sdf.parse(conteudoLinhaDoArquivo[0]));
				venda.setCodigoVendedor(conteudoLinhaDoArquivo[1]);
				venda.setQuantidadePA(Integer.parseInt(conteudoLinhaDoArquivo[2]));
				venda.setQuantidadePB(Integer.parseInt(conteudoLinhaDoArquivo[3]));
				venda.setQuantidadePC(Integer.parseInt(conteudoLinhaDoArquivo[4]));
			} catch (ParseException e) {
				return null;
			}	
			
			listaVendasDoArquivo.add(venda);
			
		}
		
		return listaVendasDoArquivo;
		
	}
	
	public List<Vendedor> ConverteArquivoVendedorParaEntidade(String caminho){
	
		ArquivoEmLista= FileReader.LeArquivoParaUmaLista(caminho);
		
		List<Vendedor> listaVendasDoArquivo = new ArrayList<Vendedor>();
		
		for(String[] conteudoLinhaDoArquivo : ArquivoEmLista){
			
			Vendedor vendedor = new Vendedor();
			vendedor.setCodigo(conteudoLinhaDoArquivo[0]);
			vendedor.setNome(conteudoLinhaDoArquivo[1]);
			vendedor.setCategoria((conteudoLinhaDoArquivo[2].charAt(0)));	
			
			listaVendasDoArquivo.add(vendedor);
			
		}
		
		return listaVendasDoArquivo;
		
		
	}


}
