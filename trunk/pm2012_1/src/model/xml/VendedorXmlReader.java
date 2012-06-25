package model.xml;

import java.util.List;
import model.entity.Vendedor;

/**
 *
 * @author Marina Vinhaes
 */

public class VendedorXmlReader extends XMLToEntity<Vendedor> {
    
     private static VendedorXmlReader instancia;
    
    /**
    * Singleton
    * 
    * @return uma instância da classe VendedorXmlReader 
    * 
    */
    public static VendedorXmlReader getInstance() {
        if (instancia == null) {
            instancia = new VendedorXmlReader();
        }
        return instancia;
    }
    
    public List<Vendedor> LeArquivoParaUmaLista(String caminhoDeOrigemXML) {
       
        Vendedor[] vendedores;
        Object obj_from_xml = ReadXML(caminhoDeOrigemXML);
        vendedores = (Vendedor[])obj_from_xml;

        for (Vendedor v : vendedores) {
            //System.out.println(v.toString());
            
            Vendedor v2 = new Vendedor();
            v2.setCategoria(v.getCategoria());
            v2.setCodigo(v.getCodigo());
            v2.setNome(v.getNome());

            listaXML.add(v2);        
        }

        return listaXML;
    }
}