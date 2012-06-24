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
public class TextFileReaderTest {
    
    
    
    @Test
    /** Testa a reação do sistema  ao informar um caminho de arquivo vazio. 
     O resultado Esperado é criar uma lista vazia*/
    public void testLerCaminhoVazio() { 
        System.out.println("Objetivo do teste: Caminho de Arquivo Vazio,cria uma Lista Vazia.");
        String caminhoDeOrigem = ""; 
        TextFileReader instance = new TextFileReader();
        List expResult = null;
        List result = instance.LeArquivoParaUmaLista(caminhoDeOrigem);
        assertEquals(expResult, result);
    
    }
    
    @Test
    /** Testa a reação do sistema  ao fornecer um caminho de arquivo. 
     O resultado Esperado é criar uma lista não vazia */
    public void testLerCaminhoArquivo() throws IOException { 
        System.out.println("Objetivo do teste:Criar uma Lista não vazia.");
        String path = new java.io.File(".").getCanonicalPath();//Localização da raiz do projeto na máquina que está rodando o programa
        path=path.replaceAll("\\\\", "/");  
      
        String caminhoDeOrigem = (path+"/src/resources/vendas.txt"); 
        TextFileReader instance = new TextFileReader();
        List result = instance.LeArquivoParaUmaLista(caminhoDeOrigem);
        assertNotNull(result);

    
    }

}


