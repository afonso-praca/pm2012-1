/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.XMLDecoder;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import model.entity.Venda;

/**
 *
 * @author labccet
 */
public class TextXmlReader {
    public List<Venda> LeArquivoParaUmaLista(String caminhoDeOrigemXML){
		
        try {

            XMLDecoder vendasReaderxml = new XMLDecoder(new FileInputStream(caminhoDeOrigemXML));


            List<Venda> listaXML = (ArrayList<Venda>) vendasReaderxml.readObject();

                    for (Venda v : listaXML) {
                    System.out.println(v.getData());
                    System.out.println(v.getCodigoVendedor());
                    System.out.println(v.getQuantidadePA());
                    System.out.println(v.getQuantidadePB());
                    System.out.println(v.getQuantidadePC());
                    
                    }
                    
                    List<Venda> arquivoEmListaXML = new ArrayList<Venda>();
                    arquivoEmListaXML.addAll(listaXML);			
                    
                    System.out.println("Lista Vendas" + arquivoEmListaXML);
                    return listaXML;

        } catch (Exception e) {
            return null;
        }
		 
    }
    
}