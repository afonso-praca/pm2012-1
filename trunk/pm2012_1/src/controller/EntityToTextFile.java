/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Taís
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import model.Comissao;

public class EntityToTextFile {
		
	
	public void ConverteComissaoParaArquivo(List<Comissao> comissoes, String caminhoParaEscrever){
		
		try {
			
			BufferedWriter out = new BufferedWriter(new FileWriter(caminhoParaEscrever));
	       
			for (Comissao _comissao: comissoes){
				
				StringBuilder linhaDoArquivo = new StringBuilder();
				
				linhaDoArquivo.append(_comissao.getMes()).append(";");
				linhaDoArquivo.append(_comissao.getVendedor().getCodigo()).append(";");
				linhaDoArquivo.append(_comissao.getVendedor().getNome()).append(";");
				linhaDoArquivo.append(_comissao.getTotalVendidoProdutoA()).append(";");
				linhaDoArquivo.append(_comissao.getTotalVendidoProdutoB()).append(";");
				linhaDoArquivo.append(_comissao.getTotalVendidoProdutoC()).append(";");
				linhaDoArquivo.append(_comissao.getTotal()).append(";");
				linhaDoArquivo.append(_comissao.getComissao()).append(";");
				
				out.write(linhaDoArquivo.toString());
				out.write("\n");
			}
			
			 out.close();						
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}

