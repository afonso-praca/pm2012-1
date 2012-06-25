/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.entity.Preco;

/**
 *
 * @author Afonso
 */
public class PrecosXMLWriter {
    
    private static SimpleDateFormat sdf;
    
    public static void EscreveXml() throws ParseException{
        
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Preco[] precos = new Preco[3];
        precos[0] = new Preco(sdf.parse("03/02/2012"), 10, 11, 12);
        precos[1] = new Preco(sdf.parse("10/03/2012"), 10, 8.23, 2.2);
        precos[2] = new Preco(sdf.parse("11/03/2012"), 10, 12, 14);
        
        XMLEncoder writer = null;
        
        try {
            try {
                writer = new XMLEncoder(
                        new FileOutputStream("src/resources/precos.xml"));
                writer.writeObject(precos);
            } finally {
                if (writer != null)
                    writer.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       
}
