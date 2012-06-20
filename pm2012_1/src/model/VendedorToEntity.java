/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import model.entity.Vendedor;

/**
 *
 * @author labccet
 */
public class VendedorToEntity extends CSVToEntity<Vendedor> {
    
    public VendedorToEntity(){
        
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
