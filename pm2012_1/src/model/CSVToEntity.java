package model;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * classe genérica da aplicação.
 * Todos os leitores devem estendê-la informando o seu tipo <T>
 * 
 * P.ex.: public class VendaToEntity extends CSVToEntity<Venda>
 *
 * @param <T> 
 * @author Afonso
 *
 */
public abstract class CSVToEntity<T> {
    
    TextFileReader FileReader;
    List<String[]> ArquivoEmLista;
    SimpleDateFormat sdf;
    
    public CSVToEntity(){
        FileReader = new TextFileReader();
        ArquivoEmLista = new ArrayList<String[]>();
    }
    
    public List<String[]> ConverteArquivo(String caminho){
        ArquivoEmLista = FileReader.LeArquivoParaUmaLista(caminho);
        //List<T> listaPrecosDoArquivo = new ArrayList<T>();
        return ArquivoEmLista;	
    }
        
}
