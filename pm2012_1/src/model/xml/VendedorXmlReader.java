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
    
    public static List<Vendedor> LeArquivoParaUmaLista(String caminhoDeOrigemXML){
		
        List<Vendedor> listaXML = null;
        XMLDecoder reader = null;
       
        System.out.println("VendedorXmlReader");
        
        try {
            try {
                reader = new XMLDecoder(
                        new FileInputStream(caminhoDeOrigemXML));
                
                Vendedor[] vendedores;
                listaXML = new ArrayList<Vendedor>();
                
                vendedores = (Vendedor[])reader.readObject();
                
                for (Vendedor v : vendedores) {
                    System.out.println(v.getCodigo());
                    System.out.println(v.getNome());
                    System.out.println(v.getCategoria());
                    
                    Vendedor vendedor = new Vendedor();
                    vendedor.setCategoria(v.getCategoria());
                    vendedor.setCodigo(v.getCodigo());
                    vendedor.setNome(v.getNome());
                    
                    listaXML.add(vendedor);        
                }
                
                return listaXML;
                    
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
