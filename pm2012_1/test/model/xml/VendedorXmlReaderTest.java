package model.xml;

import java.io.IOException;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Taís
 */
public class VendedorXmlReaderTest {

    
    @Test
    public void testLeArquivoVendedoresParaUmaLista() throws IOException {
        System.out.println("Testar se Arquivo de Vendedores válido no formato XML está sendo lido para uma lista");
        
        String path = new java.io.File(".").getCanonicalPath();//Localização da raiz do projeto na máquina que está rodando o programa
        path=path.replaceAll("\\\\", "/");  
        
        String caminhoDeOrigemXML = (path+"/src/resources/vendedores.xml");
        
        VendedorXmlReader vendedorXmlReader = new VendedorXmlReader();
        List result = vendedorXmlReader.LeArquivoParaUmaLista(caminhoDeOrigemXML);
        assertNotNull(result);
    }
}
