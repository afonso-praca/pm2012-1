/*
 * Classe que lê um arquivo CSV e retorna uma lista de Strings[]
 */

package model.txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {

	public List<String[]> LeArquivoParaUmaLista(String caminhoDeOrigem){
		
		List<String[]> arquivoEmLista = new ArrayList<String[]>();
		
		 try {
						 
			BufferedReader vendasReader = new BufferedReader(new FileReader(caminhoDeOrigem));
			
			String linhaArquivo;
			
			while (( linhaArquivo= vendasReader.readLine()) != null){
				
				String[] arrayLinhaArquivo = linhaArquivo.split(";");
				
				arquivoEmLista.add(arrayLinhaArquivo);				
			}
			
			return arquivoEmLista;
			
		} catch (Exception e) {
			return null;
		}
		 
	}
}
