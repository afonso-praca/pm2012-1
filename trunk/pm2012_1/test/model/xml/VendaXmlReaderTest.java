/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.xml;

import java.io.IOException;
import model.entity.Venda;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Taís
 */
public class VendaXmlReaderTest {
    
    public VendaXmlReaderTest() {
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
     * Test of LeArquivoParaUmaLista method, of class VendaXmlReader.
     */
    
       @Test
    public void testLeArquivoVendaXMLParaUmaLista() throws IOException {
        System.out.println("Testar se Arquivo Venda válido no formato XML está sendo lido para uma lista");
        
        String path = new java.io.File(".").getCanonicalPath();//Localização da raiz do projeto na máquina que está rodando o programa
        path=path.replaceAll("\\\\", "/");  
       
        
        String caminhoDeOrigemXML = (path+"/src/resources/vendas.xml");
      
        List<Venda> result = VendaXmlReader.LeArquivoParaUmaLista(caminhoDeOrigemXML);
        
        assertNotNull(result);
    }
}
