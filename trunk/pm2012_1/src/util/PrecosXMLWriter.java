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
        
        Preco[] precos = new Preco[2];
        precos[0] = new Preco(sdf.parse("10/02/2011"), 40.00, 50.00, 70.00);
        precos[1] = new Preco(sdf.parse("05/03/2011"), 42.50, 51.70, 70.00);
        
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
