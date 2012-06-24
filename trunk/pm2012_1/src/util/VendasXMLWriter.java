/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.entity.Venda;

/**
 *
 * @author Afonso
 */
public class VendasXMLWriter {
    
    private static SimpleDateFormat sdf;
    
    public static void EscreveXml() throws ParseException{
        
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Venda[] vendas =  new Venda[3];
        vendas[0] = new Venda(sdf.parse("10/03/2012"), "01", 1, 2, 3);
        vendas[1] = new Venda(sdf.parse("11/03/2012"), "01", 2, 2, 3);
        vendas[2] = new Venda(sdf.parse("12/03/2012"), "02", 1, 2, 3);
        
        XMLEncoder writer = null;
        
        try {
            try {
                writer = new XMLEncoder(
                        new FileOutputStream("src/resources/vendas.xml"));
                writer.writeObject(vendas);
            } finally {
                if (writer != null)
                    writer.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
