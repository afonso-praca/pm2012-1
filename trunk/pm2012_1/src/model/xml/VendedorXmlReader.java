/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.xml;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import model.entity.Vendedor;

/**
 *
 * @author Marina Vinhaes
 */
public class VendedorXmlReader {
    public List<Vendedor> LeArquivoParaUmaLista(String caminhoDeOrigemXML){
		
        try {

            XMLDecoder vendasReaderxml = new XMLDecoder(new FileInputStream(caminhoDeOrigemXML));


            List<Vendedor> listaXML = (ArrayList<Vendedor>) vendasReaderxml.readObject();

                    for (Vendedor v : listaXML) {
                    System.out.println(v.getCodigo());
                    System.out.println(v.getNome());
                    System.out.println(v.getCategoria());
                    
                    }
                    
                    List<Vendedor> arquivoEmListaXML = new ArrayList<Vendedor>();
                    arquivoEmListaXML.addAll(listaXML);			
                   
                    return listaXML;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
		 
    }
}
