package model.xml;

import java.util.List;
import model.entity.Venda;

/**
 *
 * @author Afonso
 */

public class VendaXmlReader extends XMLToEntity<Venda> {
    
   public List<Venda> LeArquivoParaUmaLista(String caminhoDeOrigemXML) {
		
        Venda[] vendas;
        Object obj_from_xml = ReadXML(caminhoDeOrigemXML);
        vendas = (Venda[])obj_from_xml;

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

            listaXML.add(v2);
        }
                
        return listaXML;
    }
}