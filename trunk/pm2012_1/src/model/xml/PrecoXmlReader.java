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
		
        List<Preco> listaXML_preco = null;
        XMLDecoder reader = null;
       
        System.out.println("VendedorXmlReader");
        
        try {
            try {
                reader = new XMLDecoder(
                        new FileInputStream(caminhoDeOrigemXML));
                
                Preco[] precos;
                
                listaXML_preco = new ArrayList<Preco>();
                
                precos = (Preco[])reader.readObject();
                
                for (Preco p : precos) {
                    System.out.println(p.getData());
                    System.out.println(p.getPrecoPA());
                    System.out.println(p.getPrecoPB());
                    System.out.println(p.getPrecoPC());
                    
                    Preco p2 = new Preco();
                    p2.setData(p.getData());
                    p2.setPrecoPA(p.getPrecoPA());
                    p2.setPrecoPB(p.getPrecoPB());
                    p2.setPrecoPC(p.getPrecoPC());
                    
                    
                    listaXML_preco.add(p2);        
                }
                
                return listaXML_preco;
                    
         } finally {
               if (reader != null)
                   reader.close();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        } 
    }
    
}
