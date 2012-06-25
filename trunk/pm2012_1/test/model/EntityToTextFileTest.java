/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.List;
import model.entity.Comissao;
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
public class EntityToTextFileTest {
    
    public EntityToTextFileTest() {
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
     * Test of ConverteComissaoParaArquivo method, of class EntityToTextFile.
     */
    @Test
    public void GravaArquivodeComissão() throws IOException {
        System.out.println("Testar se aceita caminho passado para gravação do arquivo");
        List<Comissao> comissoes = null;
        String path = new java.io.File(".").getCanonicalPath();//Localização da raiz do projeto na máquina que está rodando o programa
        path=path.replaceAll("\\\\", "/");  
       
        
        
        String caminhoParaEscrever = (path+"/src/resources");
        EntityToTextFile instance = new EntityToTextFile();
        instance.ConverteComissaoParaArquivo(comissoes, caminhoParaEscrever);

    }
}
