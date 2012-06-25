/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.txt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.entity.Venda;

/**
 *
 * @author Afonso
 */
public class VendaCsvReader extends CSVToEntity<Venda> {
    
    private static VendaCsvReader instancia;
    
    public VendaCsvReader(){
        sdf = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    /**
    * Singleton
    * 
    * @return uma instância da classe VendaCsvReader 
    * 
    */
    public static VendaCsvReader getInstance() {
        if (instancia == null) {
            instancia = new VendaCsvReader();
        }
        return instancia;
    }
    
    public List<Venda> ConverteArquivoDoModelo(String caminho){
        ConverteArquivo(caminho);
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
                System.out.println(e.getMessage());
                return null;
            }
            
            listaVendasDoArquivo.add(venda);
        }
        
        return listaVendasDoArquivo;
    }
    
}
