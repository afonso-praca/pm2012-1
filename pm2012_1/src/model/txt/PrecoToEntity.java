/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.txt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.entity.Preco;

/**
 *
 * @author Afonso
 */
public class PrecoToEntity extends CSVToEntity<Preco> {
    
    private static PrecoToEntity instancia;
    
    public PrecoToEntity(){
        sdf = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    /**
    * Singleton
    * 
    * @return uma instância da classe PrecoToEntity 
    * 
    */
    public static PrecoToEntity getInstance() {
        if (instancia == null) {
            instancia = new PrecoToEntity();
        }
        return instancia;
    }
    
    public List<Preco> ConverteArquivoDoModelo(String caminho){
        ConverteArquivo(caminho);
        List<Preco> listaPrecosDoArquivo = new ArrayList<Preco>();

        for(String[] conteudoLinhaDoArquivo : ArquivoEmLista){

                Preco preco = new Preco();
                try {
                    preco.setData(sdf.parse(conteudoLinhaDoArquivo[0]));
                    preco.setPrecoPA(Double.parseDouble(conteudoLinhaDoArquivo[1].replace(",", ".")));
                    preco.setPrecoPB(Double.parseDouble(conteudoLinhaDoArquivo[2].replace(",", ".")));
                    preco.setPrecoPC(Double.parseDouble(conteudoLinhaDoArquivo[3].replace(",", ".")));
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                    return null;
                }	

                listaPrecosDoArquivo.add(preco);			
        }
        
        return listaPrecosDoArquivo;
    }
}
