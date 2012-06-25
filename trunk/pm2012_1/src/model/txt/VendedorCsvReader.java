/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.txt;

import java.util.ArrayList;
import java.util.List;
import model.entity.Vendedor;

/**
 *
 * @author Afonso
 */
public class VendedorCsvReader extends CSVToEntity<Vendedor> {
    
    private static VendedorCsvReader instancia;
    
    /**
    * Singleton
    * 
    * @return uma instância da classe VendedorCsvReader 
    * 
    */
    public static VendedorCsvReader getInstance() {
        if (instancia == null) {
            instancia = new VendedorCsvReader();
        }
        return instancia;
    }
    
    public List<Vendedor> ConverteArquivoDoModelo(String caminho){
        ConverteArquivo(caminho);
        List<Vendedor> listaVendedoresDoArquivo = new ArrayList<Vendedor>();

        for(String[] conteudoLinhaDoArquivo : ArquivoEmLista){

            Vendedor vendedor = new Vendedor();
            try {
                vendedor.setCodigo(conteudoLinhaDoArquivo[0]);
                vendedor.setNome(conteudoLinhaDoArquivo[1]);
                vendedor.setCategoria((conteudoLinhaDoArquivo[2].charAt(0)));
            }catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }

            listaVendedoresDoArquivo.add(vendedor);

        }

        return listaVendedoresDoArquivo;	
    }
}
