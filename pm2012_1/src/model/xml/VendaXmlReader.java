/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.xml;

import java.beans.XMLDecoder;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import model.entity.Venda;
import model.entity.Vendedor;

/**
 *
 * @author labccet
 */
public class VendaXmlReader {
   public static List<Venda> LeArquivoParaUmaLista(String caminhoDeOrigemXML){
		
        List<Venda> listaXML_venda = null;
        XMLDecoder reader = null;
       
        System.out.println("VendedorXmlReader");
        
        try {
            try {
                reader = new XMLDecoder(
                        new FileInputStream(caminhoDeOrigemXML));
                
                Venda[] vendas;
                listaXML_venda = new ArrayList<Venda>();
                
                vendas = (Venda[])reader.readObject();
                
                for (Venda v : vendas) {
                    System.out.println(v.getData());
                    System.out.println(v.getCodigoVendedor());
                    System.out.println(v.getQuantidadePA());
                    System.out.println(v.getQuantidadePB());
                    System.out.println(v.getQuantidadePC());
                    
                    Venda v2 = new Venda();
                    v2.setData(v.getData());
                    v2.setCodigoVendedor(v.getCodigoVendedor());
                    v2.setQuantidadePA(v.getQuantidadePA());
                    v2.setQuantidadePB(v.getQuantidadePB());
                    v2.setQuantidadePC(v.getQuantidadePC());
                            
                    
                    listaXML_venda.add(v2);        
                }
                
                return listaXML_venda;
                    
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