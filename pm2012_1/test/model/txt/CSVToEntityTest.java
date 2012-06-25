/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.txt;

import java.io.IOException;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Taís
 */
public class CSVToEntityTest {
   
    @Test
    public void testConverteArquivoVazio() {
        System.out.println("Testando se arquivo vazio irá retornar uma lista nula");
        String caminho = "";
        CSVToEntity instance = new CSVToEntityImpl();//CSVToEntity é abstrato não pode ser instanciado, por isso é necessário outro tipo.
        List expResult = null;
        List result = instance.ConverteArquivo(caminho);
        assertEquals(expResult, result);

    }
    
        @Test
    public void testConverteArquivoVálido() throws IOException {
        System.out.println("Testando se arquivo válido será aceito e convertido com sucesso, criando lista não nula");
        String path = new java.io.File(".").getCanonicalPath();//Localização da raiz do projeto na máquina que está rodando o programa
        path=path.replaceAll("\\\\", "/");  
        
        String caminho = (path+"/src/resources/precos.txt");
        CSVToEntity instance = new CSVToEntityImpl();//CSVToEntity é abstrato não pode ser instanciado, por isso é necessário outro tipo.

        List result = instance.ConverteArquivo(caminho);
        assertNotNull(result);

    }

    public class CSVToEntityImpl extends CSVToEntity {
    }
}



