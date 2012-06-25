package model.xml;

import java.util.List;
import model.entity.Vendedor;

/**
 *
 * @author Marina Vinhaes
 */

public class VendedorXmlReader extends XMLToEntity<Vendedor> {
    
    public List<Vendedor> LeArquivoParaUmaLista(String caminhoDeOrigemXML) {
       
        Vendedor[] vendedores;
        Object obj_from_xml = ReadXML(caminhoDeOrigemXML);
        vendedores = (Vendedor[])obj_from_xml;

        for (Vendedor v : vendedores) {
            System.out.println(v.getCodigo());
            System.out.println(v.getNome());
            System.out.println(v.getCategoria());

            Vendedor v2 = new Vendedor();
            v2.setCategoria(v.getCategoria());
            v2.setCodigo(v.getCodigo());
            v2.setNome(v.getNome());

            listaXML.add(v2);        
        }

        return listaXML;
    }
}