package model.xml;

import java.util.List;
import model.entity.Preco;

/**
 *
 * @author Marina Vinhaes
 */

public class PrecoXmlReader extends XMLToEntity<Preco> {
    
    public List<Preco> LeArquivoParaUmaLista(String caminhoDeOrigemXML){
        
        Preco[] precos;
        Object obj_from_xml = ReadXML(caminhoDeOrigemXML);
        precos = (Preco[])obj_from_xml;

        for (Preco p : precos) {
            //System.out.println(p.toString());

            Preco p2 = new Preco();
            p2.setData(p.getData());
            p2.setPrecoPA(p.getPrecoPA());
            p2.setPrecoPB(p.getPrecoPB());
            p2.setPrecoPC(p.getPrecoPC());

            listaXML.add(p2);        
        }

        return listaXML;
    }
}
