package model.xml;

import java.util.List;
import model.entity.Venda;

/**
 *
 * @author Afonso
 */

public class VendaXmlReader extends XMLToEntity<Venda> {
    
    private static VendaXmlReader instancia;
    
    /**
    * Singleton
    * 
    * @return uma instância da classe VendaXmlReader 
    * 
    */
    public static VendaXmlReader getInstance() {
        if (instancia == null) {
            instancia = new VendaXmlReader();
        }
        return instancia;
    }
    
   public List<Venda> LeArquivoParaUmaLista(String caminhoDeOrigemXML) {
		
        Venda[] vendas;
        Object obj_from_xml = ReadXML(caminhoDeOrigemXML);
        vendas = (Venda[])obj_from_xml;

        for (Venda v : vendas) {
            //System.out.println(v.toString());

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