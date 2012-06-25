package model.xml;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Afonso
 */

public abstract class XMLToEntity<T> {
    
    List<T> listaXML = null;
    XMLDecoder reader = null;
    
    public XMLToEntity(){
        listaXML = new ArrayList<T>();
    }
    
    public Object ReadXML(String caminhoDeOrigemXML){
        
         try {
            try {
                reader = new XMLDecoder(
                        new FileInputStream(caminhoDeOrigemXML));
                
                T[] obj_from_xml;
                obj_from_xml = (T[])reader.readObject();
                return obj_from_xml;
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
