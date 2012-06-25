/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import model.CalculaComissaoService;
import model.entity.Comissao;
import model.txt.TextFileReader;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculaComissaoServiceTest extends CalculaComissaoTesteBase {
	

    @Test
    public void DeveSerPossivelCalcularComissaoParaVendasDeCategoriaUm() {

        //ARRANGE			

        String mes="03";

        List<Comissao> comissoesDeCadaVendedor = new ArrayList<Comissao>();

        CalculaComissaoService calculador = new CalculaComissaoService();

        //ACT

        comissoesDeCadaVendedor = calculador.CalculaComissoes(mes,Vendas,Precos,Vendedores);

        //ASSERT
        assertNotNull(comissoesDeCadaVendedor);
        assertEquals(comissoesDeCadaVendedor.size(), 2);
        assertEquals(2300.00, comissoesDeCadaVendedor.get(0).getComissao(),0.0);
    }

    @Test
    public void DeveSerPossivelCalcularComissaoParaVendasDeCategoriaDois() {

        //ARRANGE			

        String mes="03";

        List<Comissao> comissoesDeCadaVendedor = new ArrayList<Comissao>();

        CalculaComissaoService calculador = new CalculaComissaoService();

        //ACT

        comissoesDeCadaVendedor = calculador.CalculaComissoes(mes,Vendas,Precos,Vendedores);

        //ASSERT
        assertNotNull(comissoesDeCadaVendedor);
        assertEquals(comissoesDeCadaVendedor.size(), 2);
        assertEquals(1860, comissoesDeCadaVendedor.get(1).getComissao(),0.0);
    }
    
    @Test
	public void calculaComissaoTest() {
		Controller controller = new Controller();
		try {
                        String path = new java.io.File(".").getCanonicalPath();//Localização da raiz do projeto na máquina que está rodando o programa
                        path=path.replaceAll("\\\\", "/");  
      
                        String caminhoDeOrigemVenda = (path+"/src/resources/vendas.txt"); 
                        String caminhoDeOrigemVendedor = (path+"/src/resources/vendedor.txt"); 
                        String caminhoDeOrigemPreco = (path+"/src/resources/preco.txt"); 
                        String caminhoDeOrigemSaida = (path+"/src/resources/saida.txt"); 
                        
                        controller.calculaComissoes("05", caminhoDeOrigemVenda, caminhoDeOrigemPreco, caminhoDeOrigemVendedor, caminhoDeOrigemSaida, "txt");
			
			BufferedReader saidaReader = new BufferedReader(new FileReader(caminhoDeOrigemSaida));
			
			String mes = "03";
			String codVend = "0020";
			String nomeVend = "MANOEL DA SILVA";
			String val1 = "2125.0";
			String val2 = "2585.0";
			String val3 = "7700.0";
			String val4 = "12410.0";
			String val5 = "2342.0";
						
			String linhaArquivo;		
			while (( linhaArquivo= saidaReader.readLine()) != null){	
				String[] arrayLinhaArquivo = linhaArquivo.split(";");
                                assertEquals(mes, arrayLinhaArquivo[0]);
				assertEquals(codVend, arrayLinhaArquivo[1]);
				assertEquals(nomeVend, arrayLinhaArquivo[2]);
				assertEquals(val1, arrayLinhaArquivo[3]);
				assertEquals(val2, arrayLinhaArquivo[4]);			
				assertEquals(val3, arrayLinhaArquivo[5]);
				assertEquals(val4, arrayLinhaArquivo[6]);
				assertEquals(val5, arrayLinhaArquivo[7]);
			}
			

		} catch (Exception e) {
			fail();
		}
   }
}
