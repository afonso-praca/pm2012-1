/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.xml;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import model.entity.Preco;

/**
 *
 * @author Marina Vinhaes
 */
public class PrecoXmlReader {
     public static List<Preco> LeArquivoParaUmaLista(String caminhoDeOrigemXML){
		
        try {

            XMLDecoder vendasReaderxml = new XMLDecoder(new FileInputStream(caminhoDeOrigemXML));


            List<Preco> listaXML = (ArrayList<Preco>) vendasReaderxml.readObject();

                    for (Preco p : listaXML) {
                    System.out.println(p.getData());
                    System.out.println(p.getPrecoPA());
                    System.out.println(p.getPrecoPB());
                    System.out.println(p.getPrecoPC());
                    
                    }
                    
                    List<Preco> arquivoEmListaXML = new ArrayList<Preco>();
                    arquivoEmListaXML.addAll(listaXML);			
                   
                    return listaXML;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
		 
    }
    
}
