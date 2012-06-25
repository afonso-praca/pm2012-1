package model.xml;

import java.io.IOException;
import java.util.List;
import model.entity.Preco;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

/**
 *
 * @author Taís
 */

public class PrecoXmlReaderTest {

    
    public PrecoXmlReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of LeArquivoParaUmaLista method, of class PrecoXmlReader.
     */
    @Test
    public void testLeArquivoPrecoXMLParaUmaLista() throws IOException {
        System.out.println("Testar se Arquivo Preço válido no formato XML está sendo lido para uma lista");
        
        String path = new java.io.File(".").getCanonicalPath(); //Localização da raiz do projeto na máquina que está rodando o programa
        path=path.replaceAll("\\\\", "/");  
        
        String caminhoDeOrigemXML = (path+"/src/resources/precos.xml");
      
        PrecoXmlReader precoXmlReader = new PrecoXmlReader();
        List<Preco> result = precoXmlReader.LeArquivoParaUmaLista(caminhoDeOrigemXML);
        
        assertNotNull(result);
    }
}
