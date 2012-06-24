/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import model.entity.Vendedor;

/**
 *
 * @author Afonso
 */
public class VendedoresXMLWriter {
    
    public static void EscrevePreco(){
        
        Vendedor[] vendedores = null;
        vendedores[0] = new Vendedor("01", "afonso", '1');
        vendedores[1] = new Vendedor("02", "pc", '2');
        vendedores[2] = new Vendedor("03", "tais", '1');
        vendedores[3] = new Vendedor("04", "marina", '1');
        
        XMLEncoder writer = null;
        
        try {
            try {
                writer = new XMLEncoder(
                        new FileOutputStream("objs.xml"));
                writer.writeObject(vendedores);
            } finally {
                if (writer != null)
                    writer.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       
}
